package com.mst.service;

import com.mst.model.SoftwareMetaData;
import com.mst.repository.SoftwareMetaDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Scope("singleton")
public class SoftwareMetaDataService {
    @Autowired
    private SoftwareMetaDataRepository repositoryService;

    public long getSoftwareMetaDataListCount() {
        return repositoryService.getSoftwareMetaDataListCount();
    }

    public SoftwareMetaData getSoftwareMetaData(String softwareID) {
        return repositoryService.findOne(softwareID);
    }

    public  Iterable<? extends SoftwareMetaData> getSoftwareMetaDataList(int startIndex, int endIndex) {
        return repositoryService.findAll(startIndex, endIndex);
    }

    public void addSoftwareMetaData(String softwareID, SoftwareMetaData softwareMetaData) {
        repositoryService.save(softwareID, softwareMetaData);
    }
}
