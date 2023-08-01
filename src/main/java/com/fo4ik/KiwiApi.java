package com.fo4ik;

import com.fo4ik.responce.FlightResponse;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class KiwiApi<T> {
    /***
     *  URL for kiwi api request <a href="https://tequila.kiwi.com/portal/docs/tequila_api/search_api"...</a
     *
     *
     */

    public final Map<String, T> data = new HashMap<>();


    private static final String API_BASE_URL = "https://api.tequila.kiwi.com/v2/search?";

    public static final String URL_TO_BUY_TICKET = "https://www.kiwi.com/ru/booking?direct=true&locale=en&currency=";


    private String apikey = "apikey"; //Required parameter like header

    private String fly_from = "fly_from"; //Required parameter
    private String fly_to = "fly_to";

    private String date_from = "date_from"; //Required parameter
    private String date_to = "date_to"; //Required parameter
    private String return_from = "return_from";
    private String return_to = "return_to";
    private String nights_in_dst_from = "nights_in_dst_from";
    private String nights_in_dst_to = "nights_in_dst_to";
    private String max_fly_duration = "max_fly_duration";
    private String ret_from_diff_city = "ret_from_diff_city";
    private String ret_to_diff_city = "ret_to_diff_city";
    private String one_for_city = "one_for_city";
    private String one_per_date = "one_per_date";
    private String adults = "adults";
    private String children = "children";
    private String infants = "infants";
    private String selected_cabins = "selected_cabins";
    private String mix_with_cabins = "mix_with_cabins";
    private String adult_hold_bag = "adult_hold_bag";
    private String adult_hand_bag = "adult_hand_bag";
    private String child_hold_bag = "child_hold_bag";
    private String child_hand_bag = "child_hand_bag";
    private String fly_days = "fly_days";
    private String fly_days_type = "fly_days_type";
    private String ret_fly_days = "ret_fly_days";
    private String ret_fly_days_type = "ret_fly_days_type";
    private String only_working_days = "only_working_days";
    private String only_weekends = "only_weekends";
    private String partner_market = "partner_market";
    private String currrency = "curr";
    private String locale = "locale";
    private String price_from = "price_from";
    private String price_to = "price_to";
    private String dtime_from = "dtime_from";
    private String dtime_to = "dtime_to";
    private String atime_from = "atime_from";
    private String atime_to = "atime_to";
    private String ret_dtime_from = "ret_dtime_from";
    private String ret_dtime_to = "ret_dtime_to";
    private String ret_atime_from = "ret_atime_from";
    private String ret_atime_to = "ret_atime_to";
    private String stopover_from = "stopover_from";
    private String stopover_to = "stopover_to";
    private String max_stopovers = "max_stopovers";
    private String max_sector_stopovers = "max_sector_stopovers";
    private String conn_on_diff_airport = "conn_on_diff_airport";
    private String ret_from_diff_airport = "ret_from_diff_airport";
    private String ret_to_diff_airport = "ret_to_diff_airport";
    private String select_airlines = "select_airlines";
    private String select_airlines_exclude = "select_airlines_exclude";
    private String select_stop_airport = "select_stop_airport";
    private String select_stop_airport_exclude = "select_stop_airport_exclude";
    private String vehicle_type = "vehicle_type";
    private String enable_vi = "enable_vi";
    private String sort = "sort";
    private String limit = "limit";


    public KiwiApi(String apikey, String fly_from, String date_from, String date_to) {
        this.apikey = apikey;
        this.fly_from = fly_from;
        this.date_from = date_from;
        this.date_to = date_to;
    }

    public KiwiApi(String fly_from, String date_from, String date_to) {
        this.fly_from = fly_from;
        this.date_from = date_from;
        this.date_to = date_to;
    }

    public KiwiApi() {
    }

    public String getApikey() {
        return data.get(apikey).toString();
    }

    public void setApikey(String apikey) {
        data.put(this.apikey, (T) apikey);
    }

    public String getFly_from() {
        return data.get(fly_from).toString();
    }

    public void setFly_from(String fly_from) {
        data.put(this.fly_from, (T) fly_from);
    }

    public String getFly_to() {
        return data.get(fly_to).toString();
    }

    public void setFly_to(String fly_to) {
        data.put(this.fly_to, (T) fly_to);
    }

    public String getDate_from() {
        return data.get(date_from).toString();
    }

    public void setDate_from(String date_from) {
        data.put(this.date_from, (T) date_from);
    }

    public String getDate_to() {
        return data.get(date_to).toString();
    }

    public void setDate_to(String date_to) {
        data.put(this.date_to, (T) date_to);
    }

    public Integer getNights_in_dst_from() {
        return (Integer) data.get(nights_in_dst_from);
    }

    public void setNights_in_dst_from(Integer nights_in_dst_from) {
        data.put(this.nights_in_dst_from, (T) nights_in_dst_from);
    }

    public Integer getNight_in_dst_to() {
        return (Integer) data.get(nights_in_dst_to);
    }

    public void setNight_in_dst_to(Integer night_in_dst_to) {
        data.put(this.nights_in_dst_to, (T) night_in_dst_to);
    }

    public Integer getMax_fly_duration() {
        return (Integer) data.get(max_fly_duration);
    }

    public void setMax_fly_duration(Integer max_fly_duration) {
        data.put(this.max_fly_duration, (T) max_fly_duration);
    }

    public Boolean getRet_from_diff_city() {
        return (Boolean) data.get(ret_from_diff_city);
    }

    public void setRet_from_diff_city(Boolean ret_from_diff_city) {
        data.put(this.ret_from_diff_city, (T) ret_from_diff_city);
    }

    public Boolean getRet_to_diff_city() {
        return (Boolean) data.get(ret_to_diff_city);
    }

    public void setRet_to_diff_city(Boolean ret_to_diff_city) {
        data.put(this.ret_to_diff_city, (T) ret_to_diff_city);
    }

    public Boolean getOne_for_city() {
        return (Boolean) data.get(one_for_city);
    }

    public void setOne_for_city(Boolean one_for_city) {
        data.put(this.one_for_city, (T) one_for_city);
    }

    public Integer getOne_per_date() {
        return (Integer) data.get(one_per_date);
    }

    public void setOne_per_date(Integer one_per_date) {
        data.put(this.one_per_date, (T) one_per_date);
    }

    public Integer getAdults() {
        return (Integer) data.get(adults);
    }

    public void setAdults(Integer adults) {
        data.put(this.adults, (T) adults);
    }

    public Integer getChildren() {
        return (Integer) data.get(children);
    }

    public void setChildren(Integer children) {
        data.put(this.children, (T) children);
    }

    public Integer getInfants() {
        return (Integer) data.get(infants);
    }

    public void setInfants(Integer infants) {
        data.put(this.infants, (T) infants);
    }

    public String getSelected_cabins() {
        return data.get(selected_cabins).toString();
    }

    public void setSelected_cabins(String selected_cabins) {
        data.put(this.selected_cabins, (T) selected_cabins);
    }

    public String getMix_with_cabins() {
        return data.get(mix_with_cabins).toString();
    }

    public void setMix_with_cabins(String mix_with_cabins) {
        data.put(this.mix_with_cabins, (T) mix_with_cabins);
    }

    public String getAdult_hold_bag() {
        return data.get(adult_hold_bag).toString();
    }

    public void setAdult_hold_bag(String adult_hold_bag) {
        data.put(this.adult_hold_bag, (T) adult_hold_bag);
    }

    public String getAdult_hand_bag() {
        return data.get(adult_hand_bag).toString();
    }

    public void setAdult_hand_bag(String adult_hand_bag) {
        data.put(this.adult_hand_bag, (T) adult_hand_bag);
    }

    public String getChild_hold_bag() {
        return data.get(child_hold_bag).toString();
    }

    public void setChild_hold_bag(String child_hold_bag) {
        data.put(this.child_hold_bag, (T) child_hold_bag);
    }

    public String getChild_hand_bag() {
        return data.get(child_hand_bag).toString();
    }

    public void setChild_hand_bag(String child_hand_bag) {
        data.put(this.child_hand_bag, (T) child_hand_bag);
    }

    public String getFly_days() {
        return data.get(fly_days).toString();
    }

    public void setFly_days(String fly_days) {
        data.put(this.fly_days, (T) fly_days);
    }

    public String getFly_days_type() {
        return data.get(fly_days_type).toString();
    }

    public void setFly_days_type(String fly_days_type) {
        data.put(this.fly_days_type, (T) fly_days_type);
    }

    public String getRet_fly_days() {
        return data.get(ret_fly_days).toString();
    }

    public void setRet_fly_days(String ret_fly_days) {
        data.put(this.ret_fly_days, (T) ret_fly_days);
    }

    public String getRet_fly_days_type() {
        return data.get(ret_fly_days_type).toString();
    }

    public void setRet_fly_days_type(String ret_fly_days_type) {
        data.put(this.ret_fly_days_type, (T) ret_fly_days_type);
    }

    public Boolean getOnly_working_days() {
        return (Boolean) data.get(only_working_days);
    }

    public void setOnly_working_days(Boolean only_working_days) {
        data.put(this.only_working_days, (T) only_working_days);
    }

    public Boolean getOnly_weekends() {
        return (Boolean) data.get(only_weekends);
    }

    public void setOnly_weekends(Boolean only_weekends) {
        data.put(this.only_weekends, (T) only_weekends);
    }

    public String getPartner_market() {
        return data.get(partner_market).toString();
    }

    public void setPartner_market(String partner_market) {
        data.put(this.partner_market, (T) partner_market);
    }

    public String getCurrency() {
        return data.get(currrency).toString();
    }

    public void setCurrency(String currency) {
        data.put(this.currrency, (T) currency);
    }

    public String getLocale() {
        return data.get(locale).toString();
    }

    public void setLocale(String locale) {
        data.put(this.locale, (T) locale);
    }

    public Integer getPrice_from() {
        return (Integer) data.get(price_from);
    }

    public void setPrice_from(Integer price_from) {
        data.put(this.price_from, (T) price_from);
    }

    public Integer getPrice_to() {
        return (Integer) data.get(price_to);
    }

    public void setPrice_to(Integer price_to) {
        data.put(this.price_to, (T) price_to);
    }

    public String getDtime_from() {
        return data.get(dtime_from).toString();
    }

    public void setDtime_from(String dtime_from) {
        data.put(this.dtime_from, (T) dtime_from);
    }

    public String getDtime_to() {
        return data.get(dtime_to).toString();
    }

    public void setDtime_to(String dtime_to) {
        data.put(this.dtime_to, (T) dtime_to);
    }

    public String getAtime_from() {
        return data.get(atime_from).toString();
    }

    public void setAtime_from(String atime_from) {
        data.put(this.atime_from, (T) atime_from);
    }

    public String getAtime_to() {
        return data.get(atime_to).toString();
    }

    public void setAtime_to(String atime_to) {
        data.put(this.atime_to, (T) atime_to);
    }

    public String getRet_dtime_from() {
        return data.get(ret_dtime_from).toString();
    }

    public void setRet_dtime_from(String ret_dtime_from) {
        data.put(this.ret_dtime_from, (T) ret_dtime_from);
    }

    public String getRet_dtime_to() {
        return data.get(ret_dtime_to).toString();
    }

    public void setRet_dtime_to(String ret_dtime_to) {
        data.put(this.ret_dtime_to, (T) ret_dtime_to);
    }

    public String getRet_atime_from() {
        return data.get(ret_atime_from).toString();
    }

    public void setRet_atime_from(String ret_atime_from) {
        data.put(this.ret_atime_from, (T) ret_atime_from);
    }

    public String getRet_atime_to() {
        return data.get(ret_atime_to).toString();
    }

    public void setRet_atime_to(String ret_atime_to) {
        data.put(this.ret_atime_to, (T) ret_atime_to);
    }

    public String getStopover_from() {
        return data.get(stopover_from).toString();
    }

    public void setStopover_from(String stopover_from) {
        data.put(this.stopover_from, (T) stopover_from);
    }

    public String getStopover_to() {
        return data.get(stopover_to).toString();
    }

    public void setStopover_to(String stopover_to) {
        data.put(this.stopover_to, (T) stopover_to);
    }

    public Integer getMax_stopovers() {
        return (Integer) data.get(max_stopovers);
    }

    public void setMax_stopovers(Integer max_stopovers) {
        data.put(this.max_stopovers, (T) max_stopovers);
    }

    public Integer getMax_sector_stopovers() {
        return (Integer) data.get(max_sector_stopovers);
    }

    public void setMax_sector_stopovers(Integer max_sector_stopovers) {
        data.put(this.max_sector_stopovers, (T) max_sector_stopovers);
    }

    public Integer getConn_on_diff_airport() {
        return (Integer) data.get(conn_on_diff_airport);
    }

    public void setConn_on_diff_airport(Integer conn_on_diff_airport) {
        data.put(this.conn_on_diff_airport, (T) conn_on_diff_airport);
    }

    public Integer getRet_from_diff_airport() {
        return (Integer) data.get(ret_from_diff_airport);
    }

    public void setRet_from_diff_airport(Integer ret_from_diff_airport) {
        data.put(this.ret_from_diff_airport, (T) ret_from_diff_airport);
    }

    public Integer getRet_to_diff_airport() {
        return (Integer) data.get(ret_to_diff_airport);
    }

    public void setRet_to_diff_airport(Integer ret_to_diff_airport) {
        data.put(this.ret_to_diff_airport, (T) ret_to_diff_airport);
    }

    public String getSelect_airlines() {
        return data.get(select_airlines).toString();
    }

    public void setSelect_airlines(String select_airlines) {
        data.put(this.select_airlines, (T) select_airlines);
    }

    public String getSelect_airlines_exclude() {
        return data.get(select_airlines_exclude).toString();
    }

    public void setSelect_airlines_exclude(String select_airlines_exclude) {
        data.put(this.select_airlines_exclude, (T) select_airlines_exclude);
    }

    public String getSelect_stop_airport() {
        return data.get(select_stop_airport).toString();
    }

    public void setSelect_stop_airport(String select_stop_airport) {
        data.put(this.select_stop_airport, (T) select_stop_airport);
    }

    public String getSelect_stop_airport_exclude() {
        return data.get(select_stop_airport_exclude).toString();
    }

    public void setSelect_stop_airport_exclude(String select_stop_airport_exclude) {
        data.put(this.select_stop_airport_exclude, (T) select_stop_airport_exclude);
    }

    public String getVehicle_type() {
        return data.get(vehicle_type).toString();
    }

    public void setVehicle_type(String vehicle_type) {
        data.put(this.vehicle_type, (T) vehicle_type);
    }

    public Boolean getEnable_vi() {
        return (Boolean) data.get(enable_vi);
    }

    public void setEnable_vi(Boolean enable_vi) {
        data.put(this.enable_vi, (T) enable_vi);
    }

    public String getSort() {
        return data.get(sort).toString();
    }

    public void setSort(String sort) {
        data.put(this.sort, (T) sort);
    }

    public Integer getLimit() {
        return (Integer) data.get(limit);
    }

    public void setLimit(Integer limit) {
        data.put(this.limit, (T) limit);
    }

    public FlightResponse sendRequest() {
        try {
            // Create a URL object
            URL url = new URL(createUrl());

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            connection.setRequestMethod("GET");

            //Add request headers
            connection.setRequestProperty("apikey", getApikey());

            // Set any request headers if necessary (e.g., Authorization header)
            // connection.setRequestProperty("Authorization", "Bearer YOUR_ACCESS_TOKEN");

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            FlightResponse flightResponse = new FlightResponse();

            // Read the response content
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                String responseData = response.toString();
                Gson gson = new Gson();
                flightResponse = gson.fromJson(responseData, FlightResponse.class);
            }
            // Close the connection
            connection.disconnect();
            return flightResponse;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String createUrl() {
        StringBuilder url = new StringBuilder(API_BASE_URL);
        for (Map.Entry<String, T> entry : data.entrySet()) {
            if (entry.getValue() != null && !entry.getKey().equals(apikey)) {
                url.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
            }
        }
        System.out.println(url.toString());
        return url.toString();
    }

    public Map<String, T> getData() {
        return data;
    }
}
