package com.homelane.model;

import com.homelane.model.pojo.InfectionData;
import com.homelane.model.pojo.TestingData;
import com.homelane.model.pojo.VaccinationData;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StateDateWiseData {
    String stateName;
    String date;

    List<TestingData> stateWiseTestingDetails;
    List<InfectionData> infectionDetails;
    List<VaccinationData> vaccinationDetails;
}
