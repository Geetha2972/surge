package com.adobe.aem.guides.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class Task1 {
    @ValueMapValue
    private String TextField;
    @ValueMapValue
    private String checkbox;
    @ValueMapValue
    private String fileupload;
    @ValueMapValue
    private String dropdown;

    public String getTextField() {
        return TextField;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public String getFileupload() {
        return fileupload;
    }

    public String getDropdown() {
        return dropdown;
    }
}
