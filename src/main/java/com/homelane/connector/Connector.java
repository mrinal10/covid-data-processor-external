package com.homelane.connector;

import com.homelane.model.DateWiseData;
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
        return restTemplate.exchange("http://localhost:8080/rest/api/v1/internal-data/on-date/"+date,
                HttpMethod.GET, null, DateWiseData.class);
    }
}
