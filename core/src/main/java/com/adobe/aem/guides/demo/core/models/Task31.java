package com.adobe.aem.guides.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = { Resource.class,
        SlingHttpServletRequest.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class Task31 {
    @ValueMapValue
    private String name;
    @ValueMapValue
    private String image;

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

}