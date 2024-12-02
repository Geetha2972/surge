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
package org.apache.sling.scripting.sightly.apps.Demo.components.Task3;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class Task3_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_msg = null;
Collection var_collectionvar4_list_coerced$ = null;
Collection var_collectionvar16_list_coerced$ = null;
Collection var_collectionvar28_list_coerced$ = null;
out.write("<h1>Task3</h1>\n");
_global_msg = renderContext.call("use", com.adobe.aem.guides.demo.core.models.Task3.class.getName(), obj());
out.write("<div></div>\n<div>\n    <h2>Tab1: Header</h2>\n    <p>");
{
    String var_0 = ("Logo Path: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_msg, "logoPath"), "text")));
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</p>\n    <p>");
{
    String var_1 = ("Logo Mobile Image: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_msg, "logoMobileImage"), "text")));
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n    <p>");
{
    String var_2 = ("Logo Link: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_msg, "logoLink"), "text")));
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</p>\n    <p>");
{
    String var_3 = ("Enable Switch: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_msg, "enableSwitch"), "text")));
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</p>\n    <h2>Tab2: Header Links</h2>\n    ");
{
    Object var_collectionvar4 = renderContext.getObjectModel().resolveProperty(_global_msg, "multifield");
    {
        long var_size5 = ((var_collectionvar4_list_coerced$ == null ? (var_collectionvar4_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar4)) : var_collectionvar4_list_coerced$).size());
        {
            boolean var_notempty6 = (var_size5 > 0);
            if (var_notempty6) {
                {
                    long var_end9 = var_size5;
                    {
                        boolean var_validstartstepend10 = (((0 < var_size5) && true) && (var_end9 > 0));
                        if (var_validstartstepend10) {
                            out.write("<div>");
                            if (var_collectionvar4_list_coerced$ == null) {
                                var_collectionvar4_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar4);
                            }
                            long var_index11 = 0;
                            for (Object link : var_collectionvar4_list_coerced$) {
                                {
                                    boolean var_traversal13 = (((var_index11 >= 0) && (var_index11 <= var_end9)) && true);
                                    if (var_traversal13) {
                                        out.write("\n        <p>");
                                        {
                                            String var_14 = ("Name: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(link, "name"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_14));
                                        }
                                        out.write("</p>\n        <p>");
                                        {
                                            String var_15 = ("Image: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(link, "image"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_15));
                                        }
                                        out.write("</p>\n    ");
                                    }
                                }
                                var_index11++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar4_list_coerced$ = null;
}
out.write("\n\n    <h2>Tab3: SideBar Navigation</h2>\n    ");
{
    Object var_collectionvar16 = renderContext.getObjectModel().resolveProperty(_global_msg, "multifield2");
    {
        long var_size17 = ((var_collectionvar16_list_coerced$ == null ? (var_collectionvar16_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar16)) : var_collectionvar16_list_coerced$).size());
        {
            boolean var_notempty18 = (var_size17 > 0);
            if (var_notempty18) {
                {
                    long var_end21 = var_size17;
                    {
                        boolean var_validstartstepend22 = (((0 < var_size17) && true) && (var_end21 > 0));
                        if (var_validstartstepend22) {
                            if (var_collectionvar16_list_coerced$ == null) {
                                var_collectionvar16_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar16);
                            }
                            long var_index23 = 0;
                            for (Object nav : var_collectionvar16_list_coerced$) {
                                {
                                    boolean var_traversal25 = (((var_index23 >= 0) && (var_index23 <= var_end21)) && true);
                                    if (var_traversal25) {
                                        out.write("\n        <p>");
                                        {
                                            String var_26 = ("Desktop Icon: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(nav, "desktopicon"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_26));
                                        }
                                        out.write("</p>\n        <p>");
                                        {
                                            String var_27 = ("Mobile Icon: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(nav, "mobileicon"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_27));
                                        }
                                        out.write("</p>\n        ");
                                        {
                                            Object var_collectionvar28 = renderContext.getObjectModel().resolveProperty(nav, "nestedmultifield");
                                            {
                                                long var_size29 = ((var_collectionvar28_list_coerced$ == null ? (var_collectionvar28_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar28)) : var_collectionvar28_list_coerced$).size());
                                                {
                                                    boolean var_notempty30 = (var_size29 > 0);
                                                    if (var_notempty30) {
                                                        {
                                                            long var_end33 = var_size29;
                                                            {
                                                                boolean var_validstartstepend34 = (((0 < var_size29) && true) && (var_end33 > 0));
                                                                if (var_validstartstepend34) {
                                                                    if (var_collectionvar28_list_coerced$ == null) {
                                                                        var_collectionvar28_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar28);
                                                                    }
                                                                    long var_index35 = 0;
                                                                    for (Object navigationurls : var_collectionvar28_list_coerced$) {
                                                                        {
                                                                            boolean var_traversal37 = (((var_index35 >= 0) && (var_index35 <= var_end33)) && true);
                                                                            if (var_traversal37) {
                                                                                out.write("\n            <p>");
                                                                                {
                                                                                    String var_38 = ("Navigation URL: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(navigationurls, "navigationurl"), "text")));
                                                                                    out.write(renderContext.getObjectModel().toString(var_38));
                                                                                }
                                                                                out.write("</p>\n        ");
                                                                            }
                                                                        }
                                                                        var_index35++;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var_collectionvar28_list_coerced$ = null;
                                        }
                                        out.write("\n    ");
                                    }
                                }
                                var_index23++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar16_list_coerced$ = null;
}
out.write("\n    <h2>Tab4: Region</h2>\n    <p>");
{
    String var_39 = ("Country: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_msg, "countries"), "text")));
    out.write(renderContext.getObjectModel().toString(var_39));
}
out.write("</p>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

