Api-key: authentication
Api-value: thisisnottheapikey

The URLS format and examples are as follows

URL 1)  
https://covid-data-external.herokuapp.com/get_date_info/{date}
https://covid-data-external.herokuapp.com/get_date_info/2021-02-04


URL 2  
https://covid-data-external.herokuapp.com/get_state_info/{state}
https://covid-data-external.herokuapp.com/get_state_info/Sikkim



URL 3: 
https://covid-data-external.herokuapp.com/pinpoint_state/{state}/on/{date}
https://covid-data-external.herokuapp.com/pinpoint_state/Sikkim/on/{date}



Project Type: 
This is a spring boot microservice app

This application is user facing app, only accessible through the api KEY - VALUE. 



This application internally calls the otherapp which actually internally takes care of the DB access and stuff. 
which is https://github.com/mrinal10/covid-data-internal
