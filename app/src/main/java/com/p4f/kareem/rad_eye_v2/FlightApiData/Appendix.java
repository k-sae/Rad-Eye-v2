
package com.p4f.kareem.rad_eye_v2.FlightApiData;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Appendix {

    @SerializedName("airlines")
    @Expose
    private List<Airline_> airlines = null;
    @SerializedName("airports")
    @Expose
    private List<Airport_> airports = null;
    @SerializedName("equipments")
    @Expose
    private List<Equipment> equipments = null;

    public List<Airline_> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline_> airlines) {
        this.airlines = airlines;
    }

    public List<Airport_> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport_> airports) {
        this.airports = airports;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }

}
