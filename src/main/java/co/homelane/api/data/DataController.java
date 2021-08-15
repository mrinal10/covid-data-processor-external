package co.homelane.api.data;

import co.homelane.model.DateWiseData;
import co.homelane.model.StateDateWiseData;
import co.homelane.model.StateWiseData;
import co.homelane.service.DataService;
import io.swagger.annotations.*;
import javax.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/external-data")
@Api("Related data on Covid")
@Validated
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }


    @GetMapping("/get_date_info/{date}")
    public DateWiseData getDateSpecificdata(
            @NotBlank(message = "date cannot be blank.")
            @PathVariable("date") String date) {
        return dataService.searchDateSpecificData(date);
    }


    @GetMapping("/get_state_info/{state}")
    public StateWiseData getStateSpecificdata(
            @NotBlank(message = "state name cannot be blank.")
            @PathVariable("state") String state) {
        return dataService.searchStateSpecificData(state);
    }


    @GetMapping("/pinpoint_state/{state}/on/{date}")
    public StateDateWiseData getStateSpecificdata(
            @NotBlank(message = "state name cannot be blank.")
            @PathVariable("state") String state, @PathVariable("date") String date) {
        return dataService.searchDateAndStateSpecificData(state, date);
    }

}