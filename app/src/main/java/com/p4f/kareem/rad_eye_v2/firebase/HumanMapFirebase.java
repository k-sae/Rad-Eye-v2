package com.p4f.kareem.rad_eye_v2.firebase;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.p4f.kareem.rad_eye_v2.humanMap.HumanMapViewHolder;

/**
 * Created by mohamednagy on 4/30/2017.
 */
public class HumanMapFirebase {

    public HumanMapFirebase(){}

    public void getDataFromFirebaseToView(final HumanMapViewHolder humanMapViewHolder, String doseType){
        FirebaseHelper.getDoseByType(doseType).addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // TODO ... views
                        Dose dose = dataSnapshot.getValue(Dose.class);

                        humanMapViewHolder.DOSE_RADIATION_TEXT_VIEW
                                .setText(dose.getDoseRadiation());
                        humanMapViewHolder.DOSE_PRODUCER_TEXT_VIEW
                                .setText(dose.getDoseType());
                        humanMapViewHolder.DOSE_CANCER_RISK_TEXT_VIEW
                                .setText(dose.getDoseCancerRisk());

                        // setHumanBodyColor();

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                }
        );
    }
}
