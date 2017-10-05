package com.p4f.kareem.rad_eye_v2;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DoseActivityFragment extends Fragment {

    public DoseActivityFragment() {
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String dose = getActivity().getIntent().getExtras().getString("dose");
        View view  = inflater.inflate(R.layout.fragment_dose, container, false);
        ((TextView) view.findViewById(R.id.currentDose)).setText(dose + "\nuSv");
        return view;
    }
}
