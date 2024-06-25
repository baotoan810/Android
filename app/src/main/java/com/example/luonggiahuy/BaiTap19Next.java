package com.example.luonggiahuy;

import android.app.TimePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class BaiTap19Next extends AppCompatActivity {
    TextView tvShowTime;
    TimePicker tpChoose;
    Button btnChooseDataTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap19_next);

        init();
        act();

    }

    public void init(){
        tvShowTime = findViewById(R.id.tvShowTime);
        tpChoose = findViewById(R.id.tpChoose);
        tpChoose.setIs24HourView(true);
        btnChooseDataTime = findViewById(R.id.btnChooseDataTime);

        tvShowTime.setText(String.valueOf(tpChoose.getHour()) + " : " + String.valueOf(tpChoose.getMinute()));
    }

    public void act(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            tpChoose.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
                @Override
                public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                    tvShowTime.setText(String.valueOf(hourOfDay) + " : " + String.valueOf(minute));
                }
            });
        }
        btnChooseDataTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenTimePickerDialog();
            }
        });
    }

    private void OpenTimePickerDialog(){
        Calendar calendar = Calendar.getInstance();
        int vhour = calendar.get(Calendar.HOUR);
        int vminute = calendar.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                tvShowTime.setText(String.valueOf(hourOfDay) + " : " + String.valueOf(minute));

                tpChoose.setCurrentHour(hourOfDay);
                tpChoose.setCurrentMinute(minute);
            }
        }, vhour, vminute, true);
        timePickerDialog.show();
    }
}