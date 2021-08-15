package co.homelane.model.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class InfectionData {
    String sno;
    String date;
    String time;
    String state_unionterritory;
    String confirmedindiannational;
    String confirmedforeignnational;
    String cured;
    String deaths;
    String confirmed;
}
