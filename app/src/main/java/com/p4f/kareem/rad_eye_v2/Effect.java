package com.p4f.kareem.rad_eye_v2;

/**
 * Created by mohamednagy on 4/29/2017.
 */
public class Effect {

    private  HumanNegativeEffect humanNegativeEffect;
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
