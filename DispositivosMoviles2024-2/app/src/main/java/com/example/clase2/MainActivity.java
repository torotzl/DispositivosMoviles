package com.example.clase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    User user;
    EditText etUser, etPass;
    Button btnAccept, btnClear;

    String TAG = "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUser = findViewById(R.id.etUser);
        etPass = findViewById(R.id.etPass);
        btnAccept = findViewById(R.id.btnAccept);
        btnClear = findViewById(R.id.btnClear);

        btnAccept.setOnClickListener(view -> { //Lambda

            Log.d(TAG,"ESTOY EN EL BOTON ACEPTAR");

            user = new User(etUser.getText().toString(), etPass.getText().toString());

            Intent enviarDatos = new Intent(MainActivity.this, MainActivity2.class);
            enviarDatos.putExtra("Usuario",user.User);
            enviarDatos.putExtra("Contraseña",user.Pass);
            startActivity(enviarDatos);

        });

        btnClear.setOnClickListener(view -> { //Lambda

            Log.d(TAG,"ESTOY EN EL BOTON LIMPIAR");

            etUser.setText("");
            etPass.setText("");
        });
    }
}