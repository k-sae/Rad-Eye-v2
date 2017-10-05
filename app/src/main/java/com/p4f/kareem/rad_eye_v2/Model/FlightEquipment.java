
package com.p4f.kareem.rad_eye_v2.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightEquipment {

    @SerializedName("scheduledEquipmentIataCode")
    @Expose
    private String scheduledEquipmentIataCode;
    @SerializedName("actualEquipmentIataCode")
    @Expose
    private String actualEquipmentIataCode;
    @SerializedName("tailNumber")
    @Expose
    private String tailNumber;

    public String getScheduledEquipmentIataCode() {
        return scheduledEquipmentIataCode;
    }

    public void setScheduledEquipmentIataCode(String scheduledEquipmentIataCode) {
        this.scheduledEquipmentIataCode = scheduledEquipmentIataCode;
    }

    public String getActualEquipmentIataCode() {
        return actualEquipmentIataCode;
    }

    public void setActualEquipmentIataCode(String actualEquipmentIataCode) {
        this.actualEquipmentIataCode = actualEquipmentIataCode;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

}
