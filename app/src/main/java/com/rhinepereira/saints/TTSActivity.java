//package com.rhinepereira.saints;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.speech.tts.TextToSpeech;
//import androidx.appcompat.app.AppCompatActivity;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
//public class TTSActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
//
//    int MY_DATA_CHECK_CODE = 1000;
//
//    TextToSpeech textToSpeech;
//
//    EditText editText;
//    Button button;
//    private int i;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tts);
//
//
//        editText = (EditText) findViewById(R.id.editText);
//        button = (Button) findViewById(R.id.button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String text = editText.getText().toString();
//                if (text.length() > 0) {
//                    textToSpeech.speak(text, TextToSpeech.QUEUE_ADD, null);
//
//                }
//
//
//            }
//        });
//        Intent intent = new Intent();
//        intent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
//        startActivityForResult(intent, MY_DATA_CHECK_CODE);
//
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == MY_DATA_CHECK_CODE) {
//            if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
//                textToSpeech = new TextToSpeech(this, this);
//
//            } else {
//                Intent intent = new Intent();
//                intent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
//                startActivity(intent);
//            }
//        }
//    }
//
//    @Override
//    public void onInit(int status) {
//
//    }
//
//}
//
