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
public class Compiler implements DetailsPrintable, JacksonSerializable {
    @Value("CPP")
    private String language = null;

    @Value("23.0.0")
    private String version = null;

    public Compiler() {

    }

    public Compiler(String language, String version) {
        this.setLanguage(language);
        this.setVersion(version);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        if (this.language == null) {
            this.language = language;
        }
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        if (this.version == null) {
            this.version = version;
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Compiler Used: " + toString());
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
        return "{Language: " + language + ", Version: " + version + "}";
    }
}
