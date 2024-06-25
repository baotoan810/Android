package com.example.luonggiahuy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BaiTap03 extends AppCompatActivity {

    TextView tvNumClick;
    Button btnClick;
    Integer solanclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap03);
        init();
        act();

    }

    public void init(){
        tvNumClick = findViewById(R.id.tvNumClick);
        btnClick = findViewById(R.id.btnClick);
        solanclick = 0;
    }

    public void act(){
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solanclick++;
                tvNumClick.setText(String.valueOf(solanclick));
            }
        });
    }
}