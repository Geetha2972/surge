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
package org.apache.sling.scripting.sightly.apps.Demo.components.Task1;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class Task1_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_msg = null;
_global_msg = renderContext.call("use", com.adobe.aem.guides.demo.core.models.Task1.class.getName(), obj());
out.write("<div>\n  <h1>Task1</h1>\n  <div>");
{
    String var_0 = ("TextField=" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_msg, "TextField"), "text")));
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</div>\n  <div>");
{
    String var_1 = ("checkbox=" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_msg, "checkbox"), "text")));
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</div>\n  <div>");
{
    String var_2 = ("fileupload=" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_msg, "fileupload"), "text")));
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</div>\n  <div>");
{
    String var_3 = ("dropdown=" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_msg, "dropdown"), "text")));
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</div>\n</div>\n\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

