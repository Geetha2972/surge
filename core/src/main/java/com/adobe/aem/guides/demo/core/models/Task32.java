package com.adobe.aem.guides.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import java.util.List;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = { Resource.class,
        SlingHttpServletRequest.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class Task32 {
    @ValueMapValue
    private String desktopicon;
    @ValueMapValue
    private String mobileicon;
    @ChildResource
    private List<Task33> nestedmultifield;

    public String getDesktopicon() {
        return desktopicon;
    }

    public String getMobileicon() {
        return mobileicon;
    }

    public List<Task33> getNestedmultifield() {
        return nestedmultifield;
    }

}
