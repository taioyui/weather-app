package cct.s2015250.weather.payload.forecast;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "tabular")
public class WindDirection {
    @JacksonXmlProperty(isAttribute = true)
    String deg;
    @JacksonXmlProperty(isAttribute = true)
    String code;
    @JacksonXmlProperty(isAttribute = true)
    String name;



    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
