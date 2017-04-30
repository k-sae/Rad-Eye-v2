package com.p4f.kareem.rad_eye_v2;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.p4f.kareem.rad_eye_v2.Adapters.AvailableFlightsAdapter;
import com.p4f.kareem.rad_eye_v2.Connections.GetConnector;
import com.p4f.kareem.rad_eye_v2.Connections.PostConnector;
import com.p4f.kareem.rad_eye_v2.FlightApiData.Flight;
import com.p4f.kareem.rad_eye_v2.FlightApiData.FlightStatus;
import com.p4f.kareem.rad_eye_v2.FlightApiData.FlightTrack.FlightTrack;
import com.p4f.kareem.rad_eye_v2.FlightApiData.FlightTrack.FlightsDataTracking;
import com.p4f.kareem.rad_eye_v2.FlightApiData.FlightTrack.Position;
import com.p4f.kareem.rad_eye_v2.FlightApiData.FlightsData;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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
                FlightTrack flightStatus = availableFlightsAdapter.getFlightStatuses().get(position);
                calculate(flightStatus);
            }
        });
        return view;
    }
    private void fetchData(View view)
    {
        final String BASE_URL = "https://api.flightstats.com/flex/flightstatus/rest/v2/json/flight/tracks/";

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
                FlightsDataTracking flightsData = new Gson().fromJson(s,FlightsDataTracking.class);
                availableFlightsAdapter.getFlightStatuses().addAll(flightsData.getFlightTracks());
                availableFlightsAdapter.notifyDataSetChanged();
                Log.e("info", "onPostExecute: Recieved" );
            }
        };
        getConnector.execute("");
    }
    private void calculate(FlightTrack flightTrack)
    {
        
    }
}
