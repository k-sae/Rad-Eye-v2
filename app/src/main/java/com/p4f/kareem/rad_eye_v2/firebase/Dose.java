package com.p4f.kareem.rad_eye_v2.firebase;

/**
 * Created by mohamednagy on 4/30/2017.
 */
public class Dose {
    private String doseType;
    private String doseCancerRisk;
    private String doseRadiation;

    public Dose(String doseType, String doseCancerRisk, String doseRadiation){
        this.doseCancerRisk = doseCancerRisk;
        this.doseRadiation = doseRadiation;
        this.doseType = doseType;
    }

    public String getDoseCancerRisk() {
        return doseCancerRisk;
    }

    public String getDoseRadiation() {
        return doseRadiation;
    }

    public String getDoseType() {
        return doseType;
    }
}
