package com.example.luonggiahuy;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BaiTap02 extends AppCompatActivity {

    TextView tvShow;
    EditText edtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap02);


        init();
        act();

    }

    public void init(){
        edtName = findViewById(R.id.edtName);
        tvShow = findViewById(R.id.tvShow);
    }

    public void act(){
        edtName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                tvShow.setText(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}