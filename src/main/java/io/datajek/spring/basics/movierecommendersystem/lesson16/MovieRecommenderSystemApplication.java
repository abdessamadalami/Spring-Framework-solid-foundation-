//package io.datajek.spring.basics.movierecommendersystem;
package io.datajek.spring.basics.movierecommendersystem.lesson16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {


    public static void main(String[] args) {
        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //retrieve bean from the application context
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");

        //display results
        System.out.println(Arrays.toString(result));
    }
}
