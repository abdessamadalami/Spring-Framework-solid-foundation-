package io.datajek.spring.basics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    @Qualifier("filter1")
    private Filter filter;


    public String[] recommendMovies(String movie)
    {
      System.out.println("Name of the filter in use : "+ filter +"\n");
      String[] result = filter.getRecommendations(movie);
      return result;
    }
}
