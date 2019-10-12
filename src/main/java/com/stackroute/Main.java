package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {

//        using xmlBeanFactory
        System.out.println("Using XmlBeanFactory");
        XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie=factory.getBean("movie",Movie.class);
        system.out.println(movie.getActorDetails());

//        using ApplicationContext
        System.out.println("Using ApplicationContext");
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context.getBean("movie",Movie.class);
        system.out.println(movie1.getActorDetails());
    }
}
