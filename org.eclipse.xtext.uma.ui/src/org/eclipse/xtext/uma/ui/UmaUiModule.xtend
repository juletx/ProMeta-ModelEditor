package org.eclipse.xtext.uma.ui

import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtext.ui.resource.generic.EmfUiModule

/**
 * This class is the DI config for all Eclipse-based services.
 */
class UmaUiModule extends EmfUiModule {

	new(AbstractUIPlugin plugin) {
		super(plugin)
	}
}