/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.faces.util.copier;

import static java.lang.String.format;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Copier that copies an object using the {@link Cloneable} facility.
 *
 * @since 2.3
 * @author Arjan Tijms
 *
 */
public class CloneCopier implements Copier {

	private static final String ERROR_CANT_CLONE =
			"Can not clone object of type %s since it doesn't implement Cloneable";

	@Override
	public Object copy(Object object) {

		if (!(object instanceof Cloneable)) {
			throw new IllegalStateException(format(ERROR_CANT_CLONE, object.getClass()));
		}

		try {

			Method cloneMethod = getMethod(object, "clone");

			if (!cloneMethod.isAccessible()) {
				cloneMethod.setAccessible(true);
			}

			return cloneMethod.invoke(object);


		} catch (SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			throw new IllegalStateException(e);
		}
	}

	private Method getMethod(Object object, String name) {
		for (Class<?> c = object.getClass(); c != null; c = c.getSuperclass()) {
			for (Method method : c.getDeclaredMethods()) {
				if (method.getName().equals(name)) {
					return method;
				}
			}
		}

		return null;
	}

}