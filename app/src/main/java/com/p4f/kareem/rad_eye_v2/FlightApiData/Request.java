
package com.p4f.kareem.rad_eye_v2.FlightApiData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {

    @SerializedName("airline")
    @Expose
    private Airline airline;
    @SerializedName("flight")
    @Expose
    private Flight flight;
    @SerializedName("date")
    @Expose
    private Date date;
    @SerializedName("utc")
    @Expose
    private Utc utc;
    @SerializedName("airport")
    @Expose
    private Airport airport;
    @SerializedName("codeType")
    @Expose
    private CodeType codeType;
    @SerializedName("extendedOptions")
    @Expose
    private ExtendedOptions extendedOptions;
    @SerializedName("url")
    @Expose
    private String url;

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Utc getUtc() {
        return utc;
    }

    public void setUtc(Utc utc) {
        this.utc = utc;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public CodeType getCodeType() {
        return codeType;
    }

    public void setCodeType(CodeType codeType) {
        this.codeType = codeType;
    }

    public ExtendedOptions getExtendedOptions() {
        return extendedOptions;
    }

    public void setExtendedOptions(ExtendedOptions extendedOptions) {
        this.extendedOptions = extendedOptions;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
