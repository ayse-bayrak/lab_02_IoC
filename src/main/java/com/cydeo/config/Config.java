package com.cydeo.config;

import com.cydeo.Currency;
import com.cydeo.account.Current;
import com.cydeo.account.Saving;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.UUID;

@Configuration
public class Config {

    @Bean
    public Currency currency() {
        return new Currency();
    }

    @Bean
    public Current current(Currency a) {
        return new Current(a, BigDecimal.ONE, UUID.randomUUID());
    }
    @Bean
    public Saving saving(Currency b) {
        return new Saving(b, BigDecimal.TWO, UUID.randomUUID());
    }
}
