package cct.s2015250.weather;

import cct.s2015250.weather.payload.WeatherData;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class ForecastGateway {

    String url = "http://www.yr.no/place/Ireland/Leinster/Dublin/forecast.xml";

    @Autowired
    RestTemplate restTemplate;

    public WeatherData requestForecast() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String xmlPayload = restTemplate.getForObject(url, String.class);
        WeatherData weatherData = xmlMapper.readValue(xmlPayload, WeatherData.class);
        return weatherData;
    }
}
