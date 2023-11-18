package io.datajek.spring.basics.movierecommendersystem.lesson16;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    private static int instances = 0;
    private int id;
    private String name;
    private String genre;
    private String producer;
    private Logger logger =
            LoggerFactory.getLogger(this.getClass());
    public Movie() {
        super();
        logger.info("In Movie constructor method");
    }

    @PostConstruct
    private void postConstruct() {
        //initialization code
        logger.info("In Movie postConstruct method");
    }

    @PreDestroy
    private void preDestroy() {
        //cleanup code
        logger.info("In Movie preDestroy method");
    }
    public static int getInstances() {
        return Movie.instances;
    }

    public double movieSimilarity(int movie1, int movie2) {

        double similarity = 0.0;

        //if genres are same add 0.3 to similarity
        //if producers are same add 0.5 to similarity

        return similarity;
    }
}
