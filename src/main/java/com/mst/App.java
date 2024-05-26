package com.mst;

import com.mst.model.FirstSpringBootApp;
import com.mst.model.interfaces.DetailsPrintable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(App.class, args);
        FirstSpringBootApp firstSpringBootApp = applicationContext.getBean(FirstSpringBootApp.class);
        firstSpringBootApp.printDetails();
    }

    public enum Language implements DetailsPrintable {
        Java, CSharp, CPP, Python, JavaScript;


        private Language () {

        }

        @Override
        public void printDetails() {
            System.out.println("Developed Using: " + toString());
        }

        @Override
        public String toString() {
            return "{" + name() + "}";
        }
    }
}
