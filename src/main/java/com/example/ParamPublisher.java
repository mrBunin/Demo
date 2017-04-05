package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Oleg Shabunin on 3/29/2017.
 */

public class ParamPublisher {

    private static final Logger LOG = LoggerFactory.getLogger(ParamPublisher.class);

    private String param;

    @Value("${logging.level.com.example}")
    private String logLevel;

    @Value("${date}")
    private String commandLineParam;

    String getParam() {
        return param;
    }

    void setParam(String param) {
        this.param = param;
    }

    void printParam() {
        LOG.info("Got command line parameter by reading command line: {}", param);
        LOG.info("Got command line parameter by reading property: {}", commandLineParam);
        LOG.info("Current log level: {}", logLevel);
    }
}
