package com.homelane.service;

import com.homelane.connector.Connector;
import com.homelane.model.DateWiseData;
import com.homelane.model.StateDateWiseData;
import com.homelane.model.StateWiseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Autowired
    Connector connector;

    public DateWiseData searchDateSpecificData(String date) {
        return connector.getDateSpecificData(date).getBody();
    }

    public StateDateWiseData searchDateAndStateSpecificData(String stateName, String date) {
        return null;
    }

    public StateWiseData searchStateSpecificData(String State) {
        return null;
    }
}
