package com.mst.model;

import com.mst.model.interfaces.DetailsPrintable;
import com.mst.model.interfaces.JacksonSerializable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public abstract class Computer implements DetailsPrintable, JacksonSerializable {

    private String make = null;
    private String model = null;
    private String cpu = null;
    private byte cores = 0;
    private byte ramSizeInGB = 0;

    public Computer(){

    }

    public Computer(String make, String model, String cpu, byte cores, byte ramSizeInGB) {

        this.setMake(make);
        this.setModel(model);
        this.setCpu(cpu);
        this.setCores(cores);
        this.setRamSizeInGB(ramSizeInGB);
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

    public void setMake(String make) {
        if (this.make == null) this.make = make;
    }

    public void setModel(String model) {
        if (this.model == null) this.model = model;
    }

    public void setCpu(String cpu) {
        if (this.cpu == null) this.cpu = cpu;
    }

    public void setCores(byte cores) {
        if (this.cores == 0 && cores > 0) this.cores = cores;
    }

    public void setRamSizeInGB(byte ramSizeInGB) {
        if (this.ramSizeInGB == 0 && ramSizeInGB > 0) this.ramSizeInGB = ramSizeInGB;
    }

    @Override
    public abstract void printDetails();

    @Override
    public String toString() {
        return jacskonSerialize();
    }
}
