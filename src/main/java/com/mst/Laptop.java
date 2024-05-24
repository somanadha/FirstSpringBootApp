package com.mst;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public final class Laptop extends Computer{
    public Laptop(@Value("Dell") String make, @Value("Inspiron") String model, @Value("Intel Core I7") String cpu,
                  @Value("8") byte cores, @Value("16") byte ramSizeInGB) {
        super(make, model, cpu, cores, ramSizeInGB);
    }

    @Override
    public void printDetails() {
        System.out.println("Laptop: " + toString());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
