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

package javax.faces.event;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;

/**
 *
 * <p class="changed_added_2_2">This event must be published by a call
 * to {@link javax.faces.application.Application#publishEvent} when a value
 * is stored in the flash.</p>
 *
 * @since 2.2
 */
public class PostPutFlashValueEvent extends SystemEvent {

    private static final long serialVersionUID = -6422204761759384353L;;

    // ------------------------------------------------------------ Constructors


    /**
     * <p class="changed_added_2_2">Instantiate a new
     * <code>PostPutFlashValueEvent</code> that indicates the argument
     * <code>key</code> was just put to the flash. If the argument is 
     * <code>null</code>, the literal {@link Flash#NULL_VALUE} must be passed
     * to the superclass constructor.</p>

     * @param key the key in the flash that was just added.
     *
     */
    public PostPutFlashValueEvent(String key) {
        super(null == key ? Flash.NULL_VALUE : key);
    }
    
    /**
     * <p class="changed_added_2_2">Instantiate a new
     * <code>PostPutFlashValueEvent</code> that indicates the argument
     * <code>key</code> was just put to the flash. If the argument is 
     * <code>null</code>, the literal {@link Flash#NULL_VALUE} must be passed
     * to the superclass constructor.</p>
     * 
     * @param facesContext the Faces context.
     * @param key the key in the flash that was just added.
     *
     */
    public PostPutFlashValueEvent(FacesContext facesContext, String key) {
        super(facesContext, key);
    }
    
    public String getKey() {
        return getSource().toString();
    }

}
