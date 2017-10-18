package cct.s2015250.weather.payload;

import cct.s2015250.weather.payload.credits.Credit;
import cct.s2015250.weather.payload.forecast.Forecast;
import cct.s2015250.weather.payload.location.Location;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "weatherdata")
public class WeatherData {
    @JacksonXmlProperty(localName = "location")
    private Location location;
    @JacksonXmlProperty(localName = "credit")
    private Credit credit;
    @JacksonXmlProperty(localName = "meta")
    private Meta meta;
    @JacksonXmlProperty(localName = "sun")
    private Sun sun;
    @JacksonXmlProperty(localName = "forecast")
    private Forecast forecast;

    public Sun getSun() {
        return sun;
    }

    public void setSun(Sun sun) {
        this.sun = sun;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
