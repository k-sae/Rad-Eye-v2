package com.p4f.kareem.rad_eye_v2.firebase;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by mohamednagy on 4/30/2017.
 */
public class HumanMapFirebase {

    public HumanMapFirebase(){}

    public void getDataFromFirebaseToView(final HumanViewHolder humanViewHolder, String doseType){
        FirebaseHelper.getDoseByType(doseType).addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // TODO ... views
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                }
        );
    }
}
