package peaksoft.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.KoscheiTheDeathless;
import peaksoft.model.*;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
}