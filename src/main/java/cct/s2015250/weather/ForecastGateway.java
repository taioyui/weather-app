package cct.s2015250.weather;

import cct.s2015250.weather.payload.WeatherData;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class ForecastGateway {

    String url = "http://www.yr.no/place/Ireland/Leinster/Dublin/forecast.xml";

    RestTemplate restTemplate;
    XmlMapper xmlMapper;

    public ForecastGateway() {
        xmlMapper = new XmlMapper();
        restTemplate = new RestTemplateBuilder().build();
    }

    public WeatherData requestForecast() throws IOException {
        String xmlPayload = restTemplate.getForObject(url, String.class);
        WeatherData weatherData = xmlMapper.readValue(xmlPayload, WeatherData.class);
        return weatherData;
    }
}
