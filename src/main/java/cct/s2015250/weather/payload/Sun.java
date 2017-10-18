package cct.s2015250.weather.payload;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "sun")
public class Sun {

    @JacksonXmlProperty(localName = "rise")
    private String rise;
    @JacksonXmlProperty(localName = "set")
    private String set;

    public Sun() {
    }

    public Sun(String rise, String set) {
        this.rise = rise;
        this.set = set;
    }

    public String getRise() {
        return rise;
    }

    public void setRise(String rise) {
        this.rise = rise;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }
}
