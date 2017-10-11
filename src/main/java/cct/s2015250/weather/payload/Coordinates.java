package cct.s2015250.weather.payload;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "location")
public class Coordinates {
    @JacksonXmlProperty(isAttribute = true)
    String altitude;
    @JacksonXmlProperty(isAttribute = true)
    String latitude;
    @JacksonXmlProperty(isAttribute = true)
    String longitude;
    @JacksonXmlProperty(isAttribute = true)
    String geobase;
    @JacksonXmlProperty(isAttribute = true)
    long geobaseid;
}
