package cct.s2015250.weather.payload.forecast;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "tabular")
public class WindSpeed {
    @JacksonXmlProperty(isAttribute = true)
    String mps;
    @JacksonXmlProperty(isAttribute = true)
    String name;



    public String getMps() {
        return mps;
    }

    public void setMps(String mps) {
        this.mps = mps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
