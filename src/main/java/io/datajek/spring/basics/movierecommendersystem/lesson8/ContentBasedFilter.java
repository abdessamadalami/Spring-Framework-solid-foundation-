package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
@Primary
@Qualifier("filter1")
public class ContentBasedFilter implements Filter {


    public String[] getRecommendations(String movie)
    {
      return new String[] {"Happy Feet Base", "Ice Age", "Shark Tale"};
    }


}
