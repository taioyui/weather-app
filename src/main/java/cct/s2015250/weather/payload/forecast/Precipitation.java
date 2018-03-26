package cct.s2015250.weather.payload.forecast;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "precipitation")
public class Precipitation {

    @JacksonXmlProperty(isAttribute = true)
    private String value;



    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
