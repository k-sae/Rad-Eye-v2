package com.p4f.kareem.rad_eye_v2.firebase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by mohamednagy on 4/30/2017.
 */
public class FirebaseHelper {

    private static final FirebaseDatabase FIREBASE_DATABASE =
            FirebaseDatabase.getInstance();
    private static final DatabaseReference DATABASE_REFERENCE =
            FIREBASE_DATABASE.getReference().child("doseType");

    public static DatabaseReference getDoseByType(String doseType){
        return DATABASE_REFERENCE.child(doseType);
    }


}
