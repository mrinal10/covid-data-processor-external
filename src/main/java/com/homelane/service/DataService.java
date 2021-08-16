package com.homelane.service;

import com.homelane.connector.Connector;
import com.homelane.model.DateWiseData;
import com.homelane.model.StateDateWiseData;
import com.homelane.model.StateWiseData;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Autowired
    Connector connector;

    Logger logger = Logger.getLogger(String.valueOf(DataService.class));

    public DateWiseData searchDateSpecificData(String date) {

        if(!validateDate(date)) {
            logger.fine("Invalid date");
            return null;
        }
        return connector.getDateSpecificData(date).getBody();
    }

    public StateDateWiseData searchDateAndStateSpecificData(String stateName, String date) {
        if(!validateDate(date)) {
            logger.fine("Invalid date");
            return null;
        }
        return connector.getPinpointData(stateName, date).getBody();
    }

    public StateWiseData searchStateSpecificData(String state) {
        return connector.getStateSpecificData(state).getBody();
    }

    private boolean validateDate(String date) {
        return true;
    }
}
