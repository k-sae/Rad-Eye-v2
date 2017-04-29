
package com.p4f.kareem.rad_eye_v2.FlightApiData.FlightTrack;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightsDataTracking {

    @SerializedName("request")
    @Expose
    private Request request;
    @SerializedName("appendix")
    @Expose
    private Appendix appendix;
    @SerializedName("flightTracks")
    @Expose
    private List<FlightTrack> flightTracks = null;

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

    public List<FlightTrack> getFlightTracks() {
        return flightTracks;
    }

    public void setFlightTracks(List<FlightTrack> flightTracks) {
        this.flightTracks = flightTracks;
    }

}
