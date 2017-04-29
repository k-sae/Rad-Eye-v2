
package com.p4f.kareem.rad_eye_v2.FlightApiData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightEquipment {

    @SerializedName("scheduledEquipmentIataCode")
    @Expose
    private String scheduledEquipmentIataCode;

    public String getScheduledEquipmentIataCode() {
        return scheduledEquipmentIataCode;
    }

    public void setScheduledEquipmentIataCode(String scheduledEquipmentIataCode) {
        this.scheduledEquipmentIataCode = scheduledEquipmentIataCode;
    }

}
