package com.example.luonggiahuy;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BaiTap04 extends AppCompatActivity {

    ToggleButton tgBtn;
    ImageView imgToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap04);

        init();
        act();

    }

    public void init(){
        tgBtn = findViewById(R.id.tgBtn);
        imgToggle = findViewById(R.id.imgToggle);
        tgBtn.setChecked(true);
    }
    public void act(){
        tgBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(BaiTap04.this, "HIỆN", Toast.LENGTH_SHORT).show();
                    imgToggle.setVisibility(View.VISIBLE);
                }
                else{
                    Toast.makeText(BaiTap04.this, "ẨN", Toast.LENGTH_SHORT).show();
                    imgToggle.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}