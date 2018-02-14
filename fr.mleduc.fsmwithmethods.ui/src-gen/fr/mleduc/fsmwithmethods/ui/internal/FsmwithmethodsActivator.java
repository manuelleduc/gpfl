/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.fsmwithmethods.ui.internal;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import fr.mleduc.fsmwithmethods.FsmWithMethodsRuntimeModule;
import fr.mleduc.fsmwithmethods.ui.FsmWithMethodsUiModule;
import java.util.Collections;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FsmwithmethodsActivator extends AbstractUIPlugin {

	public static final String FR_MLEDUC_FSMWITHMETHODS_FSMWITHMETHODS = "fr.mleduc.fsmwithmethods.FsmWithMethods";
	
	private static final Logger logger = Logger.getLogger(FsmwithmethodsActivator.class);
	
	private static FsmwithmethodsActivator INSTANCE;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static FsmwithmethodsActivator getInstance() {
		return INSTANCE;
	}
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			return injector;
		}
	}
	
	protected Injector createInjector(String language) {
		try {
			Module runtimeModule = getRuntimeModule(language);
			Module sharedStateModule = getSharedStateModule();
			Module uiModule = getUiModule(language);
			Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}
	
	protected Module getRuntimeModule(String grammar) {
		if (FR_MLEDUC_FSMWITHMETHODS_FSMWITHMETHODS.equals(grammar)) {
			return new FsmWithMethodsRuntimeModule();
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getUiModule(String grammar) {
		if (FR_MLEDUC_FSMWITHMETHODS_FSMWITHMETHODS.equals(grammar)) {
			return new FsmWithMethodsUiModule(this);
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
}
