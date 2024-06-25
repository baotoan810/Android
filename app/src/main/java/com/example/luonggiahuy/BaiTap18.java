package com.example.luonggiahuy;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BaiTap18 extends AppCompatActivity {

    ListView lvMenu;
    String language[] = {"Java", "Kotlin", "C++", "COBOL", "AppleScript", "FoxPro", "G-Code"};
    ImageView imgPopUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_tap18);

        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, language);
        lvMenu = findViewById(R.id.lvMenu);
        lvMenu.setAdapter(adapter);
        registerForContextMenu(lvMenu);

        init();
        act();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
//        getMenuInflater().inflate(R.menu.option_menu, menu);
//        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
//
        if(item.getItemId() == R.id.item1){
            Toast.makeText(this, "Bạn chọn item1", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId() == R.id.item2){
            Toast.makeText(this, "Bạn chọn item2", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId() == R.id.item3){
            Toast.makeText(this, "Bạn chọn item3", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId() == R.id.item4){
            Toast.makeText(this, "Bạn chọn item4", Toast.LENGTH_SHORT).show();
            return true;
        }
        else{
            return super.onOptionsItemSelected(item);
        }
    }

    // contextMenu

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Chọn");
        menu.add(0, v.getId(), 0, "Code");
        menu.add(0, v.getId(), 0, "Example");
        menu.add(0, v.getId(), 0, "Tutorial");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getTitle() == "Code"){
            Toast.makeText(this, "Chọn Code", Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle() == "Example"){
            Toast.makeText(this, "Chọn Example", Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle() == "Tutorial"){
            Toast.makeText(this, "Chọn Tutorial", Toast.LENGTH_SHORT).show();
        }
        else {
            return false;
        }
        return true;
    }

    public void init(){
        imgPopUp = findViewById(R.id.imgPopUp);
    }

    public void act(){
        imgPopUp.setOnClickListener((v) -> {
            PopupMenu popupMenu = new PopupMenu(BaiTap18.this, imgPopUp);
            popupMenu.getMenuInflater().inflate(R.menu.option_menu, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener((item) -> {
                Toast.makeText(BaiTap18.this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                return false;
            });
            popupMenu.show();
        });
    }
}