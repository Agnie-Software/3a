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
package com.agnie.useradmin.persistance.server.util;

import java.net.MalformedURLException;

import com.agnie.common.helper.TestURLInfoImpl;
import com.agnie.useradmin.persistance.client.helper.UserAdminURLInfo;

public class TestUserAdminURLInfo extends TestURLInfoImpl implements UserAdminURLInfo {
	private String	sessionId;

	public TestUserAdminURLInfo(String url, String sessionId) throws MalformedURLException {
		super(url);
		this.sessionId = sessionId;
	}

	@Override
	public String getSessionId() {
		return sessionId;
	}

}
