/*******************************************************************************
 * Copyright (c) 2014 Agnie Technologies.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Agnie Technologies - initial API and implementation
 ******************************************************************************/
package com.agnie.useradmin.login.client.mvp;

import com.agnie.useradmin.common.client.ui.UACommonViewFactory;
import com.agnie.useradmin.login.client.injector.MVPInjector;
import com.agnie.useradmin.login.client.ui.ViewFactory;
import com.google.gwt.core.shared.GWT;

public class DesktopFactory implements PlatformFactory {
	private MVPInjector	injector	= GWT.create(MVPInjector.class);

	public MVPInjector getInjector() {
		return injector;
	}

	public ViewFactory getViewFactory() {
		return injector.getDesktopViewFactory();
	}

	@Override
	public UACommonViewFactory getCommonViewFactory() {
		return injector.getCommonViewFactory();
	}

}
