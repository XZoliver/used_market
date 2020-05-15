package com.xzoliver.used_market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class UsedMarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsedMarketApplication.class, args);
    }

}
