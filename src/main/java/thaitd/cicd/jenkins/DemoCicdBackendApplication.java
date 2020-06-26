package thaitd.cicd.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class DemoCicdBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCicdBackendApplication.class, args);
    }

}
