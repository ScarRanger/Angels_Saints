package com.rhinepereira.saints;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PrayerActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer2);
        setTitle("Prayers");


        Button btn2 = (Button) findViewById(R.id.button);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrayerActivity2.this, CreedActivity.class);
                startActivity(intent);


            }

        });
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrayerActivity2.this, LordsActivity.class);
                startActivity(intent);


            }

        });
        Button btn3 = (Button) findViewById(R.id.button2);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrayerActivity2.this, HailActivity.class);
                startActivity(intent);


            }

        });

        Button btn4 = (Button) findViewById(R.id.button3);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrayerActivity2.this, QueenActivity.class);
                startActivity(intent);


            }

        });
        Button btn5 = (Button) findViewById(R.id.button4);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrayerActivity2.this, CommunionActivity.class);
                startActivity(intent);


            }

        });
        Button btn6 = (Button) findViewById(R.id.button5);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrayerActivity2.this, AngelActivity.class);
                startActivity(intent);


            }

        });
        Button btn7 = (Button) findViewById(R.id.button6);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrayerActivity2.this, FatimaActivity.class);
                startActivity(intent);


            }

        });


        Button btn8 = (Button) findViewById(R.id.button7);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrayerActivity2.this, NiceneActivity.class);
                startActivity(intent);


            }

        });

        Button btn9 = (Button) findViewById(R.id.button8);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrayerActivity2.this, Prayer_HolySpirit.class);
                startActivity(intent);


            }

        });

        Button btn10 = findViewById(R.id.button9);
        btn10.setOnClickListener(view -> {
            Intent intent = new Intent(PrayerActivity2.this, Memorare.class);
            startActivity(intent);


        });

        Button btn11 = findViewById(R.id.button10);
        btn11.setOnClickListener(view -> {
            Intent intent = new Intent(PrayerActivity2.this, MysteryActivity.class);
            startActivity(intent);


        });


    }


}



