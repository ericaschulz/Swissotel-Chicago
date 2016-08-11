package com.ericaschulz.swissotelchicago;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ericaschulz on 8/11/16.
 */

//@Generated("org.jsonschema2pojo")

public class Accommodation {

    private String link;
    private String title;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Accommodation() {
    }

    /**
     *
     * @param title
     * @param link
     */
    public Accommodation(String link, String title) {
        this.link = link;
        this.title = title;
    }

    /**
     *
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     *
     * @param link
     *     The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     *
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Accommodation{" +
                "link='" + link + '\'' +
                ", title='" + title + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}