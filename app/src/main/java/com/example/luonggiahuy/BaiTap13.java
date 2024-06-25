package com.example.luonggiahuy;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BaiTap13 extends AppCompatActivity {

    AutoCompleteTextView aTextView;
    String[] nameList = {"Abhishek", "Anad", "Luong Gia Huy", "Anurag", "Avni", "Bindiya", "Bunny", "Ban", "Chandni" , "Champ" , "Charu", "Dax", "Dhruva",
            "Milan", "Mayur", "Mohit", "Paya1", "Priti", "Prachi", "Kajal", "Krisha", "Kriva", "Kishan", "Kaushik", "Hetal", "Hina", "Rahul", "Rutvi",
            "Rutvik", "Sneha", "Shreya", "Sarika", "Zen"};
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap13);
        init();
        act();
    }

    public void init(){
        aTextView = findViewById(R.id.aTextView);
        adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, nameList);

        aTextView.setAdapter(adapter);
        aTextView.setThreshold(1);
    }

    public void act(){
        aTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(BaiTap13.this, adapter.getItem(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}