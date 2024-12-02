package com.adobe.aem.guides.demo.core.models;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Task6DataBasedOndate {
    @ValueMapValue
    private String textField;
    @ValueMapValue
    private String pathfield;
    @ValueMapValue
    private String datepicker;
    private String message;

    public String getTextField() {
        return textField;
    }

    public String getPathfield() {
        return pathfield;
    }

    // public String getSelectedDate() {
    // return selectedDate;
    // }

    public String getMessage() {
        return message;
    }

    @PostConstruct
    protected void init() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date selected = sdf.parse(datepicker);
            Date today = sdf.parse(sdf.format(new Date()));
            if (selected.before(today)) {
                message = "Component Expired";
            } else {
                message = "Valid";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
