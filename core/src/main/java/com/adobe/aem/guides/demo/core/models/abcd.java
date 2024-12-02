package com.adobe.aem.guides.demo.core.models;

import javax.annotation.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class abcd {
    @ValueMapValue
    private String text;

    public String getText() {
        return text;
    }

}