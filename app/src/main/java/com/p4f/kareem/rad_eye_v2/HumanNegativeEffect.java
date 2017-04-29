package com.p4f.kareem.rad_eye_v2;


import java.util.ArrayList;
/**
 * Created by mohamednagy on 4/28/2017.
 */
public class HumanNegativeEffect {

    private String m_info;
    private ArrayList<RadiationList> m_radiationDamage;
    private ArrayList<RadiationList> m_radiationProtection;

    public HumanNegativeEffect() {
    }

    public HumanNegativeEffect(String info) {
        m_info = info;
    }

    public HumanNegativeEffect(String info, ArrayList<RadiationList> radiationDamage,
                               ArrayList<RadiationList> radiationProtection) {
        m_info = info;
        m_radiationDamage = radiationDamage;
        m_radiationProtection = radiationProtection;
    }

    public String getM_info() {
        return m_info;
    }

    public ArrayList<RadiationList> getM_radiationDamage() {
        return m_radiationDamage;
    }

    public ArrayList<RadiationList> getM_radiationProtection() {
        return m_radiationProtection;
    }

    public void setM_radiationDamage(ArrayList<RadiationList> m_radiationDamage) {
        this.m_radiationDamage = m_radiationDamage;
    }

    public void setM_radiationProtection(ArrayList<RadiationList> m_radiationProtection) {
        this.m_radiationProtection = m_radiationProtection;
    }
}