/**
 */
package fairness.provider;


import fairness.Dataset;
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
 * This is the item provider adapter for a {@link fairness.Dataset} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetItemProvider(AdapterFactory adapterFactory) {
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

			addGroundTruthLabelNamePropertyDescriptor(object);
			addPredictedLabelNamePropertyDescriptor(object);
			addFilePathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ground Truth Label Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroundTruthLabelNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dataset_groundTruthLabelName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_groundTruthLabelName_feature", "_UI_Dataset_type"),
				 FairnessPackage.Literals.DATASET__GROUND_TRUTH_LABEL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Predicted Label Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredictedLabelNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dataset_predictedLabelName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_predictedLabelName_feature", "_UI_Dataset_type"),
				 FairnessPackage.Literals.DATASET__PREDICTED_LABEL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dataset_filePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_filePath_feature", "_UI_Dataset_type"),
				 FairnessPackage.Literals.DATASET__FILE_PATH,
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
			childrenFeatures.add(FairnessPackage.Literals.DATASET__OTHER_VARIABLE);
			childrenFeatures.add(FairnessPackage.Literals.DATASET__POSITIVE_OUTCOME);
			childrenFeatures.add(FairnessPackage.Literals.DATASET__DATASET_SENTIVE_VARIABLE);
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
	 * This returns Dataset.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Dataset"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Dataset)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Dataset_type") :
			getString("_UI_Dataset_type") + " " + label;
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

		switch (notification.getFeatureID(Dataset.class)) {
			case FairnessPackage.DATASET__GROUND_TRUTH_LABEL_NAME:
			case FairnessPackage.DATASET__PREDICTED_LABEL_NAME:
			case FairnessPackage.DATASET__FILE_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FairnessPackage.DATASET__OTHER_VARIABLE:
			case FairnessPackage.DATASET__POSITIVE_OUTCOME:
			case FairnessPackage.DATASET__DATASET_SENTIVE_VARIABLE:
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
				(FairnessPackage.Literals.DATASET__OTHER_VARIABLE,
				 FairnessFactory.eINSTANCE.createOtherVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.DATASET__POSITIVE_OUTCOME,
				 FairnessFactory.eINSTANCE.createDatasetPositiveOutcome()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.DATASET__DATASET_SENTIVE_VARIABLE,
				 FairnessFactory.eINSTANCE.createDatasetSensitiveVariable()));
	}

}
