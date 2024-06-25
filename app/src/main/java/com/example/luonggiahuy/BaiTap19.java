package com.example.luonggiahuy;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class BaiTap19 extends AppCompatActivity {

    TextView tvShowDate;
    DatePicker dpChoose;
    Button btnChooseData, btnGoTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap19);
        init();
        act();
    }
    public void init(){
        tvShowDate = findViewById(R.id.tvShowDate);
        dpChoose = findViewById(R.id.dpChoose);
        btnChooseData = findViewById(R.id.btnChooseData);
        btnGoTime = findViewById(R.id.btnGoTime);

        tvShowDate.setText(String.valueOf(dpChoose.getDayOfMonth()) + "/" + String.valueOf(dpChoose.getMonth()+1) + "/" + String.valueOf(dpChoose.getYear()));
    }

    public void act(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            dpChoose.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
                @Override
                public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    tvShowDate.setText(String.valueOf(dayOfMonth)+ "/" + String.valueOf(monthOfYear+1) + "/" + String.valueOf(year));
                }
            });
        }
        btnChooseData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDatePickerDialog();
            }
        });
        btnGoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartTime();
            }
        });
    }

    public void StartTime(){
        Intent intent = new Intent(this, BaiTap19Next.cilass);
        startActivity(intent);
    }

    private void OpenDatePickerDialog(){
        Calendar calendar = Calendar.getInstance();
        int vyear = calendar.get(Calendar.YEAR);
        int vmonth = calendar.get(Calendar.MONTH);
        int vday = calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog pickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                tvShowDate.setText(String.valueOf(dayOfMonth) + "/" + String.valueOf(month+1) + "/" + String.valueOf(year));
            }
        },vyear,vmonth,vday);
        pickerDialog.show();
    }

}