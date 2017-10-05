
package com.p4f.kareem.rad_eye_v2.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Schedule {

    @SerializedName("flightType")
    @Expose
    private String flightType;
    @SerializedName("serviceClasses")
    @Expose
    private String serviceClasses;
    @SerializedName("restrictions")
    @Expose
    private String restrictions;

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public String getServiceClasses() {
        return serviceClasses;
    }

    public void setServiceClasses(String serviceClasses) {
        this.serviceClasses = serviceClasses;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

}
