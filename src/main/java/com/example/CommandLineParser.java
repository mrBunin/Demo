package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Oleg Shabunin on 3/30/2017.
 */

@Component
public class CommandLineParser {

    private final Logger LOG = LoggerFactory.getLogger(CommandLineParser.class);

    private static final String DATE_PARAM = "date";

    private ParamPublisher publisher;

    private ApplicationArguments args;

    public CommandLineParser(ApplicationArguments args) {
        this.args = args;
    }

    @Autowired
    public void setPublisher(ParamPublisher publisher) {
        this.publisher = publisher;
    }

    @PostConstruct
    public void parse() {
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
