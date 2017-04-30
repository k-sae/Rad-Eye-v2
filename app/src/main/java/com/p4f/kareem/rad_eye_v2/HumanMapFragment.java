package com.p4f.kareem.rad_eye_v2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class HumanMapFragment extends Fragment {

    public HumanMapFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_human_map, container, false);

        int dose = getActivity().getIntent().getExtras().getInt("dose");


        return rootView;
    }
}
