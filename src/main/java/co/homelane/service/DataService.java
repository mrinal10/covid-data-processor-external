package co.homelane.service;

import co.homelane.model.DateWiseData;
import co.homelane.model.StateDateWiseData;
import co.homelane.model.StateWiseData;

public interface DataService {


    /**
     * get all the data for all states/UTs on that date
     *
     * @param date  c
     * @return A response containing all the data on that date.
     */
    DateWiseData searchDateSpecificData(String date);

    /**
     * get all the data for a specific state or UT for that date
     *
     * @param date
     * @return A response containing all the data on that date.
     */
    StateDateWiseData searchDateAndStateSpecificData(String stateName, String date);


    /**
     * get all the data for the state on all available dates
     *
     * @param State name of the state for which data is required
     * @return A response containing all the data of that state.
     */
    StateWiseData searchStateSpecificData(String State);
}
