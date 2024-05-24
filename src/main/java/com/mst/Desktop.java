package com.mst;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Primary
public final class Desktop extends Computer{
    public Desktop(@Value("HP") String make, @Value ("Pavilion") String model,  @Value("AMD Athlon") String cpu,
                   @Value("16") byte cores, @Value("32") byte ramSizeInGB) {
        super(make, model, cpu, cores, ramSizeInGB);
    }

    @Override
    public void printDetails() {
        System.out.println("Desktop: " + toString());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
