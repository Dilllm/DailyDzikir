package com.example.dailydzikir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    ImageButton btMorning, btEvening, btPray, btDoa, btTasbih, btInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btMorning = findViewById(R.id.morning_dzikir);
        btEvening = findViewById(R.id.evening_dzikir);
        btPray = findViewById(R.id.pray_dzikir);
        btDoa = findViewById(R.id.doa_dzikir);
        btTasbih = findViewById(R.id.tasbih_dzikir);
        btInfo = findViewById(R.id.info_dzikir);

        btMorning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, MorningDzikir.class);
                startActivity(intent);

            }
        });
        btEvening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, EveningDzikir.class);
                startActivity(intent);

            }
        });
        btPray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, PrayDzikir.class);
                startActivity(intent);

            }
        });
        btDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, DoaDzikir.class);
                startActivity(intent);

            }
        });
        btTasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, TasbihDzikir.class);
                startActivity(intent);
            }
        });
        btInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, InfoDzikir.class);
                startActivity(intent);
            }
        });
    }
}
