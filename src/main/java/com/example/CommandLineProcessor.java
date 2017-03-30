package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Oleg Shabunin on 3/29/2017.
 */

@Component
public class CommandLineProcessor implements CommandLineRunner {

    private final Logger LOG = LoggerFactory.getLogger(CommandLineProcessor.class);

    @Autowired
    private ParamPublisher publisher;

    @Override
    public void run(String... args) throws Exception {
        if (args.length > 0) {
            publisher.setParam(args[0]);
            publisher.printParam();
        }
        else {
            LOG.info("No parameters passed.");
        }
    }
}
