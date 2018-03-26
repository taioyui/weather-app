package cct.s2015250.weather.payload.forecast;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "forecast")
public class Forecast {
    @JacksonXmlProperty(localName = "tabular")
    private Tabular tabular;

    public Forecast() {
    }

    public Forecast(Tabular tabular) {
        this.tabular = tabular;
    }

    public Tabular getTabular() {
        return tabular;
    }

    public void setTabular(Tabular tabular) {
        this.tabular = tabular;
    }
}
