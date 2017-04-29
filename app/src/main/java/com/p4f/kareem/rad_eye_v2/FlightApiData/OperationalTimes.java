
package com.p4f.kareem.rad_eye_v2.FlightApiData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OperationalTimes {

    @SerializedName("publishedDeparture")
    @Expose
    private PublishedDeparture publishedDeparture;
    @SerializedName("publishedArrival")
    @Expose
    private PublishedArrival publishedArrival;
    @SerializedName("scheduledGateDeparture")
    @Expose
    private ScheduledGateDeparture scheduledGateDeparture;
    @SerializedName("estimatedGateDeparture")
    @Expose
    private EstimatedGateDeparture estimatedGateDeparture;
    @SerializedName("actualGateDeparture")
    @Expose
    private ActualGateDeparture actualGateDeparture;
    @SerializedName("flightPlanPlannedDeparture")
    @Expose
    private FlightPlanPlannedDeparture flightPlanPlannedDeparture;
    @SerializedName("estimatedRunwayDeparture")
    @Expose
    private EstimatedRunwayDeparture estimatedRunwayDeparture;
    @SerializedName("actualRunwayDeparture")
    @Expose
    private ActualRunwayDeparture actualRunwayDeparture;
    @SerializedName("scheduledGateArrival")
    @Expose
    private ScheduledGateArrival scheduledGateArrival;
    @SerializedName("estimatedGateArrival")
    @Expose
    private EstimatedGateArrival estimatedGateArrival;
    @SerializedName("actualGateArrival")
    @Expose
    private ActualGateArrival actualGateArrival;
    @SerializedName("flightPlanPlannedArrival")
    @Expose
    private FlightPlanPlannedArrival flightPlanPlannedArrival;
    @SerializedName("estimatedRunwayArrival")
    @Expose
    private EstimatedRunwayArrival estimatedRunwayArrival;
    @SerializedName("actualRunwayArrival")
    @Expose
    private ActualRunwayArrival actualRunwayArrival;

    public PublishedDeparture getPublishedDeparture() {
        return publishedDeparture;
    }

    public void setPublishedDeparture(PublishedDeparture publishedDeparture) {
        this.publishedDeparture = publishedDeparture;
    }

    public PublishedArrival getPublishedArrival() {
        return publishedArrival;
    }

    public void setPublishedArrival(PublishedArrival publishedArrival) {
        this.publishedArrival = publishedArrival;
    }

    public ScheduledGateDeparture getScheduledGateDeparture() {
        return scheduledGateDeparture;
    }

    public void setScheduledGateDeparture(ScheduledGateDeparture scheduledGateDeparture) {
        this.scheduledGateDeparture = scheduledGateDeparture;
    }

    public EstimatedGateDeparture getEstimatedGateDeparture() {
        return estimatedGateDeparture;
    }

    public void setEstimatedGateDeparture(EstimatedGateDeparture estimatedGateDeparture) {
        this.estimatedGateDeparture = estimatedGateDeparture;
    }

    public ActualGateDeparture getActualGateDeparture() {
        return actualGateDeparture;
    }

    public void setActualGateDeparture(ActualGateDeparture actualGateDeparture) {
        this.actualGateDeparture = actualGateDeparture;
    }

    public FlightPlanPlannedDeparture getFlightPlanPlannedDeparture() {
        return flightPlanPlannedDeparture;
    }

    public void setFlightPlanPlannedDeparture(FlightPlanPlannedDeparture flightPlanPlannedDeparture) {
        this.flightPlanPlannedDeparture = flightPlanPlannedDeparture;
    }

    public EstimatedRunwayDeparture getEstimatedRunwayDeparture() {
        return estimatedRunwayDeparture;
    }

    public void setEstimatedRunwayDeparture(EstimatedRunwayDeparture estimatedRunwayDeparture) {
        this.estimatedRunwayDeparture = estimatedRunwayDeparture;
    }

    public ActualRunwayDeparture getActualRunwayDeparture() {
        return actualRunwayDeparture;
    }

    public void setActualRunwayDeparture(ActualRunwayDeparture actualRunwayDeparture) {
        this.actualRunwayDeparture = actualRunwayDeparture;
    }

    public ScheduledGateArrival getScheduledGateArrival() {
        return scheduledGateArrival;
    }

    public void setScheduledGateArrival(ScheduledGateArrival scheduledGateArrival) {
        this.scheduledGateArrival = scheduledGateArrival;
    }

    public EstimatedGateArrival getEstimatedGateArrival() {
        return estimatedGateArrival;
    }

    public void setEstimatedGateArrival(EstimatedGateArrival estimatedGateArrival) {
        this.estimatedGateArrival = estimatedGateArrival;
    }

    public ActualGateArrival getActualGateArrival() {
        return actualGateArrival;
    }

    public void setActualGateArrival(ActualGateArrival actualGateArrival) {
        this.actualGateArrival = actualGateArrival;
    }

    public FlightPlanPlannedArrival getFlightPlanPlannedArrival() {
        return flightPlanPlannedArrival;
    }

    public void setFlightPlanPlannedArrival(FlightPlanPlannedArrival flightPlanPlannedArrival) {
        this.flightPlanPlannedArrival = flightPlanPlannedArrival;
    }

    public EstimatedRunwayArrival getEstimatedRunwayArrival() {
        return estimatedRunwayArrival;
    }

    public void setEstimatedRunwayArrival(EstimatedRunwayArrival estimatedRunwayArrival) {
        this.estimatedRunwayArrival = estimatedRunwayArrival;
    }

    public ActualRunwayArrival getActualRunwayArrival() {
        return actualRunwayArrival;
    }

    public void setActualRunwayArrival(ActualRunwayArrival actualRunwayArrival) {
        this.actualRunwayArrival = actualRunwayArrival;
    }

}
