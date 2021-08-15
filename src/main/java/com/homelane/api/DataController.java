package com.homelane.api;

import com.homelane.model.DateWiseData;
import com.homelane.model.StateDateWiseData;
import com.homelane.model.StateWiseData;
import com.homelane.service.DataService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

@RestController
@Api("Related data on Covid")
@RequestMapping("/v1/external-data")
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/get_date_info/{date}")
    public DateWiseData getDateSpecificdata(
            @PathVariable("date") String date) {
        return dataService.searchDateSpecificData(date);
    }


    @GetMapping("/get_state_info/{state}")
    public StateWiseData getStateSpecificdata(
            @PathVariable("state") String state) {
        return dataService.searchStateSpecificData(state);
    }


    @GetMapping("/pinpoint_state/{state}/on/{date}")
    public StateDateWiseData getStateSpecificdata(
            @PathVariable("state") String state, @PathVariable("date") String date) {
        return dataService.searchDateAndStateSpecificData(state, date);
    }

}