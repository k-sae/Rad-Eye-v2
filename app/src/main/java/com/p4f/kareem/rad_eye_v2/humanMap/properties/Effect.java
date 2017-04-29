package com.p4f.kareem.rad_eye_v2.humanMap.properties;

import com.p4f.kareem.rad_eye_v2.humanMap.HumanNegativeEffect;

/**
 * Created by mohamednagy on 4/29/2017.
 */
public class Effect {

    private HumanNegativeEffect humanNegativeEffect;
    private int id;

    public Effect( HumanNegativeEffect humanNegativeEffect, int id){
        this.humanNegativeEffect = humanNegativeEffect;
        this.id = id;
    }

    public  HumanNegativeEffect getHumanNegativeEffect() {
        return humanNegativeEffect;
    }

    public int getId() {
        return id;
    }
}
