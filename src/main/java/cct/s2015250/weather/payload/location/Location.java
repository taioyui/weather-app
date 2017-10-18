package cct.s2015250.weather.payload.location;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "location")
public class Location {

    @JacksonXmlProperty(localName = "name")
    private String name;
    @JacksonXmlProperty(localName = "type")
    private String type;
    @JacksonXmlProperty(localName = "country")
    private String country;
    @JacksonXmlProperty(localName = "timezone")
    private Timezone timezone;
    @JacksonXmlProperty(localName = "location")
    private Coordinates coordinates;

    public Location() {
    }

    public Location(String name, String type, String country, Timezone timezone, Coordinates coordinates) {
        this.name = name;
        this.type = type;
        this.country = country;
        this.timezone = timezone;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Timezone getTimezone() {
        return timezone;
    }

    public void setTimezone(Timezone timezone) {
        this.timezone = timezone;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}