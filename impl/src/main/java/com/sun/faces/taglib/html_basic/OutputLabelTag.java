/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997, 2020 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.faces.taglib.html_basic;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.webapp.UIComponentELTag;
import jakarta.servlet.jsp.JspException;

/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

public class OutputLabelTag extends UIComponentELTag {

    // Setter Methods
    // PROPERTY: converter
    private jakarta.el.ValueExpression converter;

    public void setConverter(jakarta.el.ValueExpression converter) {
        this.converter = converter;
    }

    // PROPERTY: value
    private jakarta.el.ValueExpression value;

    public void setValue(jakarta.el.ValueExpression value) {
        this.value = value;
    }

    // PROPERTY: accesskey
    private jakarta.el.ValueExpression accesskey;

    public void setAccesskey(jakarta.el.ValueExpression accesskey) {
        this.accesskey = accesskey;
    }

    // PROPERTY: dir
    private jakarta.el.ValueExpression dir;

    public void setDir(jakarta.el.ValueExpression dir) {
        this.dir = dir;
    }

    // PROPERTY: escape
    private jakarta.el.ValueExpression escape;

    public void setEscape(jakarta.el.ValueExpression escape) {
        this.escape = escape;
    }

    // PROPERTY: for
    private jakarta.el.ValueExpression _for;

    public void setFor(jakarta.el.ValueExpression _for) {
        this._for = _for;
    }

    // PROPERTY: lang
    private jakarta.el.ValueExpression lang;

    public void setLang(jakarta.el.ValueExpression lang) {
        this.lang = lang;
    }

    // PROPERTY: onblur
    private jakarta.el.ValueExpression onblur;

    public void setOnblur(jakarta.el.ValueExpression onblur) {
        this.onblur = onblur;
    }

    // PROPERTY: onclick
    private jakarta.el.ValueExpression onclick;

    public void setOnclick(jakarta.el.ValueExpression onclick) {
        this.onclick = onclick;
    }

    // PROPERTY: ondblclick
    private jakarta.el.ValueExpression ondblclick;

    public void setOndblclick(jakarta.el.ValueExpression ondblclick) {
        this.ondblclick = ondblclick;
    }

    // PROPERTY: onfocus
    private jakarta.el.ValueExpression onfocus;

    public void setOnfocus(jakarta.el.ValueExpression onfocus) {
        this.onfocus = onfocus;
    }

    // PROPERTY: onkeydown
    private jakarta.el.ValueExpression onkeydown;

    public void setOnkeydown(jakarta.el.ValueExpression onkeydown) {
        this.onkeydown = onkeydown;
    }

    // PROPERTY: onkeypress
    private jakarta.el.ValueExpression onkeypress;

    public void setOnkeypress(jakarta.el.ValueExpression onkeypress) {
        this.onkeypress = onkeypress;
    }

    // PROPERTY: onkeyup
    private jakarta.el.ValueExpression onkeyup;

    public void setOnkeyup(jakarta.el.ValueExpression onkeyup) {
        this.onkeyup = onkeyup;
    }

    // PROPERTY: onmousedown
    private jakarta.el.ValueExpression onmousedown;

    public void setOnmousedown(jakarta.el.ValueExpression onmousedown) {
        this.onmousedown = onmousedown;
    }

    // PROPERTY: onmousemove
    private jakarta.el.ValueExpression onmousemove;

    public void setOnmousemove(jakarta.el.ValueExpression onmousemove) {
        this.onmousemove = onmousemove;
    }

    // PROPERTY: onmouseout
    private jakarta.el.ValueExpression onmouseout;

    public void setOnmouseout(jakarta.el.ValueExpression onmouseout) {
        this.onmouseout = onmouseout;
    }

    // PROPERTY: onmouseover
    private jakarta.el.ValueExpression onmouseover;

    public void setOnmouseover(jakarta.el.ValueExpression onmouseover) {
        this.onmouseover = onmouseover;
    }

    // PROPERTY: onmouseup
    private jakarta.el.ValueExpression onmouseup;

    public void setOnmouseup(jakarta.el.ValueExpression onmouseup) {
        this.onmouseup = onmouseup;
    }

    // PROPERTY: role
    private jakarta.el.ValueExpression role;

    public void setRole(jakarta.el.ValueExpression role) {
        this.role = role;
    }

    // PROPERTY: style
    private jakarta.el.ValueExpression style;

    public void setStyle(jakarta.el.ValueExpression style) {
        this.style = style;
    }

    // PROPERTY: styleClass
    private jakarta.el.ValueExpression styleClass;

