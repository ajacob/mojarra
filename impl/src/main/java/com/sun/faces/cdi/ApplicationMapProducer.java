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

package com.sun.faces.cdi;

import java.lang.reflect.Type;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * <p class="changed_added_2_3">
 * The ApplicationMapProducer is the CDI producer that allows injection of the
 * application map using @Inject and allows EL resolving of #{applicationScope}
 * </p>
 *
 * @since 2.3
 * @see ExternalContext#getApplicationMap()
 */
public class ApplicationMapProducer extends CdiProducer<Map<String, Object>> {

    /**
     * Serialization version
     */
    private static final long serialVersionUID = 1L;
    
    public ApplicationMapProducer() {
        super.name("applicationScope")
             .scope(ApplicationScoped.class)
             .qualifiers(new ApplicationMapAnnotationLiteral())
             .types(
                 new ParameterizedTypeImpl(Map.class, new Type[]{String.class, Object.class}),
                 Map.class,
                 Object.class)
             .beanClass(Map.class)
             .create(e -> FacesContext.getCurrentInstance().getExternalContext().getApplicationMap());
    }

}
