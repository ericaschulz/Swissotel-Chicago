package com.ericaschulz.swissotelchicago;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ExploreActivity extends AppCompatActivity {


    ImageView mLolla;
    ImageView mBean;
    ImageView mPier;
    String overview;
    JSONArray events;
    JSONObject weather;
    TextView mExplore;
    Button mHome;
    View.OnClickListener onClickListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        mExplore = (TextView) findViewById(R.id.explore);
        mPier = (ImageView) findViewById(R.id.chicago_img);
        mPier.setImageResource(R.drawable.thepier);
        mHome = (Button) findViewById(R.id.home_btn);


        SwissApiTask httpTask = new SwissApiTask();
        httpTask.execute();


        mHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExploreActivity.this, MainActivity.class);

                startActivity(intent);


            }


        });



    }

    private class SwissApiTask extends AsyncTask<Void, Void, Void> {
        @TargetApi(Build.VERSION_CODES.N)
        @Override
        protected Void doInBackground(Void... voids) {
            JsonParser parser = new JsonParser();
            JSONObject response = parser.getDetails();
            try {
                JSONObject mDetails = response.getJSONObject("details");
                events = mDetails.getJSONArray("events");
                JSONObject weatherRequest = mDetails.getJSONObject("weatherRequest");
                weather = weatherRequest.getJSONObject("data");
                overview = mDetails.getString("overview");




                Log.i("json", "testing json json json");

            } catch (JSONException e) {
                e.printStackTrace();
            }


            try{


            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }
        @Override
        protected void onPostExecute (Void empty){

            mExplore.setText(overview);


        }
    }



}
