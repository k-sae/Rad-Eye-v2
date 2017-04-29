package com.p4f.kareem.rad_eye_v2.humanMap.properties;

import android.view.View;
import android.widget.ImageView;

import com.p4f.kareem.rad_eye_v2.R;
import com.p4f.kareem.rad_eye_v2.humanMap.utility.Constants;

import java.util.ArrayList;

/**
 * Created by mohamednagy on 4/29/2017.
 */
public class EffectsViewHolder {
    public final ImageView HUMAN_HEAD_TOP_IMAGE_VIEW;
    public final ImageView HUMAN_LUNG_IMAGE_VIEW;
    public final ImageView HUMAN_ARMS_ONE_IMAGE_VIEW;
    public final ImageView HUMAN_ARMS_TWO_IMAGE_VIEW;
    public final ImageView HUMAN_LEGS_ONE_IMAGE_VIEW;
    public final ImageView HUMAN_LEGS_TWO_IMAGE_VIEW;
    public final ImageView HUMAN_HEART_IMAGE_VIEW;
    public final ImageView HUMAN_BELLY_BELOW_IMAGE_VIEW;
    public final ImageView HUMAN_BELLY_ABOVE_IMAGE_VIEW;

    public EffectsViewHolder(View effectView){
        HUMAN_HEAD_TOP_IMAGE_VIEW = (ImageView) effectView.findViewById(R.id.head_top_effect);
        HUMAN_LUNG_IMAGE_VIEW = (ImageView) effectView.findViewById(R.id.lung_effect);
        HUMAN_ARMS_ONE_IMAGE_VIEW = (ImageView) effectView.findViewById(R.id.arms1_effect);
        HUMAN_ARMS_TWO_IMAGE_VIEW = (ImageView) effectView.findViewById(R.id.arms2_effect);
        HUMAN_LEGS_ONE_IMAGE_VIEW = (ImageView) effectView.findViewById(R.id.legs1_effect);
        HUMAN_LEGS_TWO_IMAGE_VIEW = (ImageView) effectView.findViewById(R.id.legs2_effect);
        HUMAN_HEART_IMAGE_VIEW = (ImageView) effectView.findViewById(R.id.heart_effect);
        HUMAN_BELLY_BELOW_IMAGE_VIEW = (ImageView) effectView.findViewById(R.id.belly_below_effect);
        HUMAN_BELLY_ABOVE_IMAGE_VIEW = (ImageView) effectView.findViewById(R.id.belly_above_effect);
    }

    public ArrayList<ImageView> getEffectById(int id){
        ArrayList<ImageView> imageViews = new ArrayList<>();

        switch (id){
            case Constants.HUMAN_ARMS:
                imageViews.add(HUMAN_ARMS_ONE_IMAGE_VIEW);
                imageViews.add(HUMAN_ARMS_TWO_IMAGE_VIEW);
                break;
            case Constants.HUMAN_BELLY_ABOVE:
                imageViews.add(HUMAN_BELLY_ABOVE_IMAGE_VIEW);
                break;
            case Constants.HUMAN_BELLY_BELOW:
                imageViews.add(HUMAN_BELLY_BELOW_IMAGE_VIEW);
                break;
            case Constants.HUMAN_HEAD_TOP:
                imageViews.add(HUMAN_HEAD_TOP_IMAGE_VIEW);
                break;
            case Constants.HUMAN_HEART:
                imageViews.add(HUMAN_HEART_IMAGE_VIEW);
                break;
            case Constants.HUMAN_LEGS:
                imageViews.add(HUMAN_LEGS_ONE_IMAGE_VIEW);
                imageViews.add(HUMAN_LEGS_TWO_IMAGE_VIEW);
                break;
            case Constants.HUMAN_LUNG:
                imageViews.add(HUMAN_LUNG_IMAGE_VIEW);
                break;
            default:
                return null;
        }

        return imageViews;
    }
}
