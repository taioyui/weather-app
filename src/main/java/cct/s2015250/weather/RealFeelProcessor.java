package cct.s2015250.weather;


import cct.s2015250.weather.payload.WeatherData;
import cct.s2015250.weather.payload.forecast.Time;
import org.springframework.stereotype.Component;

@Component
public class RealFeelProcessor {


    public WeatherData calculateRealFeel(WeatherData weatherData) {
        weatherData.getForecast().getTabular().getTime().get(0).setRealFeel(
                calculateRealFeel(weatherData.getForecast().getTabular().getTime().get(0)));
        return weatherData;
    }

    String calculateRealFeel(Time time) {
        Double windKmHr = Double.valueOf(time.getWindSpeed().getMps()) * 3.6;
        Double temperature = Double.valueOf(time.getTemperature().getValue());
        double realFeel = 13.12 + 0.6215 * temperature -
                11.37 * Math.pow(windKmHr, 0.16) + 0.3965 * temperature * Math.pow(windKmHr, 0.16);
        return String.format("%.1f", realFeel);
    }
}
