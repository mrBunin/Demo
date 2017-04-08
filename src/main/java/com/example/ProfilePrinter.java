package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/**
 * Created by Oleg Shabunin on 4/5/2017.
 */

@Component
public class ProfilePrinter {

    private static Logger LOG = LoggerFactory.getLogger(ProfilePrinter.class);

    @Autowired
    private WorkEnvironment environment;

    @PostConstruct
    private void printEnvironmentProperties() {
        LOG.info("Database url = {}", environment.getDbUrl());
        LOG.info("Database user = {}", environment.getUser());
        LOG.info("Database password = {}", environment.getPassword());
    }
}
