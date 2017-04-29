package com.p4f.kareem.rad_eye_v2;


/**
 * Created by mohamednagy on 4/28/2017.
 */
public class Radiation {

    private String m_name;
    private String m_info;
    private double m_intensity;
    private double m_energy;
    private String m_linkDetails;

    private Radiation() {
    }

    public Radiation(String radiationName) {
        m_name = radiationName;
    }

    public Radiation(String radiationName, String radiationInfo, double radiationIntensity,
                     double radiationEnergy, String moreDetails) {
        m_name = radiationName;
        m_info = radiationInfo;
        m_intensity = radiationIntensity;
        m_energy = radiationEnergy;
        m_linkDetails = moreDetails;
    }

    public double getM_energy() {
        return m_energy;
    }

    public double getM_intensity() {
        return m_intensity;
    }

    public String getM_info() {
        return m_info;
    }

    public String getM_linkDetails() {
        return m_linkDetails;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_energy(double m_energy) {
        this.m_energy = m_energy;
    }

    public void setM_info(String m_info) {
        this.m_info = m_info;
    }

    public void setM_intensity(double m_intensity) {
        this.m_intensity = m_intensity;
    }

    public void setM_linkDetails(String m_linkDetails) {
        this.m_linkDetails = m_linkDetails;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }
}