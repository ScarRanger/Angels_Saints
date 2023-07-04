package com.rhinepereira.saints;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }
    public static void composeFeedback(Context context, String feedbackOn ) {
        try {
            Intent sendIntent = new Intent(Intent.ACTION_SENDTO);

            //if error log exists
            String errorFile = context.getExternalCacheDir() + File.separator + "error.log";
            File errorF = new File(errorFile);
            if (errorF.exists()) {
                Uri path = Uri.fromFile(errorF);
                sendIntent .setType("vnd.android.cursor.dir/email");
                sendIntent .putExtra(Intent.EXTRA_STREAM, path);
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
