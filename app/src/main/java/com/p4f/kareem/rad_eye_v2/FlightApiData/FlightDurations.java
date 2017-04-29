
package com.p4f.kareem.rad_eye_v2.FlightApiData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightDurations {

    @SerializedName("scheduledBlockMinutes")
    @Expose
    private Integer scheduledBlockMinutes;
    @SerializedName("blockMinutes")
    @Expose
    private Integer blockMinutes;
    @SerializedName("scheduledAirMinutes")
    @Expose
    private Integer scheduledAirMinutes;
    @SerializedName("airMinutes")
    @Expose
    private Integer airMinutes;
    @SerializedName("scheduledTaxiOutMinutes")
    @Expose
    private Integer scheduledTaxiOutMinutes;
    @SerializedName("taxiOutMinutes")
    @Expose
    private Integer taxiOutMinutes;
    @SerializedName("scheduledTaxiInMinutes")
    @Expose
    private Integer scheduledTaxiInMinutes;
    @SerializedName("taxiInMinutes")
    @Expose
    private Integer taxiInMinutes;

    public Integer getScheduledBlockMinutes() {
        return scheduledBlockMinutes;
    }

    public void setScheduledBlockMinutes(Integer scheduledBlockMinutes) {
        this.scheduledBlockMinutes = scheduledBlockMinutes;
    }

    public Integer getBlockMinutes() {
        return blockMinutes;
    }

    public void setBlockMinutes(Integer blockMinutes) {
        this.blockMinutes = blockMinutes;
    }

    public Integer getScheduledAirMinutes() {
        return scheduledAirMinutes;
    }

    public void setScheduledAirMinutes(Integer scheduledAirMinutes) {
        this.scheduledAirMinutes = scheduledAirMinutes;
    }

    public Integer getAirMinutes() {
        return airMinutes;
    }

    public void setAirMinutes(Integer airMinutes) {
        this.airMinutes = airMinutes;
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

    public Integer getTaxiInMinutes() {
        return taxiInMinutes;
    }

    public void setTaxiInMinutes(Integer taxiInMinutes) {
        this.taxiInMinutes = taxiInMinutes;
    }

}
