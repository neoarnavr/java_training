package com.arnav.spring.withspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.arnav.spring.training.Student;

@Configuration
public class JavaConfig {
    @Bean
    public Student getStudent(){
        return new Student(40);
    }
}
