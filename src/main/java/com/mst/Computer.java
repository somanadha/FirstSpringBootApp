package com.mst;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public abstract class Computer implements DetailsPrintable{

    private final String make;
    private final String model;
    private final String cpu;
    private final byte cores;
    private final byte ramSizeInGB;

    public Computer(String make, String model, String cpu, byte cores, byte ramSizeInGB) {

        this.make = make;
        this.model = model;
        this.cpu = cpu;
        this.cores = cores;
        this.ramSizeInGB = ramSizeInGB;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getCpu() {
        return cpu;
    }

    public byte getCores() {
        return cores;
    }

    public byte getRamSizeInGB() {
        return ramSizeInGB;
    }

    @Override
    public abstract void printDetails();

    @Override
    public String toString() {
        return "{Make: " + make + ", Model: " + model + ", CPU: " + cpu + ", Number of Cores: " + cores + ", RAM Size (in GB): " + ramSizeInGB + "}";
    }
}
