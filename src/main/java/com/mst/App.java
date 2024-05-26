package com.mst;

import com.mst.model.SoftwareMetaData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(App.class, args);
        SoftwareMetaData firstSpringBootApp = applicationContext.getBean(SoftwareMetaData.class);
        //firstSpringBootApp.printDetails();
        System.out.println(firstSpringBootApp.jacskonSerialize());
    }
}
