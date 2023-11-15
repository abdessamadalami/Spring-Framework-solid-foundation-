package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    private Filter contentBasedFilter;


    public String[] recommendMovies(String movie)
    {
      System.out.println("Name of the filter in use : "+ contentBasedFilter +"\n");
      String[] result = contentBasedFilter.getRecommendations(movie);
      return result;
    }
}
