package com.example.testbotdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
@EnableScheduling
public class TestBotDemoApplication {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        SpringApplication.run(TestBotDemoApplication.class, args);
    }

}
