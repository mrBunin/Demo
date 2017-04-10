package com.example;

import com.example.model.Band;
import com.example.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static java.util.Arrays.asList;

/**
 * Created by Oleg Shabunin on 4/9/2017.
 */

@Component
@Profile("test")
public class DataLoader {

    @Autowired
    BandRepository bandsRepository;

    @PostConstruct
    public void load() {
        bandsRepository.save(asList(
                new Band("Metallica", "Los Angeles", 1981),
                new Band("Nirvana", "Seattle", 1987))
        );
    }
}
