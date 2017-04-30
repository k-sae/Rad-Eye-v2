package com.p4f.kareem.rad_eye_v2.humanMap;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.p4f.kareem.rad_eye_v2.R;
import com.p4f.kareem.rad_eye_v2.firebase.HumanMapFirebase;

/**
 * A placeholder fragment containing a simple view.
 */
public class HumanMapFragment extends Fragment {

    private HumanMapViewHolder humanMapViewHolder;
    private HumanMapFirebase humanMapFirebase;

    private static final String HIGH_DOSE = "highDoss";
    private static final String LOW_DOSE = "lowDoss";
    private static final String MEAN_DOSS = "meanDoss";
    private static final String NO_DOSS = "noDose";


    public HumanMapFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_human_map, container, false);
        humanMapViewHolder = new HumanMapViewHolder(rootView);

        int dose = getActivity().getIntent().getExtras().getInt("dose");

        String doseType = checkDoseRange(dose * Math.pow(10,-3));

        humanMapFirebase.getDataFromFirebaseToView(humanMapViewHolder, doseType);

        return rootView;
    }

    private String checkDoseRange(double dose){
        if(dose <= 0.1)
            return NO_DOSS;
        else if(dose > 0.1 && dose < 1)
            return LOW_DOSE;
        else if(dose >= 1 && dose <= 5)
            return MEAN_DOSS;
        else
            return HIGH_DOSE;
    }
}
