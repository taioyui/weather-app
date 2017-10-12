package cct.s2015250.weather.payload;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "location")
public class Coordinates {
    @JacksonXmlProperty(isAttribute = true)
    private String altitude;
    @JacksonXmlProperty(isAttribute = true)
    private String latitude;
    @JacksonXmlProperty(isAttribute = true)
    private String longitude;
    @JacksonXmlProperty(isAttribute = true)
    private String geobase;
    @JacksonXmlProperty(isAttribute = true)
    private long geobaseid;

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getGeobase() {
        return geobase;
    }

    public void setGeobase(String geobase) {
        this.geobase = geobase;
    }

    public long getGeobaseid() {
        return geobaseid;
    }

    public void setGeobaseid(long geobaseid) {
        this.geobaseid = geobaseid;
    }
}
