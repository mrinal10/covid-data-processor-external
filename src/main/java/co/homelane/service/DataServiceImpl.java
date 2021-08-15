package co.homelane.service;

import co.homelane.model.DateWiseData;
import co.homelane.model.StateDateWiseData;
import co.homelane.model.StateWiseData;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {



    @Override
    public DateWiseData searchDateSpecificData(String date) {

        return null;
    }

    @Override
    public StateDateWiseData searchDateAndStateSpecificData(String stateName, String date) {
        return null;
    }

    @Override
    public StateWiseData searchStateSpecificData(String State) {
        return null;
    }
}
