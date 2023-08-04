package clrsoft.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigs {

    @Bean
    public Test test() {
        return new Test();
    }
}
