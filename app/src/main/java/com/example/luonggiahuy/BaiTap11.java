package com.example.luonggiahuy;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BaiTap11 extends AppCompatActivity {

    TextView tvSeekBar, tvRating1;
    RatingBar rtBar1;
    SeekBar skBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap11);

        init();
        act();
    }

    public void init(){
        tvRating1 = findViewById(R.id.tvRating1);
        rtBar1 = findViewById(R.id.rtBar1);
        float startNum = rtBar1.getRating();
        tvRating1.setText(String.valueOf(startNum));

        tvSeekBar = findViewById(R.id.tvSeekBar);
        skBar = findViewById(R.id.skBar);
        int processNum = skBar.getProgress();
        tvSeekBar.setText(String.valueOf(processNum));
    }

    public void act(){
        rtBar1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tvRating1.setText(String.valueOf(rating));
            }
        });

        skBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvSeekBar.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}