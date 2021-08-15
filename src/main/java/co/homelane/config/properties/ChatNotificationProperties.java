package co.homelane.config.properties;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatNotificationProperties {

    String title;

    String singleSenderBody;

    String multipleSendersBody;
}
