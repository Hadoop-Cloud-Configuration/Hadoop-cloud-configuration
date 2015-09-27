package com.platform;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sequenceiq.ambari.client.AmbariClient;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
    	AmbariClient test = new AmbariClient(); 
        SpringApplication.run(Application.class, args);
    }
}