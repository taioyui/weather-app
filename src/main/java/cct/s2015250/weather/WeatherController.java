package cct.s2015250.weather;

import cct.s2015250.weather.payload.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@RequestMapping("/weather")
@RestController
public class WeatherController {

    @Autowired
    ForecastGateway forecastGateway;

    @Autowired
    RealFeelProcessor realFeelProcessor;

    @Autowired
    CustomFieldsProcessor customFieldsProcessor;

    @RequestMapping("/5days")
    public WeatherData requestForecast5days() throws IOException {
        WeatherData  weatherData = forecastGateway.requestForecast5days();
        return customFieldsProcessor.calculateCustomFields(realFeelProcessor.calculateRealFeel(weatherData));
    }


    @RequestMapping("/hourly")
    public WeatherData requestForecastHourly() throws IOException {
        WeatherData weatherData = forecastGateway.requestForecastHourly();
        return realFeelProcessor.calculateRealFeel(weatherData);
    }
}