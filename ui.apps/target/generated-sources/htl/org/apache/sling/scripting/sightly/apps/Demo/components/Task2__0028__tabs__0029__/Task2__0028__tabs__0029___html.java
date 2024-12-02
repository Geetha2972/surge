/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.Demo.components.Task2__0028__tabs__0029__;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class Task2__0028__tabs__0029___html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_obj = null;
Collection var_collectionvar1_list_coerced$ = null;
Object _dynamic_obj1 = bindings.get("obj1");
Collection var_collectionvar15_list_coerced$ = null;
out.write("<h1>Task2</h1>\n    ");
_global_obj = renderContext.call("use", com.adobe.aem.guides.demo.core.models.Task2.class.getName(), obj());
out.write("<div>\n        <p>Tab 1</p>\n        <p>");
{
    String var_0 = ("Textfield: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_obj, "textfield"), "text")));
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</p> \n    \n        <p>Tab 2</p>\n        ");
{
    Object var_collectionvar1 = renderContext.getObjectModel().resolveProperty(_global_obj, "multifield");
    {
        long var_size2 = ((var_collectionvar1_list_coerced$ == null ? (var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1)) : var_collectionvar1_list_coerced$).size());
        {
            boolean var_notempty3 = (var_size2 > 0);
            if (var_notempty3) {
                {
                    long var_end6 = var_size2;
                    {
                        boolean var_validstartstepend7 = (((0 < var_size2) && true) && (var_end6 > 0));
                        if (var_validstartstepend7) {
                            out.write("<div>");
                            if (var_collectionvar1_list_coerced$ == null) {
                                var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1);
                            }
                            long var_index8 = 0;
                            for (Object properties : var_collectionvar1_list_coerced$) {
                                {
                                    boolean var_traversal10 = (((var_index8 >= 0) && (var_index8 <= var_end6)) && true);
                                    if (var_traversal10) {
                                        out.write("\n            <p>");
                                        {
                                            String var_11 = ("Text: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(properties, "textfield"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_11));
                                        }
                                        out.write("</p>\n            <p>");
                                        {
                                            String var_12 = ("Pathfield: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(properties, "pathfield"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_12));
                                        }
                                        out.write("</p>\n            <p>");
                                        {
                                            String var_13 = ("Dropdown: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(properties, "dropdown"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_13));
                                        }
                                        out.write("</p> \n            <p>");
                                        {
                                            String var_14 = ("checkbox: " + renderContext.getObjectModel().toString(renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(properties, "checkbox")) ? "Yes" : "No"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_14));
                                        }
                                        out.write("</p>\n            ");
                                        {
                                            Object var_collectionvar15 = renderContext.getObjectModel().resolveProperty(_dynamic_obj1, "nestedTextField");
                                            {
                                                long var_size16 = ((var_collectionvar15_list_coerced$ == null ? (var_collectionvar15_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar15)) : var_collectionvar15_list_coerced$).size());
                                                {
                                                    boolean var_notempty17 = (var_size16 > 0);
                                                    if (var_notempty17) {
                                                        {
                                                            long var_end20 = var_size16;
                                                            {
                                                                boolean var_validstartstepend21 = (((0 < var_size16) && true) && (var_end20 > 0));
                                                                if (var_validstartstepend21) {
                                                                    out.write("<div>");
                                                                    if (var_collectionvar15_list_coerced$ == null) {
                                                                        var_collectionvar15_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar15);
                                                                    }
                                                                    long var_index22 = 0;
                                                                    for (Object properties1 : var_collectionvar15_list_coerced$) {
                                                                        {
                                                                            boolean var_traversal24 = (((var_index22 >= 0) && (var_index22 <= var_end20)) && true);
                                                                            if (var_traversal24) {
                                                                                out.write("\n                <p>");
                                                                                {
                                                                                    String var_25 = ("RichText: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(properties1, "text"), "html")));
                                                                                    out.write(renderContext.getObjectModel().toString(var_25));
                                                                                }
                                                                                out.write("</p>\n            ");
                                                                            }
                                                                        }
                                                                        var_index22++;
                                                                    }
                                                                    out.write("</div>");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var_collectionvar15_list_coerced$ = null;
                                        }
                                        out.write("\n        ");
                                    }
                                }
                                var_index8++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar1_list_coerced$ = null;
}
out.write("\n   </div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

