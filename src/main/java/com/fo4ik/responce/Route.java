package com.fo4ik.responce;

public class Route {
    private String id;
    private String combination_id;
    private String flyFrom;
    private String flyTo;
    private String cityFrom;
    private String cityCodeFrom;
    private String cityTo;
    private String cityCodeTo;
    private String airline;
    private int flight_no;
    private String operating_carrier;
    private String operating_flight_no;
    private String fare_basis;
    private String fare_category;
    private String fare_classes;
    private String fare_family;
    private int route_return;
    private boolean bags_recheck_required;
    private boolean vi_connection;
    private boolean guarantee;
    private String equipment;
    private String vehicle_type;
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

    public String getCombination_id() {
        return combination_id;
    }

    public void setCombination_id(String combination_id) {
        this.combination_id = combination_id;
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

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getFlight_no() {
        return flight_no;
    }

    public void setFlight_no(int flight_no) {
        this.flight_no = flight_no;
    }

    public String getOperating_carrier() {
        return operating_carrier;
    }

    public void setOperating_carrier(String operating_carrier) {
        this.operating_carrier = operating_carrier;
    }

    public String getOperating_flight_no() {
        return operating_flight_no;
    }

    public void setOperating_flight_no(String operating_flight_no) {
        this.operating_flight_no = operating_flight_no;
    }

    public String getFare_basis() {
        return fare_basis;
    }

    public void setFare_basis(String fare_basis) {
        this.fare_basis = fare_basis;
    }

    public String getFare_category() {
        return fare_category;
    }

    public void setFare_category(String fare_category) {
        this.fare_category = fare_category;
    }

    public String getFare_classes() {
        return fare_classes;
    }

    public void setFare_classes(String fare_classes) {
        this.fare_classes = fare_classes;
    }

    public String getFare_family() {
        return fare_family;
    }

    public void setFare_family(String fare_family) {
        this.fare_family = fare_family;
    }

    public boolean isBags_recheck_required() {
        return bags_recheck_required;
    }

    public void setBags_recheck_required(boolean bags_recheck_required) {
        this.bags_recheck_required = bags_recheck_required;
    }

    public boolean isVi_connection() {
        return vi_connection;
    }

    public void setVi_connection(boolean vi_connection) {
        this.vi_connection = vi_connection;
    }

    public boolean isGuarantee() {
        return guarantee;
    }

    public void setGuarantee(boolean guarantee) {
        this.guarantee = guarantee;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
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

    public int getRoute_return() {
        return route_return;
    }

    public void setRoute_return(int route_return) {
        this.route_return = route_return;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id='" + id + '\'' +
                ", combination_id='" + combination_id + '\'' +
                ", flyFrom='" + flyFrom + '\'' +
                ", flyTo='" + flyTo + '\'' +
                ", cityFrom='" + cityFrom + '\'' +
                ", cityCodeFrom='" + cityCodeFrom + '\'' +
                ", cityTo='" + cityTo + '\'' +
                ", cityCodeTo='" + cityCodeTo + '\'' +
                ", airline='" + airline + '\'' +
                ", flight_no=" + flight_no +
                ", operating_carrier='" + operating_carrier + '\'' +
                ", operating_flight_no='" + operating_flight_no + '\'' +
                ", fare_basis='" + fare_basis + '\'' +
                ", fare_category='" + fare_category + '\'' +
                ", fare_classes='" + fare_classes + '\'' +
                ", fare_family='" + fare_family + '\'' +
                ", route_return=" + route_return +
                ", bags_recheck_required=" + bags_recheck_required +
                ", vi_connection=" + vi_connection +
                ", guarantee=" + guarantee +
                ", equipment='" + equipment + '\'' +
                ", vehicle_type='" + vehicle_type + '\'' +
                ", local_arrival='" + local_arrival + '\'' +
                ", utc_arrival='" + utc_arrival + '\'' +
                ", local_departure='" + local_departure + '\'' +
                ", utc_departure='" + utc_departure + '\'' +
                '}';
    }
}
