package com.example.clase2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.provider.MediaStore;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvUser;
    Button btnCamara, btnInstagram;
    ImageView imageView;
    String TAG = "Test";
    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Inicializa elementos UI
        tvUser = findViewById(R.id.tvUser);
        btnCamara = findViewById(R.id.btnCamara);
        btnInstagram = findViewById(R.id.btnInstagram);
        imageView = findViewById(R.id.ivImagen);

        // Recibir datos del intent anterior
        Intent recibirDatos = getIntent();
        String user = recibirDatos.getStringExtra("Usuario");
        tvUser.setText(user);

        // Intent para abrir Instagram
        Intent instagram = new Intent(Intent.ACTION_VIEW);
        instagram.setData(Uri.parse("https://www.instagram.com/torotzl"));

        // Acción botón Cámara
        btnCamara.setOnClickListener(view -> {
            Log.d(TAG, "ESTOY EN EL BOTON CAMARA");
            dispatchTakePictureIntent();
        });

        // Acción botón Instagram
        btnInstagram.setOnClickListener(view -> {
            Log.d(TAG, "ESTOY EN EL BOTON INSTAGRAM");
            startActivity(instagram);
        });
    }

    @SuppressLint("QueryPermissionsNeeded")
    private void dispatchTakePictureIntent() {
        Intent tomarFoto = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (tomarFoto.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(tomarFoto, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            assert data != null;
            Bundle extras = data.getExtras();
            assert extras != null;
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            imageView.setImageBitmap(imageBitmap); // Mostrar la imagen en el ImageView
        }
    }

    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Estoy en el onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Estoy en el onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Estoy en el onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Estoy en el onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Estoy en el onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Estoy en el onDestroy");
    }
}
