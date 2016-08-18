package com.ericaschulz.swissotelchicago;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MeetingsActivity extends AppCompatActivity {

    Button mHome;

    CarouselView carouselView;

    int[] meetingImages = {R.drawable.edelweiss_lg, R.drawable.lucerne_lg, R.drawable.matterhorn_lg, R.drawable.vevey_lg, R.drawable.monte_rosa_lg};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meetings);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(meetingImages.length);

        carouselView.setImageListener(imageListener);
        mHome = (Button) findViewById(R.id.home_btn);




        mHome.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MeetingsActivity.this, MainActivity.class);

                startActivity(intent);


            }

        });



    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(meetingImages[position]);
        }
    };
}
