package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
public class ContentBasedFilter implements Filter {

    private  static  int instences = 0;
    @Autowired
    private Movie movie;

    public ContentBasedFilter() {
        instences++;
        System.out.println("ContentBaseFilter constructor called");
    }

    public Movie getMovie() {
        return movie;
    }
    public static int getInstances()
    {
        return instences;
    }
    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {
        //calculate similarity between movies
        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

}



