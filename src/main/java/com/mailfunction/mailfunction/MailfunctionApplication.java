package com.mailfunction.mailfunction;

import it.ozimov.springboot.mail.configuration.EnableEmailTools;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEmailTools
public class MailfunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailfunctionApplication.class, args);
    }
}
