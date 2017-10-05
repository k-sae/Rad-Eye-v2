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
//        Button button  = (Button) view.findViewById(R.id.findFlights);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getFragmentManager().beginTransaction().add(R.id.overLay, new AvailableFlightsFragment())
//                        .commit();
//            }
//        });
        setEvents(view);
        return view;
    }
    private void setEvents(final View view)
    {
        view.findViewById(R.id.findFlights).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String airline  = ((TextView) view.findViewById(R.id.departure_airport)).getText().toString();
                String flightNo  =  ((TextView) view.findViewById(R.id.arrival_airport)).getText().toString();
                String viewAs = "arr";
                String date  = ((TextView) view.findViewById(R.id.date_editText)).getText().toString();
                AvailableFlightsFragment AvailableFlightsFragment = new AvailableFlightsFragment();
                AvailableFlightsFragment.params = airline + "/" + flightNo + "/" + viewAs + "/" + date + "?appId=a1de1596&appKey=b344fa0a5bda1a056e2021572bcaae42";
                getFragmentManager().beginTransaction().add(R.id.overLay, AvailableFlightsFragment)
                        .commit();

            }
        });

    }
}
