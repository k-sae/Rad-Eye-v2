package com.p4f.kareem.rad_eye_v2.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.p4f.kareem.rad_eye_v2.Model.FlightStatus;
import com.p4f.kareem.rad_eye_v2.R;

import java.util.ArrayList;

/**
 * Created by kareem on 29/04/17.
 */

public class AvailableFlightsAdapter extends BaseAdapter {
   private ArrayList<FlightStatus> flightStatuses;
    private Context context;

    public ArrayList<FlightStatus> getFlightStatuses() {
        return flightStatuses;
    }

    public void setFlightStatuses(ArrayList<FlightStatus> flightStatuses) {
        this.flightStatuses = flightStatuses;
    }

    public AvailableFlightsAdapter(Context context) {
        flightStatuses = new ArrayList<>();
        this.context = context;
    }
    @Override
    public int getCount() {
        return flightStatuses.size();
    }

    @Override
    public Object getItem(int position) {
        FlightStatus flightStatus = flightStatuses.get(position);

        return  flightStatus;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null)
        {
           convertView =  LayoutInflater.from(context).inflate(R.layout.flightdata_view, parent, false);
        }
        FlightStatus flightStatus = flightStatuses.get(position);
        TextView textView  = (TextView) convertView.findViewById(R.id.origin_AirPort_code);
        textView.setText("Flight No: " + flightStatus.getFlightNumber());
        ((TextView) convertView.findViewById(R.id.dest_Airport)).setText("Date: " + flightStatus.getDepartureDate().getDateLocal());
          return convertView;
    }
}
