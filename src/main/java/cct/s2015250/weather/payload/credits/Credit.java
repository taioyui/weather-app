package cct.s2015250.weather.payload.credits;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "credit")
public class Credit {

    @JacksonXmlProperty(localName = "link")
    private Link link;

       public Credit() {
    }

    public Credit(Link link) {
        this.link = link;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

}
