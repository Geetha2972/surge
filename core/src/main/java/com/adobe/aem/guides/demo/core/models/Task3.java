package com.adobe.aem.guides.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import java.util.List;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = { Resource.class,
        SlingHttpServletRequest.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Task3 {
    @ValueMapValue
    private String logoPath;
    @ValueMapValue
    private String logoMobileImage;
    @ValueMapValue
    private String logoLink;
    @ValueMapValue
    private String enableSwitch;
    @ChildResource
    private List<Task31> multifield;
    @ChildResource
    private List<Task32> multifield2;
    @ValueMapValue
    private String navigationurl;
    @ValueMapValue
    @Default(values = "US")
    private String countries;

    public String getLogoPath() {
        return logoPath;
    }

    public String getLogoMobileImage() {
        return logoMobileImage;
    }

    public String getLogoLink() {
        return logoLink;
    }

    public String getEnableSwitch() {
        return enableSwitch;
    }

    public List<Task31> getMultifield() {
        return multifield;
    }

    public List<Task32> getMultifield2() {
        return multifield2;
    }

    public String getNavigationurl() {
        return navigationurl;
    }

    public String getCountries() {
        return countries;
    }

}
