package com.mst.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mst.model.interfaces.DetailsPrintable;
import com.mst.model.interfaces.JacksonSerializable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Developer implements DetailsPrintable, JacksonSerializable {

    @Value("Satya Dev")
    private String name = null;

    @Value("28")
    private byte experienceInYears = -1;

    public Developer() {

    }

    public Developer(String name,
                     byte experienceInYears) {
        this.setName(name);
        this.setExperienceInYears(experienceInYears);
    }

    public String getName() {
        return name;
    }

    public byte getExperienceInYears() {
        return experienceInYears;
    }

    public void setName(String name) {
        if (this.name == null) this.name = name;
    }

    public void setExperienceInYears(byte experienceInYears) {
        if (this.experienceInYears == -1 && experienceInYears >= 0 ) this.experienceInYears = experienceInYears;
    }

    @Override
    public void printDetails() {
        System.out.println("Development Done By: "+toString());
    }

    @Override
    public String jacskonSerialize() {
        String jacksonString="";
        ObjectMapper jacksonObjectMapper = new ObjectMapper();
        try {
            jacksonObjectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return jacksonString;
    }

    @Override
    public String toString() {
        return "{Name: " + name + ", Experience (in years): " + experienceInYears+ "}";
    }
}
