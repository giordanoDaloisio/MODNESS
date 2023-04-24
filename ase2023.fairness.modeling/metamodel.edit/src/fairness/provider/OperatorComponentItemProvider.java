/**
 */
package fairness.provider;


import fairness.FairnessFactory;
import fairness.FairnessPackage;
import fairness.OperatorComponent;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fairness.OperatorComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorComponentItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorComponentItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(FairnessPackage.Literals.OPERATOR_COMPONENT__FUNCTION);
			childrenFeatures.add(FairnessPackage.Literals.OPERATOR_COMPONENT__OPERATIONVALUE);
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
	 * This returns OperatorComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OperatorComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OperatorComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OperatorComponent_type") :
			getString("_UI_OperatorComponent_type") + " " + label;
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

		switch (notification.getFeatureID(OperatorComponent.class)) {
			case FairnessPackage.OPERATOR_COMPONENT__FUNCTION:
			case FairnessPackage.OPERATOR_COMPONENT__OPERATIONVALUE:
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
				(FairnessPackage.Literals.OPERATOR_COMPONENT__FUNCTION,
				 FairnessFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.OPERATOR_COMPONENT__FUNCTION,
				 FairnessFactory.eINSTANCE.createProbability()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.OPERATOR_COMPONENT__FUNCTION,
				 FairnessFactory.eINSTANCE.createExpectedValue()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.OPERATOR_COMPONENT__FUNCTION,
				 FairnessFactory.eINSTANCE.createGroupSize()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.OPERATOR_COMPONENT__FUNCTION,
				 FairnessFactory.eINSTANCE.createDatasetSize()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.OPERATOR_COMPONENT__FUNCTION,
				 FairnessFactory.eINSTANCE.createLogaritm()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.OPERATOR_COMPONENT__FUNCTION,
				 FairnessFactory.eINSTANCE.createSummation()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.OPERATOR_COMPONENT__FUNCTION,
				 FairnessFactory.eINSTANCE.createExistingFairnessMetric()));

		newChildDescriptors.add
			(createChildParameter
				(FairnessPackage.Literals.OPERATOR_COMPONENT__OPERATIONVALUE,
				 FairnessFactory.eINSTANCE.createOperationValue()));
	}

}
