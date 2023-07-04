package com.rhinepereira.saints;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

//        Button btn3 = (Button) findViewById(R.id.insta);
//        btn3.setOnClickListener(new View.OnClickListener() {
//            Uri uri = Uri.parse("http://instagram.com/_u/xxx");
//            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
//
//likeIng.setPackage("com.instagram.android");
//
//try {
//                startActivity(likeIng);
//            } catch (
//            ActivityNotFoundException e) {
//                startActivity(new Intent(Intent.ACTION_VIEW,
//                        Uri.parse("http://instagram.com/xxx")));
//            }
//
//        });
//


        Button btn3 = (Button) findViewById(R.id.insta);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Uri uri = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);

                Uri uri = Uri.parse("http://instagram.com/_u/rhine_p_");
            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

likeIng.setPackage("com.instagram.android");

try {
                startActivity(likeIng);
            } catch (
            ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://instagram.com/rhine_p_")));
            }


            }

        });

//
    }



}
