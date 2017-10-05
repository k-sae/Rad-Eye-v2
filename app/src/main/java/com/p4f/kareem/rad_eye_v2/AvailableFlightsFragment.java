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
import com.p4f.kareem.rad_eye_v2.Model.FlightStateWithRoute;
import com.p4f.kareem.rad_eye_v2.Model.FlightStatus;
import com.p4f.kareem.rad_eye_v2.Model.FlightTrack;
import com.p4f.kareem.rad_eye_v2.Model.FlightTracker;
import com.p4f.kareem.rad_eye_v2.Model.Position;
import com.p4f.kareem.rad_eye_v2.humanMap.HumanMap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class AvailableFlightsFragment extends android.support.v4.app.Fragment {

    private AvailableFlightsAdapter availableFlightsAdapter;
    public AvailableFlightsFragment() {
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
                FlightStatus flightStatus = availableFlightsAdapter.getFlightStatuses().get(position);
                trackFlight(flightStatus);
            }
        });
        return view;
    }
    private void fetchData(View view)
    {
        final String HISTORICAL_stats_BASE_URL = "https://api.flightstats.com/flex/flightstatus/historical/rest/v3/json/route/status/";
        final String FLIGHT_STAT = "https://api.flightstats.com/flex/flightstatus/rest/v2/json/route/status/";
        GetConnector getConnector = new GetConnector() {
            @Override
            protected URL fetchURL(String s) {
                try {
                    Log.e("URL:", "fetchURL: " + FLIGHT_STAT + params );
                    return  new URL( FLIGHT_STAT + params);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                FlightStateWithRoute flightsData = new Gson().fromJson(s,FlightStateWithRoute.class);
                if (flightsData == null || availableFlightsAdapter.getFlightStatuses() == null || flightsData.getFlightStatuses() == null) return;
                availableFlightsAdapter.getFlightStatuses().addAll(flightsData.getFlightStatuses());
                availableFlightsAdapter.notifyDataSetChanged();
                Log.e("info", "onPostExecute: Recieved" );
            }
        };
        getConnector.execute("");
    }
    private void calculate(FlightTracker flightTracker) throws MalformedURLException {
        Integer max = 0;
        for (Position position:flightTracker.getFlightTrack().getPositions()
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
        params.put("DateOfFlight", "08/2017");
        params.put("Ocode",  flightTracker.getAppendix().getAirports().get(0).getIcao());
        params.put("DCode", flightTracker.getAppendix().getAirports().get(flightTracker.getAppendix().getAirports().size() - 1).getIcao());
        params.put("NumOfSteps", 1);
        params.put("ClimbTime", 30);
        params.put("StepAlt_1", max);
        params.put("StepMin_1", 960);
        params.put("MinDown", 30);
        postConnector.setParams(params);
        postConnector.execute();
    }
    private String  getDoseFromHtml(String data)
    {
        String s = "color=\"#0000FF\">&nbsp;";
        if (!data.contains(s)) return "0.0000";
        data = data.substring(data.indexOf(s) + s.length(), data.indexOf("</font><font face=\"Arial\"")).replaceAll("(\\s|\\n)", "");
        return data;
    }
    private void trackFlight(FlightStatus flightStatus)
    {
        final String FLIGHT_TRACK = "https://api.flightstats.com/flex/flightstatus/rest/v2/json/flight/track/";
        final String params =  flightStatus.getFlightId() + "?appId="+Cred.APP_ID+"&appKey=" + Cred.APP_KEY + "&includeFlightPlan=false";
        GetConnector getConnector = new GetConnector() {
            @Override
            protected URL fetchURL(String s) {
                try {
                    Log.e("URL:", "fetchURL: " + FLIGHT_TRACK + params );
                    return  new URL( FLIGHT_TRACK + params);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                FlightTracker flightsData = new Gson().fromJson(s,FlightTracker.class);
                if (flightsData == null || availableFlightsAdapter.getFlightStatuses() == null || flightsData.getFlightTrack() == null) return;
                try {
                    calculate(flightsData);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                Log.e("info", "onPostExecute: Recieved" );
            }
        };
        getConnector.execute("");
    }
}
