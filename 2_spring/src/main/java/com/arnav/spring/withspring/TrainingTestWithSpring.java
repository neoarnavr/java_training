package com.arnav.spring.withspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arnav.spring.training.Student;
import com.arnav.spring.training.TrainingService;

public class TrainingTestWithSpring {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student.getAge());
    }


}
