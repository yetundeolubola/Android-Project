package com.example.akinwaleyetunde.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private static final String LOG_TAG =Main2Activity.class.getSimpleName();
    public static  final String EXTRA_REPLY= "com.example.akinwaleyetunde.myapplication.extra.RELY";


    TextView MessageReceived,MessageDisplay;
    EditText ReplyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       Log.d(LOG_TAG, "----");
       Log.d(LOG_TAG,"onCreate");

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        MessageReceived.setText(message);

        MessageReceived = findViewById(R.id.TextReply);
        MessageDisplay = findViewById(R.id.TextDr);
        ReplyText = findViewById(R.id.ReplyEdit);



        }

    public void ReplyBtn(View view) {

        String reply = ReplyText.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }
}
