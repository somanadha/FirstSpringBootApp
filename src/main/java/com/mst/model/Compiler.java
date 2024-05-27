package com.mst.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mst.model.interfaces.DetailsPrintable;
import com.mst.model.interfaces.JsonSerializable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Compiler implements DetailsPrintable, JsonSerializable {

    public enum Language {
        None, Java, CSharp, CPP, Python, JavaScript;
    }

    private Language language = Language.None;
    private String version = null;

    public Compiler() {

    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        if (this.language == Language.None) {
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
