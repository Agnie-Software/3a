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
package com.agnie.useradmin.landing.client.ui;

import com.agnie.gwt.common.client.mvp.MainView;
import com.google.gwt.user.client.ui.IsWidget;

public interface NewAppView extends IsWidget, MainView {

	// void setCustomers(List<Customer> customers);

	void isAvilableResp(Boolean resp);

	void reset();

}
