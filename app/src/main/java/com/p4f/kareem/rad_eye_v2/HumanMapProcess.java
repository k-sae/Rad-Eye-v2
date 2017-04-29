package com.p4f.kareem.rad_eye_v2;

import android.util.Log;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by mohamednagy on 4/29/2017.
 */
public class HumanMapProcess {

    ArrayList<Effect> availableEffects;
    EffectsViewHolder effectsViewHolder;

    public HumanMapProcess(EffectsViewHolder effectsViewHolder){
        availableEffects = new ArrayList<>();
        this.effectsViewHolder = effectsViewHolder;
    }

    private void init(){
        availableEffects = new ArrayList<>();
    }

    public void addEffect(HumanNegativeEffect humanNegativeEffect, int effectId){
        // add effect.
        Effect effect = new Effect(humanNegativeEffect, effectId);
        availableEffects.add(effect);
        // set on map .. set listener.
        setEffectOnMap(effect);

    }

    /**
     * Map listeners
     * @param effect
     */
    private void setEffectOnMap(Effect effect) {
        if(effect.getId() == Constants.HUMAN_ARMS ||
                effect.getId() == Constants.HUMAN_LEGS){
            Log.e("arms","vvvvvvvvvvvvvvvvvv");
            effectsViewHolder.getEffectById(effect.getId())
                    .get(0).setVisibility(View.VISIBLE);
            effectsViewHolder.getEffectById(effect.getId())
                    .get(1).setVisibility(View.VISIBLE);

            effectsViewHolder.getEffectById(effect.getId())
                    .get(0).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            /// TODO something ...
                        }
                    });

            effectsViewHolder.getEffectById(effect.getId())
                    .get(1).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    /// TODO something ...
                }
            });
        }else {

            effectsViewHolder.getEffectById(effect.getId()).get(0).setVisibility(View.VISIBLE);
            effectsViewHolder.getEffectById(effect.getId()).get(0)
                    .setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            /// TODO something ...
                        }
                    });
        }
    }


    public void removeEffect(){
        // TODO : stop all threads
        init();

    }
    public void removeEffect(int effectId){
        for(Effect effect : availableEffects){
            if(effect.getId() == effectId){

                if(effect.getId() == Constants.HUMAN_ARMS ||
                        effect.getId() == Constants.HUMAN_LEGS) {

                    effectsViewHolder.getEffectById(effectId).get(0).setVisibility(View.GONE);
                    effectsViewHolder.getEffectById(effectId).get(1).setVisibility(View.GONE);
                    availableEffects.remove(effect);

                }else{
                    effectsViewHolder.getEffectById(effectId).get(0).setVisibility(View.GONE);
                    availableEffects.remove(effect);
                }

            }
        }
    }

}

