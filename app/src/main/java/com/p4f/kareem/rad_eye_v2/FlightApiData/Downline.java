
package com.p4f.kareem.rad_eye_v2.FlightApiData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Downline {

    @SerializedName("fsCode")
    @Expose
    private String fsCode;
    @SerializedName("flightId")
    @Expose
    private Integer flightId;

    public String getFsCode() {
        return fsCode;
    }

    public void setFsCode(String fsCode) {
        this.fsCode = fsCode;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

}
