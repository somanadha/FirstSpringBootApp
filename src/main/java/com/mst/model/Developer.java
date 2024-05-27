package com.mst.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mst.model.interfaces.DetailsPrintable;
import com.mst.model.interfaces.JsonSerializable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Developer implements DetailsPrintable, JsonSerializable {

    private String name = null;

    private byte experienceInYears = -1;

    public Developer() {

    }

    public String getName() {
        return name;
    }

    public byte getExperienceInYears() {
        return experienceInYears;
    }

    public void setName(String name) {
        if (this.name == null) {
            this.name = name;
        }
    }

    public void setExperienceInYears(byte experienceInYears) {
        if (this.experienceInYears == -1 && experienceInYears >= 0 ) {
            this.experienceInYears = experienceInYears;
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Development Done By: "+toString());
    }

    @Override
    public String toJsonString() {
        String jacksonString="";
        ObjectMapper jacksonObjectMapper = new ObjectMapper();
        try {
            jacksonString = jacksonObjectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return jacksonString;
    }

    @Override
    public String toString() {
        return toJsonString();
    }
}
