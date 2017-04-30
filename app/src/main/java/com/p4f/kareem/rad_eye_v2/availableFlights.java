package com.p4f.kareem.rad_eye_v2;


//

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.p4f.kareem.rad_eye_v2.Adapters.AvailableFlightsAdapter;
import com.p4f.kareem.rad_eye_v2.Connections.GetConnector;
import com.p4f.kareem.rad_eye_v2.Connections.PostConnector;
import com.p4f.kareem.rad_eye_v2.FlightApiData.FlightTrack.FlightTrack;
import com.p4f.kareem.rad_eye_v2.FlightApiData.FlightTrack.FlightsDataTracking;
import com.p4f.kareem.rad_eye_v2.FlightApiData.FlightTrack.Position;
import com.p4f.kareem.rad_eye_v2.humanMap.HumanMap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class availableFlights extends android.support.v4.app.Fragment {

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
                try {
                    calculate(flightStatus);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
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
                if (flightsData == null || availableFlightsAdapter.getFlightStatuses() == null) return;
                availableFlightsAdapter.getFlightStatuses().addAll(flightsData.getFlightTracks());
                availableFlightsAdapter.notifyDataSetChanged();
                Log.e("info", "onPostExecute: Recieved" );
            }
        };
        getConnector.execute("");
    }
    private void calculate(FlightTrack flightTrack) throws MalformedURLException {
        Integer max = 0;
        for (Position position:flightTrack.getPositions()
             ) {
            if (position.getAltitudeFt()!= null)
            if (position.getAltitudeFt() > max)
            {
                max = position.getAltitudeFt();
            }
        }
        URL url = new URL("http://jag.cami.jccbi.gov/cariresults.asp");
        PostConnector postConnector = new PostConnector(url) {
            @Override
            public void onFinish(String data) {
              String dose = getDoseFromHtml(data);
                Intent intent = new Intent(getActivity(),DoseActivity.class);
                intent.putExtra("dose", dose);
                startActivity(intent);
            }
        };
        Map<String, Object> params = new LinkedHashMap<>();
        params.put("DateOfFlight", "03/2017");
        params.put("Ocode", "K" + flightTrack.getDepartureAirportFsCode());
        params.put("DCode", "K" + flightTrack.getDepartureAirportFsCode());
        params.put("NumOfSteps", 1);
        params.put("ClimbTime", 30);
        params.put("StepAlt_1", max);
        params.put("StepMin_1", 30);
        params.put("MinDown", 30);
//        params.put("DateOfFlight", "03/2017");
//        params.put("Ocode", "KK78");
//        params.put("DCode", "KCIR");
//        params.put("NumOfSteps", 1);
//        params.put("ClimbTime", 1);
//        params.put("StepAlt_1", 15000);
//        params.put("StepMin_1", 30);
//        params.put("MinDown", 30);
        postConnector.setParams(params);
        postConnector.execute();
    }
    private String  getDoseFromHtml(String data)
    {
        String s = " &nbsp;(";
        return data.substring(data.indexOf(s) + s.length(), data.indexOf(" millisieverts"));
    }
}
