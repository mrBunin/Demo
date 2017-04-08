package com.example.profile;

import com.example.DataLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Oleg Shabunin on 4/8/2017.
 */

@Configuration
@Profile("test")
public class TestProfile {

    @Bean
    public DataLoader dataLoader() {
        return new DataLoader();
    }
}
