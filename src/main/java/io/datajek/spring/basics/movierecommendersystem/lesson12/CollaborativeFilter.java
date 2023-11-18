package io.datajek.spring.basics.movierecommendersystem.lesson12;

import javax.inject.Named;
import org.springframework.beans.factory.annotation.Qualifier;

@Named
@Qualifier("CF")
public class CollaborativeFilter implements Filter{

    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}