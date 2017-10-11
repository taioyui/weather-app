package cct.s2015250.weather.payload;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "timezone")
public class Timezone {
    @JacksonXmlProperty
    String id;
    @JacksonXmlProperty(localName = "utcoffsetMinutes")
    int utcOffsetMin;
}
