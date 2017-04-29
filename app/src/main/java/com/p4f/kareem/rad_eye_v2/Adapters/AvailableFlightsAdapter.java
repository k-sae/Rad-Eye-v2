package com.p4f.kareem.rad_eye_v2.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.p4f.kareem.rad_eye_v2.FlightApiData.FlightStatus;
import com.p4f.kareem.rad_eye_v2.FlightApiData.FlightTrack.FlightTrack;
import com.p4f.kareem.rad_eye_v2.R;

import java.util.ArrayList;

/**
 * Created by kareem on 29/04/17.
 */

public class AvailableFlightsAdapter extends BaseAdapter {
   private ArrayList<FlightTrack> flightStatuses;
    private Context context;

    public ArrayList<FlightTrack> getFlightStatuses() {
        return flightStatuses;
    }

    public void setFlightStatuses(ArrayList<FlightTrack> flightStatuses) {
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
        FlightTrack flightStatus = flightStatuses.get(position);

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
        FlightTrack flightStatus = flightStatuses.get(position);
        TextView textView  = (TextView) convertView.findViewById(R.id.flightDetail_textView);
        textView.setText(flightStatus.getFlightNumber());
//        ((TextView) convertView.findViewById(R.id.flightDetail_textView)).setText(flightStatus.getFlightId());
        return convertView;
    }
}
