
package com.p4f.kareem.rad_eye_v2.FlightApiData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Delays {

    @SerializedName("departureRunwayDelayMinutes")
    @Expose
    private Integer departureRunwayDelayMinutes;

    public Integer getDepartureRunwayDelayMinutes() {
        return departureRunwayDelayMinutes;
    }

    public void setDepartureRunwayDelayMinutes(Integer departureRunwayDelayMinutes) {
        this.departureRunwayDelayMinutes = departureRunwayDelayMinutes;
    }

}