    public void setStyleClass(jakarta.el.ValueExpression styleClass) {
        this.styleClass = styleClass;
    }

    // PROPERTY: tabindex
    private jakarta.el.ValueExpression tabindex;

    public void setTabindex(jakarta.el.ValueExpression tabindex) {
        this.tabindex = tabindex;
    }

    // PROPERTY: title
    private jakarta.el.ValueExpression title;

    public void setTitle(jakarta.el.ValueExpression title) {
        this.title = title;
    }

    // General Methods
    @Override
    public String getRendererType() {
        return "jakarta.faces.Label";
    }

    @Override
    public String getComponentType() {
        return "jakarta.faces.HtmlOutputLabel";
    }

    @Override
    protected void setProperties(UIComponent component) {
        super.setProperties(component);
        jakarta.faces.component.UIOutput output = null;
        try {
            output = (jakarta.faces.component.UIOutput) component;
        } catch (ClassCastException cce) {
            throw new IllegalStateException(
                    "Component " + component.toString() + " not expected type.  Expected: jakarta.faces.component.UIOutput.  Perhaps you're missing a tag?");
        }

        if (converter != null) {
            if (!converter.isLiteralText()) {
                output.setValueExpression("converter", converter);
            } else {
                Converter conv = FacesContext.getCurrentInstance().getApplication().createConverter(converter.getExpressionString());
                output.setConverter(conv);
            }
        }

        if (value != null) {
            output.setValueExpression("value", value);
        }
        if (accesskey != null) {
            output.setValueExpression("accesskey", accesskey);
        }
        if (dir != null) {
            output.setValueExpression("dir", dir);
        }
        if (escape != null) {
            output.setValueExpression("escape", escape);
        }
        if (_for != null) {
            output.setValueExpression("for", _for);
        }
        if (lang != null) {
            output.setValueExpression("lang", lang);
        }
        if (onblur != null) {
            output.setValueExpression("onblur", onblur);
        }
        if (onclick != null) {
            output.setValueExpression("onclick", onclick);
        }
        if (ondblclick != null) {
            output.setValueExpression("ondblclick", ondblclick);
        }
        if (onfocus != null) {
            output.setValueExpression("onfocus", onfocus);
        }
        if (onkeydown != null) {
            output.setValueExpression("onkeydown", onkeydown);
        }
        if (onkeypress != null) {
            output.setValueExpression("onkeypress", onkeypress);
        }
        if (onkeyup != null) {
            output.setValueExpression("onkeyup", onkeyup);
        }
        if (onmousedown != null) {
            output.setValueExpression("onmousedown", onmousedown);
        }
        if (onmousemove != null) {
            output.setValueExpression("onmousemove", onmousemove);
        }
        if (onmouseout != null) {
            output.setValueExpression("onmouseout", onmouseout);
        }
        if (onmouseover != null) {
            output.setValueExpression("onmouseover", onmouseover);
        }
        if (onmouseup != null) {
            output.setValueExpression("onmouseup", onmouseup);
        }
        if (role != null) {
            output.setValueExpression("role", role);
        }
        if (style != null) {
            output.setValueExpression("style", style);
        }
        if (styleClass != null) {
            output.setValueExpression("styleClass", styleClass);
        }
        if (tabindex != null) {
            output.setValueExpression("tabindex", tabindex);
        }
        if (title != null) {
            output.setValueExpression("title", title);
        }
    }

    // Methods From TagSupport
    @Override
    public int doStartTag() throws JspException {
        try {
            return super.doStartTag();
        } catch (Exception e) {
            Throwable root = e;
            while (root.getCause() != null) {
                root = root.getCause();
            }
            throw new JspException(root);
        }
    }

    @Override
    public int doEndTag() throws JspException {
        try {
            return super.doEndTag();
        } catch (Exception e) {
            Throwable root = e;
            while (root.getCause() != null) {
                root = root.getCause();
            }
            throw new JspException(root);
        }
    }

    // RELEASE
    @Override
    public void release() {
        super.release();

        // component properties
        converter = null;
        value = null;

        // rendered attributes
        accesskey = null;
        dir = null;
        escape = null;
        _for = null;
        lang = null;
        onblur = null;
        onclick = null;
        ondblclick = null;
        onfocus = null;
        onkeydown = null;
        onkeypress = null;
        onkeyup = null;
        onmousedown = null;
        onmousemove = null;
        onmouseout = null;
        onmouseover = null;
        onmouseup = null;
        role = null;
        style = null;
        styleClass = null;
        tabindex = null;
        title = null;
    }

    public String getDebugString() {
        return "id: " + getId() + " class: " + this.getClass().getName();
    }

}