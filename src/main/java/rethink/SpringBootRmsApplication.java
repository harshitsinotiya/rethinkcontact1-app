package rethink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(scanBasePackages = {"rethink", "rethink.controller", "rethink.service", "rethink.repository"})

public class SpringBootRmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRmsApplication.class, args);
    }
}

