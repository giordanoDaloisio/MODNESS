/*
 * generated by Xtext 2.37.0
 */
package org.xtext.example.modness.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.modness.ui.internal.ModnessActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ModnessExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(ModnessActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		ModnessActivator activator = ModnessActivator.getInstance();
		return activator != null ? activator.getInjector(ModnessActivator.ORG_XTEXT_EXAMPLE_MODNESS_MODNESS) : null;
	}

}
