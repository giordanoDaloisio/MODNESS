/**
 */
package fairness.provider;


import fairness.FairnessFactory;
import fairness.FairnessPackage;
import fairness.Metric;

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
 * This is the item provider adapter for a {@link fairness.Metric} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricItemProvider(AdapterFactory adapterFactory) {
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

			addToleranceValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tolerance Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToleranceValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Metric_toleranceValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Metric_toleranceValue_feature", "_UI_Metric_type"),
				 FairnessPackage.Literals.METRIC__TOLERANCE_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
			childrenFeatures.add(FairnessPackage.Literals.METRIC__OPERATOR);
			childrenFeatures.add(FairnessPackage.Literals.METRIC__FUNCTION);
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
	 * This returns Metric.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Metric"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Metric)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Metric_type") :
			getString("_UI_Metric_type") + " " + label;
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

		switch (notification.getFeatureID(Metric.class)) {
			case FairnessPackage.METRIC__TOLERANCE_VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FairnessPackage.METRIC__OPERATOR:
			case FairnessPackage.METRIC__FUNCTION:
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
				(FairnessPackage.Literals.METRIC__OPERATOR,
				 FairnessFactory.eINSTANCE.createSingleOperator()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.METRIC__OPERATOR,
				 FairnessFactory.eINSTANCE.createRangeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.METRIC__FUNCTION,
				 FairnessFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.METRIC__FUNCTION,
				 FairnessFactory.eINSTANCE.createProbability()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.METRIC__FUNCTION,
				 FairnessFactory.eINSTANCE.createExpectedValue()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.METRIC__FUNCTION,
				 FairnessFactory.eINSTANCE.createGroupSize()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.METRIC__FUNCTION,
				 FairnessFactory.eINSTANCE.createDatasetSize()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.METRIC__FUNCTION,
				 FairnessFactory.eINSTANCE.createLogaritm()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.METRIC__FUNCTION,
				 FairnessFactory.eINSTANCE.createSummation()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.METRIC__FUNCTION,
				 FairnessFactory.eINSTANCE.createExistingFairnessMetric()));
	}

}
