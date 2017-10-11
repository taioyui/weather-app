package cct.s2015250.weather.payload;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "location")
public class Location {

    @JacksonXmlProperty(localName = "name")
    String name;
    @JacksonXmlProperty(localName = "type")
    String type;
    @JacksonXmlProperty(localName = "country")
    String country;
    @JacksonXmlProperty(localName = "timezone")
    Timezone timezone;
    @JacksonXmlProperty(localName = "location")
    Coordinates coordinates;

    public Location() {
    }

    public Location(String name, String type, String country, Timezone timezone, Coordinates coordinates) {
        this.name = name;
        this.type = type;
        this.country = country;
        this.timezone = timezone;
        this.coordinates = coordinates;
    }
}