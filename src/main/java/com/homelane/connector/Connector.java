package com.homelane.connector;

import com.homelane.model.DateWiseData;
import com.homelane.model.StateDateWiseData;
import com.homelane.model.StateWiseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Connector {

    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<DateWiseData> getDateSpecificData(String date) {
        return restTemplate.exchange("https://covid-data-internal.herokuapp.com/rest/api/v1/internal-data/on-date/"
                        +date,
                HttpMethod.GET, null, DateWiseData.class);
    }

    public ResponseEntity<StateWiseData> getStateSpecificData(String stateName) {
        return restTemplate.exchange("https://covid-data-internal.herokuapp.com/rest/api/v1/internal-data/of-state/"
                        +stateName,
                HttpMethod.GET, null, StateWiseData.class);
    }

    public ResponseEntity<StateDateWiseData> getPinpointData(String stateName, String date) {
        return restTemplate.exchange("https://covid-data-internal.herokuapp.com/rest/api/v1/internal-data/of-state/"+stateName+"/on/"
                        +date,
                HttpMethod.GET, null, StateDateWiseData.class);
    }
}
