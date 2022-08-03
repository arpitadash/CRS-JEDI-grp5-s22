package com.flipkart.RestController;

import org.glassfish.jersey.server.ResourceConfig;


public class ApplicationConfig extends ResourceConfig {
    public ApplicationConfig() {
        register(UserRestApi.class);
        register(ProfessorRestApi.class);
    }
}