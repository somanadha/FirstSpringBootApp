package com.mst;

import com.mst.model.SoftwareMetaData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoftwareMetaDataManagement {
    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(SoftwareMetaDataManagement.class, args);
        SoftwareMetaData firstSpringBootApp = applicationContext.getBean(SoftwareMetaData.class);
        //firstSpringBootApp.printDetails();
        System.out.println(firstSpringBootApp.jacskonSerialize());
    }
}
