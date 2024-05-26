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
        long softwareMetaDataListCount = 0;
        return softwareMetaDataListCount;
    }

    public  Iterable<? extends SoftwareMetaData> getSoftwareMetaDataList(int startIndex, int endIndex) {
        ArrayList<SoftwareMetaData> SoftwareMetaDataList = null;

        return SoftwareMetaDataList;
    }
}
