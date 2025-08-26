package com.example.ciclodevidaactivities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate chamado");

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
    }

    @Override protected void onStart() { super.onStart(); Log.i(TAG,"onStart chamado"); }
    @Override protected void onResume() { super.onResume(); Log.i(TAG,"onResume chamado"); }
    @Override protected void onPause() { super.onPause(); Log.i(TAG,"onPause chamado"); }
    @Override protected void onStop() { super.onStop(); Log.i(TAG,"onStop chamado"); }
    @Override protected void onRestart() { super.onRestart(); Log.i(TAG,"onRestart chamado"); }
    @Override protected void onDestroy() { super.onDestroy(); Log.i(TAG,"onDestroy chamado"); }
}