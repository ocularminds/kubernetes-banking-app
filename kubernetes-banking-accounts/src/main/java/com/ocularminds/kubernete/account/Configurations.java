package com.ocularminds.kubernete.account;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ocularminds.kubernetes.account")
public class Configurations {

    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }

}
