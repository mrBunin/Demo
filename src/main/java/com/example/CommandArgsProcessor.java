package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Oleg Shabunin on 3/29/2017.
 */

@Component
public class CommandArgsProcessor implements ApplicationRunner {

    private final Logger LOG = LoggerFactory.getLogger(CommandArgsProcessor.class);

    private static final String DATE_PARAM = "date";

    @Autowired
    private ParamPublisher publisher;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (args.containsOption(DATE_PARAM)) {
            final List<String> paramVals = args.getOptionValues(DATE_PARAM);

            if (paramVals != null) {
                publisher.setParam(paramVals.get(0));
                publisher.printParam();
            }
        } else {
            LOG.info("No '" + DATE_PARAM + "' parameter passed.");
        }
    }
}

