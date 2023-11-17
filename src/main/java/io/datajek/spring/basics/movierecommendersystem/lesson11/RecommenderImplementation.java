package io.datajek.spring.basics.movierecommendersystem.lesson11;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class RecommenderImplementation {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private Filter filter;
    // the autowired here is powerful
     @PostConstruct
     public void PostConstruct()
     {
         //initialize our code here
         logger.info("In RecommenderImplementation From PostConstruct method");
     }

    @Autowired
    public void setFilter(Filter filter) {
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }

    @PreDestroy
    public void preDestroy() {
        //cleanup code
        logger.info("In RecommenderImplementation preDestroy method");
    }
    public String[] recommendMovies(String movie)
    {
      System.out.println("Name of the filter in use : "+ filter +"\n");
      String[] result = filter.getRecommendations(movie);
      return result;
    }
}
