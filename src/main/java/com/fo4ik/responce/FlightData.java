package com.fo4ik.responce;

import java.util.Arrays;
import java.util.Map;

public class FlightData {
    private String id;
    private String flyFrom;
    private String flyTo;
    private String cityFrom;
    private String cityCodeFrom;
    private String cityTo;
    private String cityCodeTo;
    private Country countryFrom;
    private Country countryTo;
    private Double quality;
    private Double distance;
    private Duration duration;
    private Double price;
    private Map<String, Double> conversion;
    private Fare fare;
    private Map<String, Double> price_dropdown;
    private Map<String, Double> bags_price;
    private BagLimit baglimit;
    private Availability availability;
    private String[] airlines;
    private Route[] route;
    private String booking_token;
    private boolean facilitated_booking_available;
    private int pnr_count;
    private boolean has_airport_change;
    private int technical_stops;
    private boolean throw_away_ticketing;
    private boolean hidden_city_ticketing;
    private boolean virtual_interlining;
    private String local_arrival;
    private String utc_arrival;
    private String local_departure;
    private String utc_departure;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlyFrom() {
        return flyFrom;
    }

    public void setFlyFrom(String flyFrom) {
        this.flyFrom = flyFrom;
    }

    public String getFlyTo() {
        return flyTo;
    }

    public void setFlyTo(String flyTo) {
        this.flyTo = flyTo;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getCityCodeFrom() {
        return cityCodeFrom;
    }

    public void setCityCodeFrom(String cityCodeFrom) {
        this.cityCodeFrom = cityCodeFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public String getCityCodeTo() {
        return cityCodeTo;
    }

    public void setCityCodeTo(String cityCodeTo) {
        this.cityCodeTo = cityCodeTo;
    }

    public Country getCountryFrom() {
        return countryFrom;
    }

    public void setCountryFrom(Country countryFrom) {
        this.countryFrom = countryFrom;
    }

    public Country getCountryTo() {
        return countryTo;
    }

    public void setCountryTo(Country countryTo) {
        this.countryTo = countryTo;
    }

    public Double getQuality() {
        return quality;
    }

    public void setQuality(Double quality) {
        this.quality = quality;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Map<String, Double> getConversion() {
        return conversion;
    }

    public void setConversion(Map<String, Double> conversion) {
        this.conversion = conversion;
    }

    public Fare getFare() {
        return fare;
    }

    public void setFare(Fare fare) {
        this.fare = fare;
    }

    public Map<String, Double> getPrice_dropdown() {
        return price_dropdown;
    }

    public void setPrice_dropdown(Map<String, Double> price_dropdown) {
        this.price_dropdown = price_dropdown;
    }

    public Map<String, Double> getBags_price() {
        return bags_price;
    }

    public void setBags_price(Map<String, Double> bags_price) {
        this.bags_price = bags_price;
    }

    public BagLimit getBaglimit() {
        return baglimit;
    }

    public void setBaglimit(BagLimit baglimit) {
        this.baglimit = baglimit;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public String[] getAirlines() {
        return airlines;
    }

    public void setAirlines(String[] airlines) {
        this.airlines = airlines;
    }

    public Route[] getRoute() {
        return route;
    }

    public void setRoute(Route[] route) {
        this.route = route;
    }

    public String getBooking_token() {
        return booking_token;
    }

    public void setBooking_token(String booking_token) {
        this.booking_token = booking_token;
    }

    public boolean isFacilitated_booking_available() {
        return facilitated_booking_available;
    }

    public void setFacilitated_booking_available(boolean facilitated_booking_available) {
        this.facilitated_booking_available = facilitated_booking_available;
    }

    public int getPnr_count() {
        return pnr_count;
    }

    public void setPnr_count(int pnr_count) {
        this.pnr_count = pnr_count;
    }

    public boolean isHas_airport_change() {
        return has_airport_change;
    }

    public void setHas_airport_change(boolean has_airport_change) {
        this.has_airport_change = has_airport_change;
    }

    public int getTechnical_stops() {
        return technical_stops;
    }

    public void setTechnical_stops(int technical_stops) {
        this.technical_stops = technical_stops;
    }

    public boolean isThrow_away_ticketing() {
        return throw_away_ticketing;
    }

    public void setThrow_away_ticketing(boolean throw_away_ticketing) {
        this.throw_away_ticketing = throw_away_ticketing;
    }

    public boolean isHidden_city_ticketing() {
        return hidden_city_ticketing;
    }

    public void setHidden_city_ticketing(boolean hidden_city_ticketing) {
        this.hidden_city_ticketing = hidden_city_ticketing;
    }

    public boolean isVirtual_interlining() {
        return virtual_interlining;
    }

    public void setVirtual_interlining(boolean virtual_interlining) {
        this.virtual_interlining = virtual_interlining;
    }

    public String getLocal_arrival() {
        return local_arrival;
    }

    public void setLocal_arrival(String local_arrival) {
        this.local_arrival = local_arrival;
    }

    public String getUtc_arrival() {
        return utc_arrival;
    }

    public void setUtc_arrival(String utc_arrival) {
        this.utc_arrival = utc_arrival;
    }

    public String getLocal_departure() {
        return local_departure;
    }

    public void setLocal_departure(String local_departure) {
        this.local_departure = local_departure;
    }

    public String getUtc_departure() {
        return utc_departure;
    }

    public void setUtc_departure(String utc_departure) {
        this.utc_departure = utc_departure;
    }

    @Override
    public String toString() {
        return "FlightData{" +
                "id='" + id + '\'' +
                ", flyFrom='" + flyFrom + '\'' +
                ", flyTo='" + flyTo + '\'' +
                ", cityFrom='" + cityFrom + '\'' +
                ", cityCodeFrom='" + cityCodeFrom + '\'' +
                ", cityTo='" + cityTo + '\'' +
                ", cityCodeTo='" + cityCodeTo + '\'' +
                ", countryFrom=" + countryFrom +
                ", countryTo=" + countryTo +
                ", quality=" + quality +
                ", distance=" + distance +
                ", duration=" + duration +
                ", price=" + price +
                ", conversion=" + conversion +
                ", fare=" + fare +
                ", price_dropdown=" + price_dropdown +
                ", bags_price=" + bags_price +
                ", baglimit=" + baglimit +
                ", availability=" + availability +
                ", airlines=" + Arrays.toString(airlines) +
                ", route=" + Arrays.toString(route) +
                ", booking_token='" + booking_token + '\'' +
                ", facilitated_booking_available=" + facilitated_booking_available +
                ", pnr_count=" + pnr_count +
                ", has_airport_change=" + has_airport_change +
                ", technical_stops=" + technical_stops +
                ", throw_away_ticketing=" + throw_away_ticketing +
                ", hidden_city_ticketing=" + hidden_city_ticketing +
                ", virtual_interlining=" + virtual_interlining +
                ", local_arrival='" + local_arrival + '\'' +
                ", utc_arrival='" + utc_arrival + '\'' +
                ", local_departure='" + local_departure + '\'' +
                ", utc_departure='" + utc_departure + '\'' +
                '}';
    }
}
