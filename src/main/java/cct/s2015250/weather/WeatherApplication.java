package cct.s2015250.weather;

import cct.s2015250.weather.payload.WeatherData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherApplication {

    private static final Logger log = LoggerFactory.getLogger(WeatherApplication.class);

    public static void main(String args[]) {
        SpringApplication.run(WeatherApplication.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Autowired
    ForecastGateway forecastGateway;

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            WeatherData weatherData = forecastGateway.requestForecast();
            log.info(weatherData.toString());
        };
    }
}