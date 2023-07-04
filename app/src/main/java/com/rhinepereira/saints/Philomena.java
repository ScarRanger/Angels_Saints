package com.rhinepereira.saints;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Philomena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philomena);
        setTitle("St.Philomena");
        Button btn2 = (Button) findViewById(R.id.back);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Philomena.this, MariaGoretti.class);
                startActivity(intent);


            }

        });
        Button btn = (Button) findViewById(R.id.next);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Philomena.this, AgnesOfRome.class);
                startActivity(intent);


            }

        });
    }
}
