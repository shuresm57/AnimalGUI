package org.example.animalopgave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "controller")
public class AnimalOpgaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnimalOpgaveApplication.class, args);
    }

}
