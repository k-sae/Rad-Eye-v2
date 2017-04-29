
package com.p4f.kareem.rad_eye_v2.FlightApiData.FlightTrack;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Position {

    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("speedMph")
    @Expose
    private Integer speedMph;
    @SerializedName("altitudeFt")
    @Expose
    private Integer altitudeFt;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("date")
    @Expose
    private String date;

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Integer getSpeedMph() {
        return speedMph;
    }

    public void setSpeedMph(Integer speedMph) {
        this.speedMph = speedMph;
    }

    public Integer getAltitudeFt() {
        return altitudeFt;
    }

    public void setAltitudeFt(Integer altitudeFt) {
        this.altitudeFt = altitudeFt;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
