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
package com.agnie.useradmin.persistance.client.exception;

public class CriticalException extends RuntimeException {

	private static final long	serialVersionUID	= 1L;

	public CriticalException() {
	}

	/**
	 * @param message
	 */
	public CriticalException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public CriticalException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public CriticalException(String message, Throwable cause) {
		super(message, cause);
	}

}
