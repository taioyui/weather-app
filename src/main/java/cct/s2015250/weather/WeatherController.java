package cct.s2015250.weather;

import cct.s2015250.weather.payload.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WeatherController {

    @Autowired
    ForecastGateway forecastGateway;

       @RequestMapping("/weather")
    public WeatherData requestForecast() throws IOException {
        return forecastGateway.requestForecast();
    }
}