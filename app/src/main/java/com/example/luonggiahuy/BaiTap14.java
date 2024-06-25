package com.example.luonggiahuy;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BaiTap14 extends AppCompatActivity {

    AutoCompleteTextView aTextView1;
    String[] nameList = {"Abhishek", "Anad", "Anurag", "Avni", "Bindiya", "Bunny", "Ban", "Chandni" , "Champ" , "Charu", "Dax", "Dhruva",
            "Milan", "Mayur", "Mohit", "Paya1", "Priti", "Prachi", "Kajal", "Krisha", "Kriva", "Kishan", "Kaushik", "Hetal", "Hina", "Rahul", "Rutvi",
            "Rutvik", "Sneha", "Shreya", "Sarika", "Zen"};

    ArrayAdapter adapter;
    MultiAutoCompleteTextView multiTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap14);

        init();
        act();
    }

    public void init(){
        aTextView1 = findViewById(R.id.aTextView1);
        aTextView1.setAdapter(adapter);
        aTextView1.setThreshold(1);

        multiTextview = findViewById(R.id.multiTextview);
        adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, nameList);

        aTextView1.setAdapter(adapter);
        aTextView1.setThreshold(1);

        multiTextview.setAdapter(adapter);
        multiTextview.setThreshold(1);
        multiTextview.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    public void act(){
        aTextView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(BaiTap14.this, adapter.getItem(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });

        multiTextview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(BaiTap14.this, adapter.getItem(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}