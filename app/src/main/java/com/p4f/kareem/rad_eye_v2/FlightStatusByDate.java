package com.p4f.kareem.rad_eye_v2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FlightStatusByDate extends Fragment {


    public FlightStatusByDate() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_flight_status_by_date, container, false);
        setEvents(view);
        return view;
    }
    private void setEvents(final View view)
    {
        view.findViewById(R.id.findFlights).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String DepartureAirPort  = ((TextView) view.findViewById(R.id.departure_airport)).getText().toString();
                String arrivalAirport  =  ((TextView) view.findViewById(R.id.arrival_airport)).getText().toString();
                String viewAs = "dep";
                String date  = ((TextView) view.findViewById(R.id.date_editText)).getText().toString();
                AvailableFlightsFragment AvailableFlightsFragment = new AvailableFlightsFragment();
                AvailableFlightsFragment.params = DepartureAirPort + "/" + arrivalAirport + "/" + viewAs + "/" + date + "?appId="+ Cred.APP_ID +"&appKey=" + Cred.APP_KEY + "&utc=false&numHours=24&maxFlights=5";
                getFragmentManager().beginTransaction().add(R.id.overLay, AvailableFlightsFragment)
                        .commit();

            }
        });

    }
}
