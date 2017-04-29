package com.p4f.kareem.rad_eye_v2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.p4f.kareem.rad_eye_v2.Adapters.AvailableFlightsAdapter;
import com.p4f.kareem.rad_eye_v2.Connections.GetConnector;
import com.p4f.kareem.rad_eye_v2.FlightApiData.Flight;
import com.p4f.kareem.rad_eye_v2.FlightApiData.FlightStatus;
import com.p4f.kareem.rad_eye_v2.FlightApiData.FlightsData;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

//
/**
 * A simple {@link Fragment} subclass.
 */
public class availableFlights extends Fragment {

    private AvailableFlightsAdapter availableFlightsAdapter;
    public availableFlights() {
        // Required empty public constructor
    }
    public String params;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        availableFlightsAdapter = new AvailableFlightsAdapter(getActivity());
        View view = inflater.inflate(R.layout.fragment_available_flights, container, false);
        ListView listView = (ListView) view.findViewById(R.id.availableFlights_ListView);
        fetchData(view);
        listView.setAdapter(availableFlightsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        return view;
    }
    private void fetchData(View view)
    {
        final String BASE_URL = "https://api.flightstats.com/flex/flightstatus/rest/v2/json/flight/status/";

        GetConnector getConnector = new GetConnector() {
            @Override
            protected URL fetchURL(String s) {
                try {
                    Log.e("URL:", "fetchURL: " + BASE_URL + params );
                    return  new URL( BASE_URL + params);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                FlightsData flightsData = new Gson().fromJson(s,FlightsData.class);
                availableFlightsAdapter.getFlightStatuses().addAll(flightsData.getFlightStatuses());
                availableFlightsAdapter.notifyDataSetChanged();
                Log.e("info", "onPostExecute: Recieved" );
            }
        };
        getConnector.execute("");
    }
    private void calculate(FlightStatus flightStatus)
    {
//        flightStatus.s
    }
}
