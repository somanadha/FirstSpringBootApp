package com.mst.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mst.model.interfaces.DetailsPrintable;
import com.mst.model.interfaces.JsonSerializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope ("prototype")
public class SoftwareMetaData implements DetailsPrintable, JsonSerializable {
    @JsonIgnore
    private String softwareID = null;

    @Autowired
    private Developer developer = null;

    @Autowired
    private Computer computer = null;

    @Autowired
    private Compiler compiler = null;

    public SoftwareMetaData() {
        // Default constructor that expects getter & setter to work for onetime
    }

    public String getSoftwareID() {
        return softwareID;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public Computer getComputer() {
        return computer;
    }

    public Compiler getCompiler() {
        return compiler;
    }

    public void setSoftwareID(String softwareID) {
        if (this.softwareID == null) {
            this.softwareID = softwareID;
        }
    }

    public void setDeveloper(Developer developer) {
        if (this.developer == null)  {
            this.developer = developer;
        }
    }

    public void setComputer(Computer computer) {
        if (this.computer == null)  {
            this.computer = computer;
        }
    }

    public void setCompiler(Compiler compiler) {
        if (this.compiler == null)  {
            this.compiler = compiler;
        }
    }

    public void printDetails() {
        developer.printDetails();
        computer.printDetails();
        compiler.printDetails();
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