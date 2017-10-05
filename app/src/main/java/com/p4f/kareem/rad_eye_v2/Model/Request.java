
package com.p4f.kareem.rad_eye_v2.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {

    @SerializedName("departureAirport")
    @Expose
    private DepartureAirport departureAirport;
    @SerializedName("arrivalAirport")
    @Expose
    private ArrivalAirport arrivalAirport;
    @SerializedName("date")
    @Expose
    private Date date;
    @SerializedName("hourOfDay")
    @Expose
    private HourOfDay hourOfDay;
    @SerializedName("utc")
    @Expose
    private Utc utc;
    @SerializedName("numHours")
    @Expose
    private NumHours numHours;
    @SerializedName("codeType")
    @Expose
    private CodeType codeType;
    @SerializedName("maxFlights")
    @Expose
    private MaxFlights maxFlights;
    @SerializedName("extendedOptions")
    @Expose
    private ExtendedOptions extendedOptions;
    @SerializedName("url")
    @Expose
    private String url;

    public DepartureAirport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(DepartureAirport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public ArrivalAirport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(ArrivalAirport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public HourOfDay getHourOfDay() {
        return hourOfDay;
    }

    public void setHourOfDay(HourOfDay hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    public Utc getUtc() {
        return utc;
    }

    public void setUtc(Utc utc) {
        this.utc = utc;
    }

    public NumHours getNumHours() {
        return numHours;
    }

    public void setNumHours(NumHours numHours) {
        this.numHours = numHours;
    }

    public CodeType getCodeType() {
        return codeType;
    }

    public void setCodeType(CodeType codeType) {
        this.codeType = codeType;
    }

    public MaxFlights getMaxFlights() {
        return maxFlights;
    }

    public void setMaxFlights(MaxFlights maxFlights) {
        this.maxFlights = maxFlights;
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
