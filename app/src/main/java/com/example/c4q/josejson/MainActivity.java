package com.example.c4q.josejson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Json Example";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject newJsonWeAreMaking = new JSONObject();

        try {
            newJsonWeAreMaking.put("The Crew", new JSONArray()
            .put(new JSONObject().put("name","Dibz"))
                    .put(new JSONObject().put("name", "Casablanca"))
                    .put(new JSONObject().put("name", "DopeBoy"))
                    .put(new JSONObject().put("name", "Envy"))
                    .put(new JSONObject().put("name", "Ronaldo")));


        }catch (JSONException e){
            e.printStackTrace();
        }

        Log.d(TAG, "onCreate: " + newJsonWeAreMaking.toString());

    }

}
