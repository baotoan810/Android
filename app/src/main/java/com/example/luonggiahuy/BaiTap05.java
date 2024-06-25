package com.example.luonggiahuy;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BaiTap05 extends AppCompatActivity {

    ImageView imgSwitch;
    Switch switchHide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap05);

        init();
        act();

    }

    public void init(){
        imgSwitch = findViewById(R.id.imgSwitch);
        switchHide = findViewById(R.id.switchHide);
    }

    public void act(){
        switchHide.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(BaiTap05.this, "ẨN", Toast.LENGTH_SHORT).show();
                    imgSwitch.setVisibility(View.INVISIBLE);
                }
                else{
                    Toast.makeText(BaiTap05.this, "HIỆN", Toast.LENGTH_SHORT).show();
                    imgSwitch.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}