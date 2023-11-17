//package io.datajek.spring.basics.movierecommendersystem;
package io.datajek.spring.basics.movierecommendersystem.lesson10.lesson9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
//@ComponentScan(basePackages = "io.datajek.spring.basics.movierecommendersystem.lesson10")

//@ComponentScan(basePackages={"io.datajek.spring.basics.movierecommendersystem.lesson10",
//        "io.datajek.spring.basics.movierecommendersystem.lesson10"})
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class, args);

        System.out.println("ContentBasedFilter bean found = " +
                appContext.containsBean("contentBasedFilter"));
        System.out.println("CollaborativeFilter bean found = " +
                appContext.containsBean("collaborativeFilter")); // false because we use @SpringBootApplication and true when we use ComponentScan became true
    }
}
