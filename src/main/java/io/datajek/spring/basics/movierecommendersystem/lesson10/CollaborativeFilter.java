package io.datajek.spring.basics.movierecommendersystem.lesson10;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()

// wc can use this(Good practice):
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// or this
// @Scope("prototype")
public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {
        return new String[]{"Finding Filrer", "Ice Age", "Toy Story"};
    }
}
