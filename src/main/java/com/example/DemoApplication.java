package com.example;

import com.example.setup.FooProperties;
import com.example.setup.MoreProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
@PropertySource(value = {"classpath:application.properties", "classpath:more.properties"})
@EnableConfigurationProperties(FooProperties.class)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public ParamPublisher publisher() {
        return new ParamPublisher();
    }

    @Bean
    public FooProperties fooProperties() {
        return new FooProperties();
    }

    @Bean
    public MoreProperties moreProperties() {
        return new MoreProperties();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
