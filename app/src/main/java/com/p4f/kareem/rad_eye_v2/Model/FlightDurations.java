
package com.p4f.kareem.rad_eye_v2.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightDurations {

    @SerializedName("scheduledBlockMinutes")
    @Expose
    private Integer scheduledBlockMinutes;
    @SerializedName("scheduledAirMinutes")
    @Expose
    private Integer scheduledAirMinutes;
    @SerializedName("scheduledTaxiOutMinutes")
    @Expose
    private Integer scheduledTaxiOutMinutes;
    @SerializedName("taxiOutMinutes")
    @Expose
    private Integer taxiOutMinutes;
    @SerializedName("scheduledTaxiInMinutes")
    @Expose
    private Integer scheduledTaxiInMinutes;

    public Integer getScheduledBlockMinutes() {
        return scheduledBlockMinutes;
    }

    public void setScheduledBlockMinutes(Integer scheduledBlockMinutes) {
        this.scheduledBlockMinutes = scheduledBlockMinutes;
    }

    public Integer getScheduledAirMinutes() {
        return scheduledAirMinutes;
    }

    public void setScheduledAirMinutes(Integer scheduledAirMinutes) {
        this.scheduledAirMinutes = scheduledAirMinutes;
    }

    public Integer getScheduledTaxiOutMinutes() {
        return scheduledTaxiOutMinutes;
    }

    public void setScheduledTaxiOutMinutes(Integer scheduledTaxiOutMinutes) {
        this.scheduledTaxiOutMinutes = scheduledTaxiOutMinutes;
    }

    public Integer getTaxiOutMinutes() {
        return taxiOutMinutes;
    }

    public void setTaxiOutMinutes(Integer taxiOutMinutes) {
        this.taxiOutMinutes = taxiOutMinutes;
    }

    public Integer getScheduledTaxiInMinutes() {
        return scheduledTaxiInMinutes;
    }

    public void setScheduledTaxiInMinutes(Integer scheduledTaxiInMinutes) {
        this.scheduledTaxiInMinutes = scheduledTaxiInMinutes;
    }

}
