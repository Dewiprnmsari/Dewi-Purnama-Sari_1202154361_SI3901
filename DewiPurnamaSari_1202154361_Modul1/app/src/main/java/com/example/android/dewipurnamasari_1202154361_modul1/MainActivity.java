package com.example.android.dewipurnamasari_1202154361_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_food, et_portion; //untuk deklarasi objek
    Intent intent;
    String restaurant, menu;
    int portion;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //method yang pertama kali dijalankan ketika activity dibuat
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_food = (EditText)findViewById(R.id.et_food); //masukan makanan
        et_portion = (EditText)findViewById(R.id.et_portion); //masukan porsi
        intent = new Intent(this,DaftarPesanan.class);
    }

    public void onEatbus(View view) {
        menu = et_food.getText().toString();
        restaurant = "Eatbus";
        portion = Integer.parseInt(et_portion.getText().toString());
        int total = 50000 * portion;
        Log.d("TOTAL HARGA", "Rp."+total); //menampilkan sesuatu di logcat
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("portion",portion);
        intent.putExtra("price",total);
        startActivity(intent);

    }

    public void onAbnormal(View view) {
        menu = et_food.getText().toString();
        restaurant = "Abnormal";
        portion = Integer.parseInt(et_portion.getText().toString());
        int total = 30000 * portion;
        Log.d("TOTAL HARGA", "Rp."+total); //menampilkan sesuatu di logcat
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("portion",portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }
}
