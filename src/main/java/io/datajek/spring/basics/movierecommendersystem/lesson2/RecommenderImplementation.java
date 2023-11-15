package io.datajek.spring.basics.movierecommendersystem.lesson2;

import io.datajek.spring.basics.movierecommendersystem.lesson2.ContentBasedFilter;

public class RecommenderImplementation {

    private Filter filter;
    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }

    public String[] recommendMovies(String movie)
    {
      System.out.println("Name of the filter in use : "+ filter+"\n");
      String[] result = filter.getRecommendations(movie);
      return result;
    }
}
