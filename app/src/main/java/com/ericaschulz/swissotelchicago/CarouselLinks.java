package com.ericaschulz.swissotelchicago;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ericaschulz on 8/11/16.
 */
public class CarouselLinks {
    private String localGuide;
    private String photosVideos;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public CarouselLinks() {
    }

    /**
     *
     * @param localGuide
     * @param photosVideos
     */
    public CarouselLinks(String localGuide, String photosVideos) {
        this.localGuide = localGuide;
        this.photosVideos = photosVideos;
    }

    /**
     *
     * @return
     *     The localGuide
     */
    public String getLocalGuide() {
        return localGuide;
    }

    /**
     *
     * @param localGuide
     *     The local_guide
     */
    public void setLocalGuide(String localGuide) {
        this.localGuide = localGuide;
    }

    /**
     *
     * @return
     *     The photosVideos
     */
    public String getPhotosVideos() {
        return photosVideos;
    }

    /**
     *
     * @param photosVideos
     *     The photos_videos
     */
    public void setPhotosVideos(String photosVideos) {
        this.photosVideos = photosVideos;
    }

    @Override
    public String toString() {
        return "CarouselLinks{" +
                "localGuide='" + localGuide + '\'' +
                ", photosVideos='" + photosVideos + '\'' +
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


