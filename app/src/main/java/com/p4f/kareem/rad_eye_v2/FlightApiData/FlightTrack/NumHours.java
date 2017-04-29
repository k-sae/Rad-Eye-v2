
package com.p4f.kareem.rad_eye_v2.FlightApiData.FlightTrack;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NumHours {

    @SerializedName("interpreted")
    @Expose
    private Integer interpreted;

    public Integer getInterpreted() {
        return interpreted;
    }

    public void setInterpreted(Integer interpreted) {
        this.interpreted = interpreted;
    }

}
