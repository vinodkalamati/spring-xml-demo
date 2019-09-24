package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {

//        using xmlBeanFactory
//        System.out.println("Using XmlBeanFactory");
//        XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie movie=factory.getBean("movie",Movie.class);
//        movie.getdetails();

//        using ApplicationContext

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie3",Movie.class);
        movie.getdetails();
        Movie movie1=context.getBean("movie1",Movie.class);
        movie1.getdetails();


        //        System.out.println(movie1.getBeanName());
//        System.out.println(movie1.getContext());
//        Movie movie3=context.getBean("movie3",Movie.class);
//        movie3.getdetails();
//        System.out.println(movie1==movie2);
//        Movie movie4=context.getBean("movie4",Movie.class);
//        movie4.getdetails();
//        Movie movie5=context.getBean("movie5",Movie.class);
//        movie5.getdetails();
    }
}
