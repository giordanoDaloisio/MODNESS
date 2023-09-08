/**
 */
package fairness.provider;


import fairness.Analysis;
import fairness.FairnessFactory;
import fairness.FairnessPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fairness.Analysis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addScopePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Analysis_scope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Analysis_scope_feature", "_UI_Analysis_type"),
				 FairnessPackage.Literals.ANALYSIS__SCOPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FairnessPackage.Literals.ANALYSIS__METRIC);
			childrenFeatures.add(FairnessPackage.Literals.ANALYSIS__DATASET);
			childrenFeatures.add(FairnessPackage.Literals.ANALYSIS__DATASET_UNPRIVILEGED_GROUP);
			childrenFeatures.add(FairnessPackage.Literals.ANALYSIS__DATASET_PRIVILEGED_GROUP);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Analysis)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Analysis_type") :
			getString("_UI_Analysis_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Analysis.class)) {
			case FairnessPackage.ANALYSIS__SCOPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FairnessPackage.ANALYSIS__METRIC:
			case FairnessPackage.ANALYSIS__DATASET:
			case FairnessPackage.ANALYSIS__DATASET_UNPRIVILEGED_GROUP:
			case FairnessPackage.ANALYSIS__DATASET_PRIVILEGED_GROUP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.ANALYSIS__METRIC,
				 FairnessFactory.eINSTANCE.createMetric()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.ANALYSIS__DATASET,
				 FairnessFactory.eINSTANCE.createDataset()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.ANALYSIS__DATASET_UNPRIVILEGED_GROUP,
				 FairnessFactory.eINSTANCE.createDatasetSensitiveGroup()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.ANALYSIS__DATASET_PRIVILEGED_GROUP,
				 FairnessFactory.eINSTANCE.createDatasetSensitiveGroup()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == FairnessPackage.Literals.ANALYSIS__DATASET_UNPRIVILEGED_GROUP ||
			childFeature == FairnessPackage.Literals.ANALYSIS__DATASET_PRIVILEGED_GROUP;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
