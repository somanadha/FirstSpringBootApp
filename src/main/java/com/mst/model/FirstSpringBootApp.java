package com.mst.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mst.model.interfaces.DetailsPrintable;
import com.mst.model.interfaces.JacksonSerializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope ("prototype")
public class FirstSpringBootApp implements DetailsPrintable, JacksonSerializable {

    @Autowired
    private Developer developer = null;
    @Autowired
    private Computer computer = null;
    @Autowired
    private Compiler compiler = null;

    public FirstSpringBootApp() {
        // Default constructor that expects getter & setter to work for onetime
    }

//    public FirstSpringBootApp(Developer developer,
//                          @Qualifier("desktop") Computer computer,
//                          Compiler compiler) {
//        this.setDeveloper(developer);
//        this.setComputer(computer);
//        this.setCompiler( compiler);
//    }

    public Developer getDeveloper() {
        return developer;
    }

    public Computer getComputer() {
        return computer;
    }

    public Compiler getCompiler() {
        return compiler;
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
        return jacskonSerialize();
    }
}