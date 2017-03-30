package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Oleg Shabunin on 3/29/2017.
 */

@Component
public class ParamPublisher {

    private final Logger LOG = LoggerFactory.getLogger(ParamPublisher.class);

    private String param;

    String getParam() {
        return param;
    }

    void setParam(String param) {
        this.param = param;
    }

    void printParam() {
        LOG.info("Demo --- Got command line parameter: " + param);
    }
}
