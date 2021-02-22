package com.example.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private final String TAG_SECOND = "Second Activity";
    Button buttonFirst, buttonMain;
    TextView textViewSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG_SECOND, "onCreate()");
        Toast.makeText(getApplicationContext(), "Second Activity onCreate()", Toast.LENGTH_LONG).show();
        buttonFirst = (Button) findViewById(R.id.buttonFirst);
        buttonMain = (Button) findViewById(R.id.buttonMain);
        textViewSecond = (TextView) findViewById(R.id.textViewSecond);
        buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });
        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG_SECOND, "onStart()");
        Toast.makeText(getApplicationContext(), "Second Activity onStart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG_SECOND, "onResume()");
        Toast.makeText(getApplicationContext(), "Second Activity onResume()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG_SECOND, "onPause()");
        Toast.makeText(getApplicationContext(), "Second Activity onPause()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG_SECOND, "onStop()");
        Toast.makeText(getApplicationContext(), "Second Activity onStop()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG_SECOND, "onRestart()");
        Toast.makeText(getApplicationContext(), "Second Activity onRestart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG_SECOND, "onDestroy()");
        Toast.makeText(getApplicationContext(), "Second Activity onDestroy()", Toast.LENGTH_LONG).show();
    }
}