package com.example.luonggiahuy;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BaiTap12 extends AppCompatActivity {
    TextView tvProBar, tvSeekBar2, tvRating2;
    RatingBar rtBar2;
    SeekBar skBar2;
    ProgressBar pgBar;
    ImageView imgProBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap12);

        init();
        act();
    }

    public void init(){
        tvRating2 = findViewById(R.id.tvRating2);
        rtBar2 = findViewById(R.id.rtBar2);
        float startNum = rtBar2.getRating();
        tvRating2.setText(String.valueOf(startNum));

        tvSeekBar2 = findViewById(R.id.tvSeekBar2);
        skBar2 = findViewById(R.id.skBar2);
        int processNum = skBar2.getProgress();
        tvSeekBar2.setText(String.valueOf(processNum));

        tvProBar = findViewById(R.id.tvProBar);
        pgBar = findViewById(R.id.pgBar);
        imgProBar = findViewById(R.id.imgProBar);
        int i = pgBar.getProgress();
        tvProBar.setText(String.valueOf(i));
    }

    public void act(){
        rtBar2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tvRating2.setText(String.valueOf(rating));
            }
        });

        skBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvSeekBar2.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        imgProBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = pgBar.getProgress();
                if(i < pgBar.getMax()){
                    i = i + 10;
                }
                else{
                    i = 0;
                }
                tvProBar.setText(String.valueOf(i));
                pgBar.setProgress(i);
            }
        });
    }
}