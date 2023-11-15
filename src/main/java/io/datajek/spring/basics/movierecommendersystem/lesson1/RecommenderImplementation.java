package io.datajek.spring.basics.movierecommendersystem.lesson1;

import io.datajek.spring.basics.movierecommendersystem.lesson2.ContentBasedFilter;

public class RecommenderImplementation {
    public String[] recommendMovies(String movie)
    {
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
