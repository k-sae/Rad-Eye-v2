
package com.p4f.kareem.rad_eye_v2.FlightApiData.FlightTrack;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Flight {

    @SerializedName("requested")
    @Expose
    private String requested;
    @SerializedName("interpreted")
    @Expose
    private String interpreted;

    public String getRequested() {
        return requested;
    }

    public void setRequested(String requested) {
        this.requested = requested;
    }

    public String getInterpreted() {
        return interpreted;
    }

    public void setInterpreted(String interpreted) {
        this.interpreted = interpreted;
    }

}
