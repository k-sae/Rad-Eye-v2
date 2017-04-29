package com.p4f.kareem.rad_eye_v2.humanMap;

/**
 * Created by mohamednagy on 4/29/2017.
 */
public class HumanMap {

    private HumanMapProcess humanMapProcess;

    public HumanMap(HumanMapProcess humanMapProcess){
        this.humanMapProcess = humanMapProcess;
    }

    public void setEffectOnHumanMapByID(int effectId){
        // TODO ... get HumanNegativeEffect from firebase.
        HumanNegativeEffect humanNegativeEffect = null;

        humanMapProcess.addEffect(humanNegativeEffect, effectId);

    }
}

