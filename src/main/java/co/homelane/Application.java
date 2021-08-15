package co.homelane;

import co.homelane.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

/**
 * Entry point of the service.
 */
@SpringBootApplication
@EnableFeignClients
@Import(AppConfig.class)
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
