package com.ericaschulz.swissotelchicago;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mAcc;
    Button mBook;
    Button mProfile;
    Button mExpl;
    Button mDining;
    Button mPromo;
    Button mMeetings;

    View.OnClickListener listener;

//    String meetings, dining, explore, accomodation, promotions, book, profile, localGuide, details;

//    String[]Details={"Hotel Details", "Accommodation","Explore Hotel", "Dining", "Meetings & Events","Promotions", "Overview"};
//
//    Spinner DetailsSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAcc = (Button) findViewById(R.id.acc_button);
        mBook = (Button) findViewById(R.id.book_button);
        mProfile = (Button) findViewById(R.id.profile_button);
        mExpl = (Button) findViewById(R.id.expl_button);
        mDining = (Button) findViewById(R.id.dining_btn);
        mPromo = (Button) findViewById(R.id.promo_btn);
        mMeetings = (Button) findViewById(R.id.meetings_btn);



        mProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mProfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.swissotel.com/circle/log-in/"));

                startActivity(mProfIntent);

            }
        });

        mBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mBookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.swissotel.com/hotels/chicago/"));

                startActivity(mBookIntent);

            }
        });

        mPromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mPromoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.swissotel.com/hotels/chicago/promotions/"));

                startActivity(mPromoIntent);

            }
        });

        mAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mAccIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.swissotel.com/hotels/chicago/accommodation/"));

                startActivity(mAccIntent);

            }
        });

        mDining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mDinIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.swissotel.com/hotels/chicago/dining/"));

                startActivity(mDinIntent);

            }
        });

        mMeetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mMeetIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.swissotel.com/hotels/chicago/meeting-events/ballrooms/"));

                startActivity(mMeetIntent);

            }
        });

        mExpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mExplIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.swissotel.com/hotels/chicago/explore-hotel/"));

                startActivity(mExplIntent);

            }
        });















//        DetailsSpinner = (Spinner) findViewById(R.id.spinner1);
//        DetailsSpinner.setAdapter(new SpinnerAdapter(MainActivity.this, R.layout.spinner,Details));


    }
//    private class SwissApiTask extends AsyncTask<Void, Void, Void> {
//        @TargetApi(Build.VERSION_CODES.N)
//        @Override
//        protected Void doInBackground(Void... voids) {
//            JSONObject swissJson = JsonParser.getSwissotelChicagoDetails(explore);
//
//            if (swissJson != null && swissJson.length() > 0) {
//
//                try {
//                    explore = swissJson.getJSONObject("details").getString("carouselLinks");
//                    JSONArray carouselArray = swissJson.getJSONArray("carouselLinks");
//
//                    for (int i = 0; i < carouselArray.length(); i++) {
//
//                        JSONObject innerObject = carouselArray.getJSONObject(i);
//                        localGuide = innerObject.getString("local_guide");
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//            return null;
//        }
//        @Override
//        protected void onPostExecute (Void empty){
//
//            explore.setText(explore);
//            localGuide.setText(localGuide);
//        }
//    }

}
