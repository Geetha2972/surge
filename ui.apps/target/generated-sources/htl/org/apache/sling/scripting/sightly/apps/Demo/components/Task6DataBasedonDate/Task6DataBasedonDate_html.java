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
package org.apache.sling.scripting.sightly.apps.Demo.components.Task6DataBasedonDate;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class Task6DataBasedonDate_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _dynamic_properties = bindings.get("properties");
out.write("<h1> Task</h1>\n<div class=\"custom-component\">\n    ");
_global_model = renderContext.call("use", com.adobe.aem.guides.demo.core.models.Task6DataBasedOndate.class.getName(), obj());
out.write("<div>\n        ");
{
    boolean var_testvariable0 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "message"), "Valid"));
    if (var_testvariable0) {
        out.write("<div>\n            <p>");
        {
            String var_1 = ("Textfield:" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "textfield"), "text")));
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</p>\n            <p>");
        {
            String var_2 = ("Path: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "pathfield"), "text")));
            out.write(renderContext.getObjectModel().toString(var_2));
        }
        out.write("</p>\n        </div>");
    }
}
out.write("\n        ");
{
    boolean var_testvariable3 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "message"), "Component Expired"));
    if (var_testvariable3) {
        out.write("<div>\n            <p>Component Expired</p>\n        </div>");
    }
}
out.write("\n        ");
{
    boolean var_testvariable4 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "message"), "Invalid Date"));
    if (var_testvariable4) {
        out.write("<div>\n            <p>Invalid Date Selected</p>\n        </div>");
    }
}
out.write("\n    </div>\n</div> \n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

