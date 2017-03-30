package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Oleg Shabunin on 3/29/2017.
 */

@Component
public class CommandLineProcessor implements CommandLineRunner {

    @Autowired
    private ParamPublisher publisher;

    @Override
    public void run(String... args) throws Exception {
        if (args.length > 0) {
            publisher.setParam(args[0]);
            publisher.printParam();
        }
        else {
            System.out.println("No parameters passed.");
        }
    }
}
