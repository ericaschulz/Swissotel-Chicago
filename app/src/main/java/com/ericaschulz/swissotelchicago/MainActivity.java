package com.ericaschulz.swissotelchicago;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mExpl;
    Button mAcc;
    Button mMeetings;


    Button mBook;
    Button mProfile;
//    Button mDining;
//    Button mPromo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mExpl = (Button) findViewById(R.id.expl_button);
        mAcc = (Button) findViewById(R.id.acc_button);
        mMeetings = (Button) findViewById(R.id.meetings_btn);



        mBook = (Button) findViewById(R.id.book_button);
        mProfile = (Button) findViewById(R.id.profile_button);
//        mDining = (Button) findViewById(R.id.dining_btn);
//        mPromo = (Button) findViewById(R.id.promo_btn);






        mExpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mExplIntent = new Intent(MainActivity.this, ExploreActivity.class);

                startActivity(mExplIntent);



            }
        });
        mMeetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mMeetIntent = new Intent(MainActivity.this, MeetingsActivity.class);

                startActivity(mMeetIntent);

            }
        });

        mAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mPhotoIntent = new Intent(MainActivity.this, PhotoActivity.class);

                startActivity(mPhotoIntent);



            }
        });








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


//
//        mPromo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent mPromoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.swissotel.com/hotels/chicago/promotions/"));
//
//                startActivity(mPromoIntent);
//
//            }
//        });
//

//
//        mDining.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent mDinIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.swissotel.com/hotels/chicago/dining/"));
//
//                startActivity(mDinIntent);
//
//            }
//        });
//





    }



}
