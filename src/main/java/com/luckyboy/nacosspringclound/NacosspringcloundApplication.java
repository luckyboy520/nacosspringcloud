package com.luckyboy.nacosspringclound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class NacosspringcloundApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosspringcloundApplication.class, args);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String userName = environment.getProperty("user.name");
        String userAge = environment.getProperty("user.age");
        String env = environment.getProperty("current.env");
        System.err.println("user name :"+userName+"; age: "+userAge + "; env : " + env);
    }

}
