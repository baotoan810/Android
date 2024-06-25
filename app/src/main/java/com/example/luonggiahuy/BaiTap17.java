package com.example.luonggiahuy;

import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BaiTap17 extends AppCompatActivity {

    Button btnsimpleToast, btncustomToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap17);
        init();
        act();
    }

    public void init(){
        btnsimpleToast = findViewById(R.id.btnSimpleToast);
        btncustomToast = findViewById(R.id.btnCustomToast);
    }
    private void showToasts() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast toastTop = Toast.makeText(BaiTap17.this, "Hiện ở trên", Toast.LENGTH_SHORT);
                toastTop.setGravity(Gravity.TOP, 0, 100);
                toastTop.show();
            }
        }, 0);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast toastCenter = Toast.makeText(BaiTap17.this, "Hiện ở giữa", Toast.LENGTH_SHORT);
                toastCenter.setGravity(Gravity.CENTER, 0, 0);
                toastCenter.show();
            }
        }, 2000);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast toastBottom = Toast.makeText(BaiTap17.this, "Hiện ở dưới", Toast.LENGTH_SHORT);
                toastBottom.setGravity(Gravity.BOTTOM, 0, 100);
                toastBottom.show();
            }
        }, 4000);
    }

    public void act(){
        btnsimpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToasts();
            }
        });

        btncustomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.customToastContainer));
                TextView textView = layout.findViewById(R.id.tvToastCustom);
                textView.setText("Đây là Toast được custom");

                Toast toast = new Toast(BaiTap17.this);
                toast.setView(layout);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
    }
}