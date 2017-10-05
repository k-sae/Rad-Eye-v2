
package com.p4f.kareem.rad_eye_v2.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightTracker {

    @SerializedName("request")
    @Expose
    private Request request;
    @SerializedName("appendix")
    @Expose
    private Appendix appendix;
    @SerializedName("flightTrack")
    @Expose
    private FlightTrack flightTrack;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Appendix getAppendix() {
        return appendix;
    }

    public void setAppendix(Appendix appendix) {
        this.appendix = appendix;
    }

    public FlightTrack getFlightTrack() {
        return flightTrack;
    }

    public void setFlightTrack(FlightTrack flightTrack) {
        this.flightTrack = flightTrack;
    }

}
