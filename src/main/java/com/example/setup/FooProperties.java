package com.example.setup;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Oleg Shabunin on 4/5/2017.
 */

@ConfigurationProperties
public class FooProperties {

    private boolean enabled;

    private String property1;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }
}
