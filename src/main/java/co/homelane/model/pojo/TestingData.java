package co.homelane.model.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TestingData {
    String date;
    String stateName;
    String testSampleCount;
    String positiveCount;
    String negativeCount;
}
