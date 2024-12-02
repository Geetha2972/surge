package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.servlet.Servlet;
import org.osgi.service.component.annotations.Component;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;

@Component(service = Servlet.class, property = {
        "sling.servlet.resourceTypes=foundation/components/redirect",
        "sling.servlet.selectors=abc",
        "sling.servlet.extensions=json"
})
public class Task4ResourceServleet extends SlingSafeMethodsServlet {
    @Override
    public void doGet(SlingHttpServletRequest req, SlingHttpServletResponse resp)
            throws IOException {
        resp.setContentType("application/json");
        JsonObjectBuilder jsonObject = Json.createObjectBuilder();
        jsonObject.add("Name", "Servlet Task");
        jsonObject.add("Type", "Task Based on Servlet");
        jsonObject.add("Resource Path", req.getResource().getPath());
        jsonObject.add("Resource Type", req.getResource().getResourceType());
        resp.getWriter().write(jsonObject.build().toString());
    }
}

// package com.adobe.aem.guides.demo.core.servlets;

// import java.io.IOException;

// import javax.json.Json;
// import javax.json.JsonObjectBuilder;
// import javax.servlet.Servlet;
// import org.osgi.service.component.annotations.Component;
// import org.apache.sling.api.SlingHttpServletRequest;
// import org.apache.sling.api.SlingHttpServletResponse;
// import org.apache.sling.api.servlets.SlingAllMethodsServlet;
// import org.apache.sling.servlets.annotations.SlingServletResourceTypes;

// @Component(service = Servlet.class, immediate = true)
// @SlingServletResourceTypes(resourceTypes = "foundation/components/redirect",
// selectors = { "nov", "dec",
// "jan" }, extensions = { "text", "json", "xml" })
// public class Task4ResourceServleet extends SlingAllMethodsServlet {
// public void doGet(SlingHttpServletRequest req, SlingHttpServletResponse resp)
// throws IOException {
// resp.setContentType("application/json");
// JsonObjectBuilder jsonObject = Json.createObjectBuilder();
// jsonObject.add("Name", "Servlet");
// jsonObject.add("Type", "Respurce Based Servlet");
// jsonObject.add("Resource Path", req.getResource().getPath());
// jsonObject.add("Resource Type", req.getResource().getResourceType());
// resp.getWriter().write(jsonObject.build().toString());
// }
// }
