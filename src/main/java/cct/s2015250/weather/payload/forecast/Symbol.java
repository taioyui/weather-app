package cct.s2015250.weather.payload.forecast;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "tabular")
public class Symbol {
    @JacksonXmlProperty(isAttribute = true)
    String number;
    @JacksonXmlProperty(isAttribute = true)
    String numberEx;
    @JacksonXmlProperty(isAttribute = true)
    String name;
    @JacksonXmlProperty(isAttribute = true)
    String var;



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumberEx() {
        return numberEx;
    }

    public void setNumberEx(String numberEx) {
        this.numberEx = numberEx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }
}

