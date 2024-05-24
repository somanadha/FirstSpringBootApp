package com.mst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
@Scope ("prototype")
public class FirstSpringBootApp implements DetailsPrintable {

    private final Developer developer;
    private final Computer computer;
    private final Compiler compiler;

    public FirstSpringBootApp(@Autowired Developer developer,
                          @Autowired @Qualifier("laptop") Computer computer,
                          @Autowired Compiler compiler) {
        this.developer = developer;
        this.computer = computer;
        this.compiler = compiler;
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

    public void printDetails() {
        developer.printDetails();
        computer.printDetails();
        compiler.printDetails();
    }
}