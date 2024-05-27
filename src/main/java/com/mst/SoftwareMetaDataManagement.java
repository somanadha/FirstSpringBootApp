package com.mst;

import com.mst.model.SoftwareMetaData;
import com.mst.service.SoftwareMetaDataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoftwareMetaDataManagement {
    public static void main(String[] args) {

        var applicationContext = SpringApplication.run(SoftwareMetaDataManagement.class, args);
        SoftwareMetaDataService service = applicationContext.getBean(SoftwareMetaDataService.class);
        SoftwareMetaData softwareMetaData = service.getSoftwareMetaData("SoftwareMetaDataManagement");
        System.out.println(softwareMetaData.toJsonString());
    }
}
