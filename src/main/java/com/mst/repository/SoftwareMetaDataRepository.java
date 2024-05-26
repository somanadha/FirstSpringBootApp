package com.mst.repository;

import com.mst.model.SoftwareMetaData;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Scope("singleton")
public class SoftwareMetaDataRepository {
    public long getSoftwareMetaDataListCount() {
        long softwareMetaDataListCount = 0;
        return softwareMetaDataListCount;
    }
    public  Iterable<? extends SoftwareMetaData> getSoftwareMetaDataList(int startIndex, int endIndex) {
        ArrayList<SoftwareMetaData> SoftwareMetaDataList = null;

        return SoftwareMetaDataList;
    }

}
