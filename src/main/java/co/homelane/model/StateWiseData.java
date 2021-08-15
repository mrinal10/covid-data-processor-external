package co.homelane.model;

import co.homelane.model.pojo.InfectionData;
import co.homelane.model.pojo.TestingData;
import co.homelane.model.pojo.VaccinationData;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StateWiseData {
    String stateName;

    List<TestingData> stateWiseTestingDetails;
    List<InfectionData> infectionDetails;
    List<VaccinationData> vaccinationDetails;
}