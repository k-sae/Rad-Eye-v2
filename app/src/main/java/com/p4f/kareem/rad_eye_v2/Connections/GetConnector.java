package com.p4f.kareem.rad_eye_v2.Connections;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by kareem on 28/04/17.
 */
//next
public abstract class GetConnector extends AsyncTask<String, Void, String> {
    @Override
    protected String doInBackground(String... sortMode)   {
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        String jsonResponse = "";
        try
        {
            URL url = fetchURL(sortMode[0]);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            InputStream inputStream = urlConnection.getInputStream();
            StringBuilder buffer = new StringBuilder();
            if (inputStream == null) {
                // Nothing to do.
                return null;
            }
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line + "\n");
            }

            if (buffer.length() == 0) {
                // Stream was empty.  No point in parsing.
                return null;
            }
            jsonResponse = buffer.toString();
        }catch (Exception e)
        {
            Log.e("exeption", e.getMessage());
        }finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (final IOException e) {
                    Log.e("PlaceholderFragment", "Error closing stream", e);
                }
            }
        }
        try{
            return jsonResponse;
        }catch (Exception e)
        {
            Log.w("Tag", e.getMessage());
            return null;
        }

    }
    abstract protected URL fetchURL(String s);
}