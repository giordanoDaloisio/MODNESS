import argparse
import os
import pickle
from copy import deepcopy
from utils import *
from model_trainer import ModelTrainer
from datetime import datetime
from methods import FairnessMethods
from sklearn.linear_model import LogisticRegression
from sklearn.pipeline import Pipeline
from sklearn.preprocessing import StandardScaler

base_metrics = {
    'stat_par': [],
    'acc': [],
    'hmean': [],
}

def _store_metrics(metrics, method, fairness, save_data, save_model, model_fair):
    df_metrics = pd.DataFrame(metrics)
    df_metrics = df_metrics.explode(list(df_metrics.columns))
    df_metrics['model'] = method
    df_metrics['fairness_method'] = fairness
    if save_data:
        os.makedirs('ris', exist_ok=True)
        df_metrics.to_csv(os.path.join(
            'ris', f'ris_{method}_{fairness}.csv'))
    if save_model:
        os.makedirs('ris', exist_ok=True)
        pickle.dump(model_fair, open(os.path.join(
            'ris', f'{method}_{fairness}_partial.pickle'), 'wb'))
    return df_metrics



def exec(data):
    label = 'gpa'
    positive_label = 2
    
    unpriv_group = { 'sex': 0 }
    priv_group = { 'sex': 1 }
    sensitive_features = ['sex']

    save_data =  False 
    save_model =  False     
    ml_methods = {
        'logreg': LogisticRegression(),
    }

    fairness_methods = {
        'no_method': FairnessMethods.NO_ONE,
    }


    agg_metric = 'hmean' 




    dataset_label =  'binary' 
    ris = pd.DataFrame()
    for m in ml_methods.keys():
        model = Pipeline([
            ('scaler', StandardScaler()),
            ('classifier', ml_methods[m])
        ])

        for f in fairness_methods.keys():
            model = deepcopy(model)
            data = data.copy()
            if f == 'preprocessing':
                for method in fairness_methods[f]:
                    metrics = deepcopy(base_metrics)
                    model_fair, ris_metrics = cross_val(classifier=model, data=data, unpriv_group=unpriv_group, priv_group=priv_group, label=label, metrics=metrics, positive_label=positive_label, sensitive_features=sensitive_features, preprocessor=method, n_splits=10)
                    df_metrics = _store_metrics(ris_metrics, m, method.name, save_data, save_model, model_fair)
                    ris = ris.append(df_metrics)
            elif f == 'inprocessing':
                for method in fairness_methods[f]:
                    metrics = deepcopy(base_metrics)
                    model_fair, ris_metrics = cross_val(classifier=model, data=data, unpriv_group=unpriv_group, priv_group=priv_group, label=label, metrics=metrics, positive_label=positive_label, sensitive_features=sensitive_features, inprocessor=method, n_splits=10)
                    df_metrics = _store_metrics(
                        ris_metrics, m, method.name, save_data, save_model, model_fair)
                    ris = ris.append(df_metrics)
            elif f == 'postprocessing':
                for method in fairness_methods[f]:
                    metrics = deepcopy(base_metrics)
                    model_fair, ris_metrics = cross_val(classifier=model, data=data, unpriv_group=unpriv_group, priv_group=priv_group, label=label, metrics=metrics, positive_label=positive_label,sensitive_features=sensitive_features, postprocessor=method, n_splits=10)
                    df_metrics = _store_metrics(ris_metrics, m, method.name, save_data, save_model, model_fair)
                    ris = ris.append(df_metrics)
            else:
                metrics = deepcopy(base_metrics)
                model_fair, ris_metrics = cross_val(classifier=model, data=data, unpriv_group=unpriv_group, priv_group=priv_group, label=label, metrics=metrics, positive_label=positive_label,sensitive_features=sensitive_features, n_splits=10)
                df_metrics = _store_metrics(ris_metrics, m, FairnessMethods.NO_ONE.name, save_data, save_model, model_fair)
                ris = ris.append(df_metrics)

    report = ris.groupby(['fairness_method', 'model']).agg(
        np.mean).sort_values(agg_metric, ascending=False).reset_index()
    best_ris = report.iloc[0,:]
    model = ml_methods[best_ris['model']]
    model = Pipeline([
        ('scaler', StandardScaler()),
        ('classifier', model)
    ])
    trainer = ModelTrainer(data, label, sensitive_features, positive_label)
    if best_ris['fairness_method'] == FairnessMethods.NO_ONE.name:
        return model, report
    if best_ris['fairness_method'] == FairnessMethods.RW.name:
        rw = trainer.use_rw(model)
        return rw, report
    elif best_ris['fairness_method'] == FairnessMethods.DIR.name:
        dir = trainer.use_dir(model)
        return dir, report
    elif best_ris['fairness_method'] == FairnessMethods.EG.name:
        eg = trainer.use_eg(model)
        return eg, report
    elif best_ris['fairness_method'] == FairnessMethods.GRID.name:
        grid = trainer.use_grid(model)
        return grid, report
    elif best_ris['fairness_method'] == FairnessMethods.GERRY.name:
        gerry = trainer.use_gerry()
        return gerry, report
    elif best_ris['fairness_method'] == FairnessMethods.META.name:
        meta = trainer.use_meta()
        return meta, report
    elif best_ris['fairness_method'] == FairnessMethods.PREJ.name:
        prej = trainer.use_prj()
        return prej, report
    elif best_ris['fairness_method'] == FairnessMethods.CAL_EO.name:
        cal = trainer.use_cal_eo(model)
        return cal, report 
    else:
        rej = trainer.use_rej_opt(model)
        return rej, report

if __name__ == '__main__':
    parser = argparse.ArgumentParser(
        description='Experiment file for fairness testing')
    parser.add_argument('-d', '--dataset', type=str,
                        help='Required argument: relative path of the dataset to process')
    args = parser.parse_args()
    
    data = pd.read_csv(args.dataset
    )
    model, report = exec(data)
    os.makedirs('ris', exist_ok=True)
    dir_name = os.path.basename(os.path.dirname(__file__))
    report.round(3).to_csv(os.path.join('ris',f'report_{dir_name}.csv'))
    model_name = f"{report.loc[0,'model']}_{report.loc[0,'fairness_method']}"
    pickle.dump(model, open(os.path.join('ris',model_name+'_'+dir_name+'.pkl'), 'wb'))