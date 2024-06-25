package com.example.luonggiahuy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BaiTap06 extends AppCompatActivity {

    Button btnSubmit;
    CheckBox cbFootball, cbGolf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap06);
        init();
        act();
    }

    public void init(){
        btnSubmit = findViewById(R.id.btnSubmit);
        cbFootball = findViewById(R.id.cbFootball);
        cbGolf = findViewById(R.id.cbGolf);
    }

    public void act(){
        btnSubmit.setOnClickListener((v) -> {
            boolean f = cbFootball.isChecked();
            boolean g = cbGolf.isChecked();
            if(f){
                if(g){
                    Toast.makeText(BaiTap06.this, "Bạn chọn bóng đá và đánh golf", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(BaiTap06.this, "Bạn chọn bóng đá", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                if(g){
                    Toast.makeText(BaiTap06.this, "Bạn chọn đánh golf", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(BaiTap06.this, "Bạn không chọn gì cả", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbFootball.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if(isChecked){
                Toast.makeText(BaiTap06.this, "Bạn chọn bóng đá", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(BaiTap06.this, "Bạn bỏ chọn bóng đá", Toast.LENGTH_SHORT).show();
            }
        }));

        cbGolf.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if(isChecked){
                Toast.makeText(BaiTap06.this, "Bạn chọn đánh golf", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(BaiTap06.this, "Bạn bỏ chọn đánh golf", Toast.LENGTH_SHORT).show();
            }
        }));
    }
}