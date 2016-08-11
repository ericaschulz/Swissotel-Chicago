package com.ericaschulz.swissotelchicago;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ericaschulz on 8/11/16.
 */
public class SwissotelChicago {
    private Details details;
    private String type;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public SwissotelChicago() {
    }

    /**
     *
     * @param details
     * @param type
     */
    public SwissotelChicago(Details details, String type) {
        this.details = details;
        this.type = type;
    }

    /**
     *
     * @return
     *     The details
     */
    public Details getDetails() {
        return details;
    }

    /**
     *
     * @param details
     *     The details
     */
    public void setDetails(Details details) {
        this.details = details;
    }

    /**
     *
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SwissotelChicago{" +
                "details=" + details +
                ", type='" + type + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}
