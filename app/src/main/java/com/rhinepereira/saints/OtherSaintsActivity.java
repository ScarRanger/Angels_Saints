package com.rhinepereira.saints;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class OtherSaintsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_saints);
        setTitle("Other Saints");

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, Mark.class);
                startActivity(intent);

            }

        });
        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, Luke.class);
                startActivity(intent);

            }

        });
        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, Paul.class);
                startActivity(intent);

            }

        });
        Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, FrancisXavier.class);
                startActivity(intent);

            }

        });
        Button btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, GonsaloGarcia.class);
                startActivity(intent);

            }

        });
        Button btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, AnthonyPadua.class);
                startActivity(intent);

            }

        });
        Button btn8 = (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, TheresaCalcutta.class);
                startActivity(intent);

            }

        });
        Button btn9 = (Button) findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, Alphonsa.class);
                startActivity(intent);

            }

        });
        Button btn10 = (Button) findViewById(R.id.button10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, PadrePio.class);
                startActivity(intent);

            }

        });
        Button btn11 = (Button) findViewById(R.id.button11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, MaryMagdelene.class);
                startActivity(intent);

            }

        });
        Button btn12 = (Button) findViewById(R.id.button12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, MaryFautina.class);
                startActivity(intent);

            }

        });
        Button btn13 = (Button) findViewById(R.id.button13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, TheresaChildJesus.class);
                startActivity(intent);

            }

        });
        Button btn14 = (Button) findViewById(R.id.button14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, Joseph.class);
                startActivity(intent);

            }

        });
        Button btn15 = (Button) findViewById(R.id.button15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, FrancisAssisi.class);
                startActivity(intent);

            }

        });
        Button btn16 = (Button) findViewById(R.id.button16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, Clare.class);
                startActivity(intent);

            }

        });
        Button btn17 = (Button) findViewById(R.id.button17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherSaintsActivity.this, Bernadette.class);
                startActivity(intent);

            }

        });




    }
}
