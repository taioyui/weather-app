package cct.s2015250.weather.payload.forecast;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "forecast")
public class Forecast {
    @JacksonXmlProperty(localName = "tabular")
    private List<Object> tabular;

    public Forecast() {
    }

    public Forecast(List<Object> tabular) {
        this.tabular = tabular;
    }

    public List<Object> getTabular() {
        return tabular;
    }

    public void setTabular(List<Object> tabular) {
        this.tabular = tabular;
    }
}
