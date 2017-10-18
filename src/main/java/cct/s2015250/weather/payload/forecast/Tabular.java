package cct.s2015250.weather.payload.forecast;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "forecast")
public class Tabular {
    @JacksonXmlProperty(isAttribute = true)
    private String time;
    @JacksonXmlProperty(isAttribute = true)
    private String symbol;
    @JacksonXmlProperty(isAttribute = true)
    private String precipitation;
    @JacksonXmlProperty(isAttribute = true)
    private String windDirection;
    @JacksonXmlProperty(isAttribute = true)
    private String windSpeed;
    @JacksonXmlProperty(isAttribute = true)
    private String temperature;
    @JacksonXmlProperty(isAttribute = true)
    private String pressure;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
}