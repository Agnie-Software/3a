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
/**
 * 
 */

package com.agnie.useradmin.persistance.client.service;

import com.agnie.useradmin.persistance.client.Messages;
import com.google.gwt.core.client.GWT;

/**
 * common interface to use Internationlized messages.
 * 
 */
public interface I18 {

	public static final Messages	messages	= GWT.create(Messages.class);

}
