package com.example.sitilis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_age";
    public static final String EXTRA_LOCATION = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_PHOTO = "extra_photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

         if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail");
         }


        TextView tvCityName = findViewById(R.id.Tv_city_name);
        TextView tvCityLocation = findViewById(R.id.Tv_city_location);
        TextView tvCityDetail = findViewById(R.id.Tv_city_detail);
        ImageView ivImage = findViewById(R.id.Iv_images);

        String cityName = getIntent().getStringExtra(EXTRA_NAME);
        String cityLocation = getIntent().getStringExtra(EXTRA_LOCATION);
        String cityDetail = getIntent().getStringExtra(EXTRA_DETAIL);
        int photo = getIntent().getIntExtra(EXTRA_PHOTO, 0);

        tvCityName.setText(cityName);
        tvCityLocation.setText(cityLocation);
        tvCityDetail.setText(cityDetail);
        ivImage.setImageResource(photo);
    }
}
