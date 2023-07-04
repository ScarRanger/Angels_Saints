package com.rhinepereira.saints;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Child_Saints_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_saints_);
        setTitle("Child Saints");

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Child_Saints_Activity.this, DomnicSavio.class);
                startActivity(intent);

            }

        });
        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Child_Saints_Activity.this, Bernadette.class);
                startActivity(intent);

            }

        });
        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Child_Saints_Activity.this, Tarcisius.class);
                startActivity(intent);

            }

        });
        Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Child_Saints_Activity.this, MariaGoretti.class);
                startActivity(intent);

            }

        });
        Button btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Child_Saints_Activity.this, Philomena.class);
                startActivity(intent);

            }

        });
        Button btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Child_Saints_Activity.this, AgnesOfRome.class);
                startActivity(intent);

            }

        });
        Button btn8 = (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Child_Saints_Activity.this, RoseOfViterbo.class);
                startActivity(intent);

            }

        });
        Button btn9 = (Button) findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Child_Saints_Activity.this, ImeldaLambertini.class);
                startActivity(intent);

            }

        });
        Button btn10 = (Button) findViewById(R.id.button10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Child_Saints_Activity.this, Vitus.class);
                startActivity(intent);

            }

        });
        Button btn11 = (Button) findViewById(R.id.button11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Child_Saints_Activity.this, JoseDelRio.class);
                startActivity(intent);

            }

        });
        Button btn12 = (Button) findViewById(R.id.button12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Child_Saints_Activity.this, Crescentius.class);
                startActivity(intent);

            }

        });
        Button btn13 = (Button) findViewById(R.id.button13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Child_Saints_Activity.this, CarloAcutis.class);
                startActivity(intent);

            }

        });




    }



    }


