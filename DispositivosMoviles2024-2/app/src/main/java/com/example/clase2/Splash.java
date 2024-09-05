package com.example.clase2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> { //Lambda
            Intent splash  = new Intent(Splash.this, MainActivity.class);
            startActivity(splash);
            finish();
        },3000);
    }
}