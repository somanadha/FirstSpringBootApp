package com.mst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Compiler implements DetailsPrintable {
    private final String language;
    private final String version;

    public Compiler(@Autowired @Value("CPP") String language,
                    @Autowired @Value("23.0.0") String version) {
        this.language = language;
        this.version = version;
    }

    @Override
    public void printDetails() {
        System.out.println("Compiler Used: " + toString());
    }

    @Override
    public String toString() {
        return "{Language: " + language + ", Version: " + version + "}";
    }
}
