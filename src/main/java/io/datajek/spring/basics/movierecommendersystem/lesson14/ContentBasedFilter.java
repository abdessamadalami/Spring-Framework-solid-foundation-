package io.datajek.spring.basics.movierecommendersystem.lesson14;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Named;

@Named
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {

    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}