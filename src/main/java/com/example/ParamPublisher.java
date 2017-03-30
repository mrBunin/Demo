package com.example;

import org.springframework.stereotype.Component;

/**
 * Created by Oleg Shabunin on 3/29/2017.
 */

@Component
public class ParamPublisher {

    private String param;

    String getParam() {
        return param;
    }

    void setParam(String param) {
        this.param = param;
    }

    void printParam() {
        System.out.println("Got command line parameter: " + param);
    }
}
