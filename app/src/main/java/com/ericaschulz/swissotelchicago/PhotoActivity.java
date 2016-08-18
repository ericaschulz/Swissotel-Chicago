package com.ericaschulz.swissotelchicago;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class PhotoActivity extends AppCompatActivity {

    CarouselView carouselView;
    TextView carouselTxt;





    int[] hotelImages = {R.drawable.lolla, R.drawable.bean, R.drawable.thepier};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselTxt = (TextView)findViewById(R.id.car_txt);
        carouselView.setPageCount(hotelImages.length);

        carouselView.setImageListener(imageListener);





    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(hotelImages[position]);
        }
    };





}






