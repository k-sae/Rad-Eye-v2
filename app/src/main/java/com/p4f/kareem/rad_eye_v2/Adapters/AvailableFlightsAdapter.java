package com.p4f.kareem.rad_eye_v2.Adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.p4f.kareem.rad_eye_v2.FlightApiData.FlightStatus;

import java.util.ArrayList;

/**
 * Created by kareem on 29/04/17.
 */

public class AvailableFlightsAdapter extends BaseAdapter {
   private ArrayList<FlightStatus> flightStatuses;

    public AvailableFlightsAdapter() {
        flightStatuses = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return flightStatuses.size();
    }

    @Override
    public Object getItem(int position) {
        return flightStatuses.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
