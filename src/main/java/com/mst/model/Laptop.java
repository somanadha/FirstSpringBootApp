package com.mst.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public final class Laptop extends Computer {

    public Laptop() {
        setComputerType(ComputerType.LAPTOP);
    }

    @Override
    public void printDetails() {
        System.out.println("Laptop: " + toString());
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
