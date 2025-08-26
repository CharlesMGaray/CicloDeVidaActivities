package com.example.ciclodevidaactivities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(TAG, "onCreate chamado");

        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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