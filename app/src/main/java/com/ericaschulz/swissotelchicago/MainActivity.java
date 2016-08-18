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







        mExpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mExplIntent = new Intent(MainActivity.this, ExploreActivity.class);

                startActivity(mExplIntent);



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
        mAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mPhotoIntent = new Intent(MainActivity.this, PhotoActivity.class);

                startActivity(mPhotoIntent);



            }
        });

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
        mMeetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mMeetIntent = new Intent(MainActivity.this, PhotoActivity.class);

                startActivity(mMeetIntent);

            }
        });





    }



}
