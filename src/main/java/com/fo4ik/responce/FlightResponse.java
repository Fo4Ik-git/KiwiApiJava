package com.fo4ik.responce;

public class FlightResponse {
    private String search_id;
    private String currency;
    private double fx_rate;
    private FlightData[] data;
    private int _results;

    public String getSearch_id() {
        return search_id;
    }

    public void setSearch_id(String search_id) {
        this.search_id = search_id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getFx_rate() {
        return fx_rate;
    }

    public void setFx_rate(double fx_rate) {
        this.fx_rate = fx_rate;
    }

    public FlightData[] getData() {
        return data;
    }

    public void setData(FlightData[] data) {
        this.data = data;
    }

    public int get_results() {
        return _results;
    }

    public void set_results(int _results) {
        this._results = _results;
    }
}
