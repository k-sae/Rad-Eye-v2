
package com.p4f.kareem.rad_eye_v2.FlightApiData;

import java.util.List;
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
    @SerializedName("downlines")
    @Expose
    private List<Downline> downlines = null;
    @SerializedName("uplines")
    @Expose
    private List<Upline> uplines = null;

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

    public List<Downline> getDownlines() {
        return downlines;
    }

    public void setDownlines(List<Downline> downlines) {
        this.downlines = downlines;
    }

    public List<Upline> getUplines() {
        return uplines;
    }

    public void setUplines(List<Upline> uplines) {
        this.uplines = uplines;
    }

}
