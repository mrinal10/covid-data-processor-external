package co.homelane.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "tide.marketplace.booking.push.notification")
public class BookingNotificationProperties {

    private final String title;

    private final String bodyFormat;

    public String getTitle() {
        return title;
    }

    public String getBodyFormat() {
        return bodyFormat;
    }

    public BookingNotificationProperties(String title, String bodyFormat) {
        this.title = title;
        this.bodyFormat = bodyFormat;
    }
}
