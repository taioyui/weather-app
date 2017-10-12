package cct.s2015250.weather.payload;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "timezone")
public class Timezone {
    @JacksonXmlProperty
    private String id;
    @JacksonXmlProperty(localName = "utcoffsetMinutes")
    private int utcOffsetMin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUtcOffsetMin() {
        return utcOffsetMin;
    }

    public void setUtcOffsetMin(int utcOffsetMin) {
        this.utcOffsetMin = utcOffsetMin;
    }
}
