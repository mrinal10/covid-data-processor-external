package co.homelane.config;

import co.homelane.config.properties.BookingNotificationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import java.util.TimeZone;

/**
 * General configuration of the application.
 */
@ComponentScan(basePackages = {"co.tide.homelane"})
@EnableConfigurationProperties(BookingNotificationProperties.class)
public class AppConfig {

    static {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC/Greenwich"));
    }

}