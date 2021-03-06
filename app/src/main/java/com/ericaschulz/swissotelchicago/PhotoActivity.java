package com.ericaschulz.swissotelchicago;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class PhotoActivity extends AppCompatActivity {

    CarouselView carouselView;
    TextView carouselTxt;
    Button mHome;



    int[] hotelImages = {R.drawable.classic_king_lg96, R.drawable.duplex_suite_lg, R.drawable.corner_suite_52, R.drawable.junior_96, R.drawable.pres59};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        mHome =(Button)findViewById(R.id.home_btn);


        carouselTxt = (TextView)findViewById(R.id.car_txt);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(hotelImages.length);

        carouselView.setImageListener(imageListener);


        mHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhotoActivity.this, MainActivity.class);

                startActivity(intent);


            }


        });



    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(hotelImages[position]);
        }
    };






}






