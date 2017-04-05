package com.example.setup;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Oleg Shabunin on 4/5/2017.
 */

@ConfigurationProperties(prefix = "more")
public class MoreProperties {

    private String property1;

    private String property2;

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }
}
