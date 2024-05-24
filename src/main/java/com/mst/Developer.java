package com.mst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Developer implements DetailsPrintable {
    private final String name;
    private final byte experienceInYears;

    public Developer(@Autowired @Value("Satya Dev") String name,
                     @Autowired @Value("28") byte experienceInYears) {
        this.name = name;
        this.experienceInYears = experienceInYears;
    }

    public String getName() {
        return name;
    }

    public byte getExperienceInYears() {
        return experienceInYears;
    }

    @Override
    public void printDetails() {
        System.out.println("Development Done By: "+toString());
    }

    @Override
    public String toString() {
        return "{Name: " + name + ", Experience (in years): " + experienceInYears+ "}";
    }
}
