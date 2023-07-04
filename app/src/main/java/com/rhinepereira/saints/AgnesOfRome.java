package com.rhinepereira.saints;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AgnesOfRome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agnes_of_rome);
        setTitle("St.Agnes Of Rome");


        Button btn2 = (Button) findViewById(R.id.back);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AgnesOfRome.this, Philomena.class);
                startActivity(intent);


            }

        });
        Button btn = (Button) findViewById(R.id.next);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AgnesOfRome.this, RoseOfViterbo.class);
                startActivity(intent);


            }

        });
    }
}
