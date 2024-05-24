package com.mst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(App.class, args);
        FirstSpringBootApp firstSpringBootApp = applicationContext.getBean(FirstSpringBootApp.class);
        firstSpringBootApp.printDetails();
    }

}
