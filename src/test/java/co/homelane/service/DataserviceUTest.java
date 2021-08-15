package co.homelane.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith({MockitoExtension.class})
public class DataserviceUTest {


    private DataService dataService;

    @BeforeEach
    void setup() {
        dataService = new DataServiceImpl();
    }

    @Test
    void searchDateSpecificDataTest() {
        String date = "2020-04-02";
        assertDoesNotThrow(() -> dataService.searchDateSpecificData(date));
    }

    @Test
    void searchStateSpecificDataTest() {
        String date = "Andhra Pradesh";
        assertDoesNotThrow(() -> dataService.searchStateSpecificData(date));
    }

    @Test
    void searchDateStateSpecificDataTest() {
        String date = "2020-04-02";
        String state = "Andhra Pradesh";
        assertDoesNotThrow(() -> dataService.searchDateAndStateSpecificData(state, date));
    }

}
