package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {

    private Filter filter;

    @Autowired
    @Qualifier("contentBasedFilter")
//    @Qualifier("collaborativeFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter method invoked..*****");
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use : " + filter + "\n");
        String[] result = filter.getRecommendations(movie);
        return result;
    }
}
