package com.przemyslowe.lab4.zad3.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.przemyslowe.lab4.zad3.domain.Person;

@Configuration
public class PersonServiceConfig {
    
    @Bean
    public Person prezes() {
        return new Person("Chrystal", "Havoc", "chavocr@yahoo.com", "Mymm");
    }

    @Bean 
    public Person wiceprezes() {
        return new Person("Halley", "Gadaud", "hgadaud9@sohu.com", "Oyope");
    }

    @Bean
    public Person sekretarka() {
        return new Person("Kirbie", "Wrettum", "kwrettumj@slideshare.net", "Browsetype");
    }
}
