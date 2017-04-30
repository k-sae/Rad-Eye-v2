package com.p4f.kareem.rad_eye_v2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.p4f.kareem.rad_eye_v2.Adapters.FragmentAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getFragmentManager());
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.mainViewPager);
        fragmentAdapter.getFragments().add(new FlightStatusByDate());
        viewPager.setAdapter(fragmentAdapter);

        return view;
    }

}
