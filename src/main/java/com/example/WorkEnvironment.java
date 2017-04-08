package com.example;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Oleg Shabunin on 4/5/2017.
 */

public class WorkEnvironment {

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String user;

    @Value("${spring.datasource.password}")
    private String password;

    public String getDbUrl() {
        return dbUrl;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
