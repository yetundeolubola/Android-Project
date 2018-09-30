package com.example.akinwaleyetunde.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public static  final String EXTRA_MESSAGE = "com.example.akinwaleyetunde.myapplication.extra.MESSAGE";

    public static final int TEXT_REQUEST = 1;

    EditText MessageSend;
    TextView TextD,TextM;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "----");
        Log.d(LOG_TAG,"onCreate");

        MessageSend = findViewById(R.id.SendText);
        TextD = findViewById(R.id.TextDisplay);
        TextM = findViewById(R.id.TextMessage);

        }
        public void LaunchSecond(View view) {
            Log.d(LOG_TAG, "Button clicked!");

        Intent intent = new Intent(this, Main2Activity.class);
        String message = MessageSend.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);

        startActivityForResult(intent, TEXT_REQUEST);
        }

        public void onActivityResult(int requestcode, int resultcode, Intent data ) {

        super.onActivityResult(requestcode,resultcode,data);
            if (requestcode == TEXT_REQUEST) {
                if (resultcode == RESULT_OK) {

                    String reply = data.getStringExtra(Main2Activity.EXTRA_REPLY);
                    TextD.setVisibility(View.VISIBLE);
                    TextM.setText(reply);
                    TextM.setVisibility(View.VISIBLE);
                }
            }


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

