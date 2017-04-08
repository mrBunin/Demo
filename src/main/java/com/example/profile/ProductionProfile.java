package com.example.profile;

import com.example.WorkEnvironment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Oleg Shabunin on 4/8/2017.
 */

@Configuration
@Profile("prod")
public class ProductionProfile {

    @Bean
    public WorkEnvironment environment() {
        return new WorkEnvironment();
    }
}
