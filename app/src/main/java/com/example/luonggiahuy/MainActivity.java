package com.example.luonggiahuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnBaiTap01, btnBaiTap02, btnBaiTap03, btnBaiTap04, btnBaiTap05, btnBaiTap06, btnBaiTap07, btnBaiTap08, btnBaiTap09, btnBaiTap10, btnBaiTap11, btnBaiTap12, btnBaiTap13, btnBaiTap14, btnBaiTap15, btnBaiTap16, btnBaiTap17, btnBaiTap18, btnBaiTap19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        intit();
        Act();

    }

    private void intit() {
        btnBaiTap01 = findViewById(R.id.btnBaiTap01);
        btnBaiTap02 = findViewById(R.id.btnBaiTap02);
        btnBaiTap03 = findViewById(R.id.btnBaiTap03);
        btnBaiTap04 = findViewById(R.id.btnBaiTap04);
        btnBaiTap05 = findViewById(R.id.btnBaiTap05);
        btnBaiTap06 = findViewById(R.id.btnBaiTap06);
        btnBaiTap07 = findViewById(R.id.btnBaiTap07);
        btnBaiTap08 = findViewById(R.id.btnBaiTap08);
        btnBaiTap09 = findViewById(R.id.btnBaiTap09);
        btnBaiTap10 = findViewById(R.id.btnBaiTap10);
        btnBaiTap11 = findViewById(R.id.btnBaiTap11);
        btnBaiTap12 = findViewById(R.id.btnBaiTap12);
        btnBaiTap13 = findViewById(R.id.btnBaiTap13);
        btnBaiTap14 = findViewById(R.id.btnBaiTap14);
        btnBaiTap15 = findViewById(R.id.btnBaiTap15);
        btnBaiTap16 = findViewById(R.id.btnBaiTap16);
        btnBaiTap17 = findViewById(R.id.btnBaiTap17);
        btnBaiTap18 = findViewById(R.id.btnBaiTap18);
        btnBaiTap19 = findViewById(R.id.btnBaiTap19);

    }

    private  void Act() {
        btnBaiTap01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap01.class);
                startActivity(intent);
            }
        });

        btnBaiTap02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap02.class);
                startActivity(intent);
            }
        });

        btnBaiTap03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap03.class);
                startActivity(intent);
            }
        });

        btnBaiTap04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap04.class);
                startActivity(intent);
            }
        });

        btnBaiTap05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap05.class);
                startActivity(intent);
            }
        });

        btnBaiTap06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap06.class);
                startActivity(intent);
            }
        });

        btnBaiTap07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap07.class);
                startActivity(intent);
            }
        });

        btnBaiTap08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap08.class);
                startActivity(intent);
            }
        });

        btnBaiTap09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap09.class);
                startActivity(intent);
            }
        });

        btnBaiTap10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap10.class);
                startActivity(intent);
            }
        });

        btnBaiTap11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap11.class);
                startActivity(intent);
            }
        });

        btnBaiTap12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap12.class);
                startActivity(intent);
            }
        });

        btnBaiTap13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap13.class);
                startActivity(intent);
            }
        });

        btnBaiTap14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap14.class);
                startActivity(intent);
            }
        });

        btnBaiTap15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap15.class);
                startActivity(intent);
            }
        });

        btnBaiTap16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap16.class);
                startActivity(intent);
            }
        });

        btnBaiTap17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap17.class);
                startActivity(intent);
            }
        });

        btnBaiTap18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap18.class);
                startActivity(intent);
            }
        });

        btnBaiTap19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiTap19.class);
                startActivity(intent);
            }
        });

    }
}