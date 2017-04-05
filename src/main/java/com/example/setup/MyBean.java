package com.example.setup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Oleg Shabunin on 4/5/2017.
 */

@Component
public class MyBean {

    private static final Logger LOG = LoggerFactory.getLogger(MyBean.class);

    @Value("${name}")
    private String name;

    @Autowired
    private FooProperties fooProperties;

    @Autowired
    private MoreProperties moreProperties;

    @PostConstruct
    public void printNameProperty()
    {
        LOG.info("Name property = {}", name);
        LOG.info("enabled property = {}", fooProperties.isEnabled());
        LOG.info("property1 property = {}", fooProperties.getProperty1());
        LOG.info("more.property1 property = {}", moreProperties.getProperty1());
        LOG.info("more.property2 property = {}", moreProperties.getProperty2());
    }
}
