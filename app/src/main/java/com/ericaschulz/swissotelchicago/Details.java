package com.ericaschulz.swissotelchicago;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ericaschulz on 8/11/16.
 */
public class Details {
    private CarouselLinks carouselLinks;
    private MenuLinks menuLinks;
    private String propertyEmail;
    private String propertyMapLink;
    private String propertyName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Details() {
    }

    /**
     *
     * @param propertyName
     * @param propertyEmail
     * @param carouselLinks
     * @param propertyMapLink
     * @param menuLinks
     */
    public Details(CarouselLinks carouselLinks, MenuLinks menuLinks, String propertyEmail, String propertyMapLink, String propertyName) {
        this.carouselLinks = carouselLinks;
        this.menuLinks = menuLinks;
        this.propertyEmail = propertyEmail;
        this.propertyMapLink = propertyMapLink;
        this.propertyName = propertyName;
    }

    /**
     *
     * @return
     *     The carouselLinks
     */
    public CarouselLinks getCarouselLinks() {
        return carouselLinks;
    }

    /**
     *
     * @param carouselLinks
     *     The carouselLinks
     */
    public void setCarouselLinks(CarouselLinks carouselLinks) {
        this.carouselLinks = carouselLinks;
    }

    /**
     *
     * @return
     *     The menuLinks
     */
    public MenuLinks getMenuLinks() {
        return menuLinks;
    }

    /**
     *
     * @param menuLinks
     *     The menuLinks
     */
    public void setMenuLinks(MenuLinks menuLinks) {
        this.menuLinks = menuLinks;
    }

    /**
     *
     * @return
     *     The propertyEmail
     */
    public String getPropertyEmail() {
        return propertyEmail;
    }

    /**
     *
     * @param propertyEmail
     *     The propertyEmail
     */
    public void setPropertyEmail(String propertyEmail) {
        this.propertyEmail = propertyEmail;
    }

    /**
     *
     * @return
     *     The propertyMapLink
     */
    public String getPropertyMapLink() {
        return propertyMapLink;
    }

    /**
     *
     * @param propertyMapLink
     *     The propertyMapLink
     */
    public void setPropertyMapLink(String propertyMapLink) {
        this.propertyMapLink = propertyMapLink;
    }

    /**
     *
     * @return
     *     The propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     *
     * @param propertyName
     *     The propertyName
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Override
    public String toString() {
        return "Details{" +
                "carouselLinks=" + carouselLinks +
                ", menuLinks=" + menuLinks +
                ", propertyEmail='" + propertyEmail + '\'' +
                ", propertyMapLink='" + propertyMapLink + '\'' +
                ", propertyName='" + propertyName + '\'' +
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
