package cct.s2015250.weather.payload.forecast;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JacksonXmlRootElement(localName = "time")
public class Time {
    @JacksonXmlProperty(isAttribute = true)
    private String from;
    @JacksonXmlProperty(isAttribute = true)
    private String to;
    @JacksonXmlProperty(isAttribute = true)
    private String period;

    @JacksonXmlElementWrapper(localName = "symbol")
    private Symbol symbol;
    @JacksonXmlProperty
    private Precipitation precipitation;
    @JacksonXmlProperty
    private WindDirection windDirection;
    @JacksonXmlProperty
    private WindSpeed windSpeed;
    @JacksonXmlProperty
    private Temperature temperature;
    @JacksonXmlProperty
    private String realFeel;
    @JacksonXmlProperty
    private Pressure pressure;

    @JacksonXmlProperty
    private Temperature minTemperature;

    @JacksonXmlProperty
    private Temperature maxTemperature;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Precipitation getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Precipitation precipitation) {
        this.precipitation = precipitation;
    }

    public WindDirection getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(WindDirection windDirection) {
        this.windDirection = windDirection;
    }

    public WindSpeed getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(WindSpeed windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Pressure getPressure() {
        return pressure;
    }

    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    public String getRealFeel() {
        return realFeel;
    }

    public void setRealFeel(String realFeel) {
        this.realFeel = realFeel;
    }

    public Temperature getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(Temperature minTemperature) {
        this.minTemperature = minTemperature;
    }

    public Temperature getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(Temperature maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
}
