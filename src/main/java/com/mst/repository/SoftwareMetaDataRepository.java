package com.mst.repository;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mst.model.SoftwareMetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Repository
@Scope("singleton")
public class SoftwareMetaDataRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate = null;

    public long getSoftwareMetaDataListCount() {
        long softwareMetaDataListCount = 0;
        return softwareMetaDataListCount;
    }

    public  Iterable<? extends SoftwareMetaData> findAll(int startIndex, int endIndex) {
        ArrayList<SoftwareMetaData> SoftwareMetaDataList = null;

        return SoftwareMetaDataList;
    }

    public SoftwareMetaData findOne(String softwareID) {
        SoftwareMetaData softwareMetaData = null;
        StringBuffer stringBuffer = new StringBuffer();
        jdbcTemplate.query("SELECT * FROM SOFTWARE_META_DATA WHERE SOFTWARE_ID = '"+ softwareID+"'",
                (resultSet) -> {stringBuffer.append(resultSet.getString(2));});

        String softwareMetaDataJson = stringBuffer.toString();
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(softwareMetaDataJson);
        try {
            softwareMetaData  = objectMapper.readValue(softwareMetaDataJson, SoftwareMetaData.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return softwareMetaData;
    }

    public void save(String softwareID, SoftwareMetaData softwareMetaData) {
    }
}
