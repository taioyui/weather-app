package cct.s2015250.weather.payload;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "meta")
public class Meta {

    @JacksonXmlProperty(localName = "lastupdate")
    private String lastupdate;
    @JacksonXmlProperty(localName = "nextupdate")
    private String nextupdate;

    public Meta() {
    }


    public Meta(String lastupdate, String nextupdate) {
        this.lastupdate = lastupdate;
        this.nextupdate = nextupdate;
    }


    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getNextupdate() {
        return nextupdate;
    }

    public void setNextupdate(String nextupdate) {
        this.nextupdate = nextupdate;
    }
}