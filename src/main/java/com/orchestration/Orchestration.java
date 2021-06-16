package com.orchestration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Orchestration
{
    public static void main(String[] args)
    {
        SpringApplication.run(Orchestration.class, args);
        System.out.println("Orchestration works!");
    }
}
