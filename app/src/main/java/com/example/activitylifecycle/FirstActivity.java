package com.example.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    String TAG = "FirstActivity";
    Button buttonSecond, buttonMain;
    TextView textViewFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.d(TAG, "onCreate()");
        Toast.makeText(getApplicationContext(), "First Activity onCreate()", Toast.LENGTH_LONG).show();

        buttonSecond = (Button) findViewById(R.id.buttonSecond);
        buttonMain = (Button) findViewById(R.id.buttonMain);
        textViewFirst = (TextView) findViewById(R.id.textViewFirst);

        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });

        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart()");
        Toast.makeText(getApplicationContext(), "First Activity onStart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume()");
        Toast.makeText(getApplicationContext(), "First Activity onResume()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause()");
        Toast.makeText(getApplicationContext(), "First Activity onPause()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop()");
        Toast.makeText(getApplicationContext(), "First Activity onStop()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
        Toast.makeText(getApplicationContext(), "First Activity onDestroy()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart()");
        Toast.makeText(getApplicationContext(), "First Activity onRestart()", Toast.LENGTH_LONG).show();
    }
}