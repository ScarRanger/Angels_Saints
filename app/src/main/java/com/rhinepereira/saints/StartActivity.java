package com.rhinepereira.saints;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);






//        Context context = getApplicationContext();
//        CharSequence text = "Click on any Image to get started!";
//        int duration = Toast.LENGTH_LONG;
//
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();

        for (int i=0; i < 1; i++)
        {
            Toast.makeText(this, "Click on any Image to get started!", Toast.LENGTH_LONG).show();
        }







        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, ApostleActivity.class);
                startActivity(intent);



            }

        });
        ViewGroup.LayoutParams params = btn2.getLayoutParams();
        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, PrayerActivity2.class);
                startActivity(intent);


            }

        });

        Button btn5 = (Button) findViewById(R.id.button6);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, AngelActivity2.class);
                startActivity(intent);


            }

        });
        Button btn6 = (Button) findViewById(R.id.button7);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, OtherSaintsActivity.class);
                startActivity(intent);


            }

        });


        Button btn7 = (Button) findViewById(R.id.button8);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, Child_Saints_Activity.class);
                startActivity(intent);


            }

        });


        btn7.setLayoutParams(params);
        double screenWidth = 0;
        int buttonWidth = (int) (screenWidth / 3.0);
        LinearLayout.LayoutParams params1 = (LinearLayout.LayoutParams) btn6.getLayoutParams();
        params1.width = buttonWidth;
        params1.leftMargin = buttonWidth;
        btn6.setLayoutParams(params);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_about:
                Intent intent = new Intent(StartActivity.this, AboutActivity.class);
                startActivity(intent);
                return true;
            case R.id.menu_feedback:
                composeFeedback(this, getString(R.string.email_title));
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public static void composeFeedback(Context context, String feedbackOn) {
        try {
            Intent sendIntent = new Intent(Intent.ACTION_SENDTO);

            //if error log exists
            String errorFile = context.getExternalCacheDir() + File.separator + "error.log";
            File errorF = new File(errorFile);
            if (errorF.exists()) {
                Uri path = Uri.fromFile(errorF);
                sendIntent.setType("vnd.android.cursor.dir/email");
                sendIntent.putExtra(Intent.EXTRA_STREAM, path);
            }
            sendIntent.setData(Uri.parse("mailto:rhine.pereira@gmail.com"));
            sendIntent.putExtra(Intent.EXTRA_SUBJECT, feedbackOn);
            sendIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(sendIntent);
        } catch (ActivityNotFoundException anfe) {
            Toast.makeText(context, "Sorry, could not find any app on your device that can compose an email", Toast.LENGTH_LONG).show();
        }

    }

}