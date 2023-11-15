//package io.datajek.spring.basics.movierecommendersystem;
package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//use ApplicationContext to find which filter is being used
		System.out.println("Calling getBean() on RecommenderImplementation");
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println(Arrays.toString(result));


		RecommenderImplementation2 recommender2 = appContext.getBean(
				RecommenderImplementation2.class);

		result = recommender2.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));
	}
}
