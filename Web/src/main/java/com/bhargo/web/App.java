package com.bhargo.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Executing the run method");
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
