/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 * Copyright 2005-2007 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package javax.faces.view.facelets;

import java.io.IOException;
import javax.faces.component.UIComponent;


/**
 * <p class="changed_added_2_0">A FaceletHandler that is derived of 1 or
 * more, inner FaceletHandlers. This class would be found if the next
 * FaceletHandler is structually, a body with multiple child elements as
 * defined in XML.  This class enables the Facelet runtime to traverse
 * the tree of {@link FaceletHandler} instances built by the Facelets
 * compiler.</p>
 *
 */
public final class CompositeFaceletHandler implements FaceletHandler {

    private final FaceletHandler[] children;
    private final int len;

    public CompositeFaceletHandler(FaceletHandler[] children) {
        this.children = children;
        this.len = children.length;
    }

    /**
     * <p class="changed_added_2_0">Calls apply on any child handlers.</p>
     *
     * @param ctx the <code>FaceletContext</code> for this view execution
     *
     * @param parent the parent <code>UIComponent</code> of the
     * component represented by this element instance.
     * @since 2.0
     */
    @Override
    public void apply(FaceletContext ctx, UIComponent parent) throws IOException {
        for (int i = 0; i < len; i++) {
            this.children[i].apply(ctx, parent);
        }
    }

    /**
     * <p class="changed_added_2_0">Returns the array of child
     * handlers contained by this handler.</p>
     * 
     * @return Returns the array of child handlers contained by this handler.
     */
    public FaceletHandler[] getHandlers() {
        return this.children;
    }
}
