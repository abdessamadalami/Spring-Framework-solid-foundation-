package io.datajek.spring.basics.movierecommendersystem.lesson16;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ContentBasedFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static int instences = 0;

    public ContentBasedFilter() {
        super();
        logger.info("In ContentBasedFilter constructor method");
    }

    public String[] getRecommendations(String movie) {
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }

    @PostConstruct
    public void Postconstruct() {
        logger.info("ContentBasedFilter form Postconstruct method");
    }
    @PreDestroy
    private void preDestroy() {
        //clear movies from cache
        logger.info("In ContentBasedFilter preDestroy method");
    }

}



