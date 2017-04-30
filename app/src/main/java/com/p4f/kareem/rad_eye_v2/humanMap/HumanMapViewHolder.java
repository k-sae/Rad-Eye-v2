package com.p4f.kareem.rad_eye_v2.humanMap;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.p4f.kareem.rad_eye_v2.R;

/**
 * Created by mohamednagy on 4/30/2017.
 */
public class HumanMapViewHolder {

    public final ImageView HUMAN_MAP_IMAGE_VIEW;
    public final TextView DOSE_CANCER_RISK_TEXT_VIEW;
    public final TextView DOSE_PRODUCER_TEXT_VIEW;
    public final TextView DOSE_RADIATION_TEXT_VIEW;

    public HumanMapViewHolder(View humanMapView){
        HUMAN_MAP_IMAGE_VIEW = (ImageView) humanMapView.findViewById(R.id.human_imageView);
        DOSE_CANCER_RISK_TEXT_VIEW = (TextView) humanMapView.findViewById(R.id.cancer_risk);
        DOSE_PRODUCER_TEXT_VIEW = (TextView) humanMapView.findViewById(R.id.procedure);
        DOSE_RADIATION_TEXT_VIEW = (TextView) humanMapView.findViewById(R.id.radiation_dose);
    }
}
