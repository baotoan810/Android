package com.example.luonggiahuy;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BaiTap10 extends AppCompatActivity {

    TextView tvRating;
    RatingBar rtBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap10);

        init();
        act();
    }

    public void init(){
        tvRating = findViewById(R.id.tvRating);
        rtBar = findViewById(R.id.rtBar);
        float startNum = rtBar.getRating();
        tvRating.setText(String.valueOf(startNum));
    }

    public void act(){
        rtBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tvRating.setText(String.valueOf(rating));
            }
        });
    }
}