package com.example;

import com.example.model.Band;
import com.example.repository.BandRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Oleg Shabunin on 4/8/2017.
 */

@Component
public class Runner {

    private static final Logger LOG = LoggerFactory.getLogger(Runner.class);

    @Autowired
    private BandRepository repository;

    @PostConstruct
    public void run() {
        List<Band> bandList = repository.findAll();

        for (Band band : bandList) {
            LOG.info("Band name = {}", band.getName());
        }
    }
}
