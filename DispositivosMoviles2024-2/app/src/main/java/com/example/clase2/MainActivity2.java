package com.example.clase2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvUser = findViewById(R.id.tvUser);

        Intent recibirDatos = getIntent();
        String user = recibirDatos.getStringExtra("Usuario");
        tvUser.setText(user);
    }
}