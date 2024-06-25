package com.example.luonggiahuy;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BaiTap08 extends AppCompatActivity {

    RadioGroup RgGender;
    RadioButton radioMale, radioFemale, radioOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap08);

        init();
        act();
    }

    public void init(){
        RgGender = findViewById(R.id.RgGender);
        radioMale = findViewById(R.id.radioMale);
        radioFemale = findViewById(R.id.radioFemale);
        radioOther = findViewById(R.id.radioOther);
    }
    public void act(){
        RgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                switch (checkedId){
//                    case a:
//                        Toast.makeText(BT1C8Activity.this, "You are Male", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.radioFemale:
//                        Toast.makeText(BT1C8Activity.this, "You are Female", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.radioOther:
//                        Toast.makeText(BT1C8Activity.this, "Are you Gender ?", Toast.LENGTH_SHORT).show();
//                        break;
//                }
                if(checkedId == R.id.radioMale){
                    Toast.makeText(BaiTap08.this, "You are Male", Toast.LENGTH_SHORT).show();
                }
                else if(checkedId == R.id.radioFemale){
                    Toast.makeText(BaiTap08.this, "You are Female", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(BaiTap08.this, "Are you Gender ?", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}