package com.ericaschulz.swissotelchicago;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ericaschulz on 8/11/16.
 */
public class MenuLinks {private Accommodation accommodation;
    private Dining dining;
    private ExploreHotel exploreHotel;
    private MeetingsEvents meetingsEvents;
    private Overview overview;
    private Promotions promotions;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public MenuLinks() {
    }

    //    /**
//     *
//     * @param exploreHotel
//     * @param overview
//     * @param accommodation
//     * @param meetingsEvents
//     * @param promotions
//     * @param dining
//     */
    public MenuLinks(Accommodation accommodation, Dining dining, ExploreHotel exploreHotel, MeetingsEvents meetingsEvents, Overview overview, Promotions promotions) {
        this.accommodation = accommodation;
        this.dining = dining;
        this.exploreHotel = exploreHotel;
        this.meetingsEvents = meetingsEvents;
        this.overview = overview;
        this.promotions = promotions;
    }

    /**
     *
     * @return
     *     The accommodation
     */
    public Accommodation getAccommodation() {
        return accommodation;
    }

    /**
     *
     * @param accommodation
     *     The accommodation
     */
    public void setAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    /**
     *
     * @return
     *     The dining
     */
    public Dining getDining() {
        return dining;
    }

    /**
     *
     * @param dining
     *     The dining
     */
    public void setDining(Dining dining) {
        this.dining = dining;
    }

    /**
     *
     * @return
     *     The exploreHotel
     */
    public ExploreHotel getExploreHotel() {
        return exploreHotel;
    }

    /**
     *
     * @param exploreHotel
     *     The explore_hotel
     */
    public void setExploreHotel(ExploreHotel exploreHotel) {
        this.exploreHotel = exploreHotel;
    }

    /**
     *
     * @return
     *     The meetingsEvents
     */
    public MeetingsEvents getMeetingsEvents() {
        return meetingsEvents;
    }

    /**
     *
     * @param meetingsEvents
     *     The meetings_events
     */
    public void setMeetingsEvents(MeetingsEvents meetingsEvents) {
        this.meetingsEvents = meetingsEvents;
    }

    /**
     *
     * @return
     *     The overview
     */
    public Overview getOverview() {
        return overview;
    }

    /**
     *
     * @param overview
     *     The overview
     */
    public void setOverview(Overview overview) {
        this.overview = overview;
    }

    /**
     *
     * @return
     *     The promotions
     */
    public Promotions getPromotions() {
        return promotions;
    }

    /**
     *
     * @param promotions
     *     The promotions
     */
    public void setPromotions(Promotions promotions) {
        this.promotions = promotions;
    }

    @Override
    public String toString() {
        return "MenuLinks{" +
                "accommodation=" + accommodation +
                ", dining=" + dining +
                ", exploreHotel=" + exploreHotel +
                ", meetingsEvents=" + meetingsEvents +
                ", overview=" + overview +
                ", promotions=" + promotions +
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
