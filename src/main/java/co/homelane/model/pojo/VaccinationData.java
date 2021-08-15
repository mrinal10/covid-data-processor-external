package co.homelane.model.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class VaccinationData {

    String date;
    String stateName;
    String total_doses_administered;
    String total_sessions_conducted;
    String total_sites;
    String first_dose_administered;
    String second_dose_administered;
    String male_individuals_vaccinated;
    String female_individuals_vaccinated;
    String transgender_individuals_vaccinated;
    String total_covaxin_administered;
    String total_covishield_administered;
    String total_sputnik_v_administered;
    String aefi;
    String age_18_45_years;
    String age_45_60_years;
    String age_60_above_years;
    String total_individuals_vaccinated;
}
