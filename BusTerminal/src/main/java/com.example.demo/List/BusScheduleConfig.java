package com.example.demo.List;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.List;

@Configuration
public class BusScheduleConfig {
    @Bean
    CommandLineRunner commandLineRunner(BusScheduleRepository repository) {
        return args -> {
            Bus shopElement1 = new Bus(
                    "204",
                    "Berlin",
                    LocalTime.of(17, 30),
                    "Hamburg"
            );
            Bus shopElement2 = new Bus(
                    "211",
                    "London",
                    LocalTime.of(12, 10),
                    "Menchester"
            );
            repository.saveAll(
                    List.of(shopElement1, shopElement2)
            );

        };
    }
}
