package com.adobe.aem.guides.demo.core.models;

import org.apache.sling.models.annotations.Model;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Task2 {

    @ValueMapValue
    private String textfield;

    @ChildResource
    private List<Task2Multifield> multifield;

    public String getTextfield() {
        return textfield;
    }

    public List<Task2Multifield> getMultifield() {
        return multifield;
    }
}