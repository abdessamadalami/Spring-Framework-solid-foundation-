//package io.datajek.spring.basics.movierecommendersystem;
package io.datajek.spring.basics.movierecommendersystem.lesson8;

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
        RecommenderImplementation recommender1 = appContext.getBean(RecommenderImplementation.class);
        RecommenderImplementation recommender2 = appContext.getBean(RecommenderImplementation.class);


        CollaborativeFilter collaborative1 = appContext.getBean(CollaborativeFilter.class);
        CollaborativeFilter collaborative2 = appContext.getBean(CollaborativeFilter.class);
        CollaborativeFilter collaborative3 = appContext.getBean(CollaborativeFilter.class);

        ContentBasedFilter  contentBasedFilter1 = appContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter  contentBasedFilter2 = appContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter  contentBasedFilter3 = appContext.getBean(ContentBasedFilter.class);

        //singleTon
        System.out.println(contentBasedFilter1);
        System.out.println(contentBasedFilter2);
        System.out.println(contentBasedFilter3);
        // prototyoe
        System.out.println(collaborative1);
        System.out.println(collaborative2);
        System.out.println(collaborative3);


    }
}
