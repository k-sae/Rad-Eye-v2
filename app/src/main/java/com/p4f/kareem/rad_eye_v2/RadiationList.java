package com.p4f.kareem.rad_eye_v2;

/**
 * Created by mohamednagy on 4/28/2017.
 */
public class RadiationList {

    private Radiation m_radiation;
    private String m_detail;

    public RadiationList(Radiation radiation, String detail){
        m_radiation = radiation;
        m_detail = detail;
    }

    public Radiation getM_radiation() {
        return m_radiation;
    }

    public String getM_detail() {
        return m_detail;
    }
}