package com.example.clase2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout llButtons;
    TextView tvSucc;
    EditText etUser;
    EditText etPass;
    Button btnAccept;
    Button btnClear;
    String TAG = "Test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llButtons = (LinearLayout) findViewById(R.id.llButtons);
        tvSucc = (TextView) findViewById(R.id.tvSucc);
        etUser = (EditText) findViewById(R.id.etUser);
        etPass = (EditText) findViewById(R.id.etPass);
        btnAccept = (Button) findViewById(R.id.btnAccept);
        btnClear = (Button) findViewById(R.id.btnClear);

        Log.d(TAG,"OnCreate");

        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSucc.setText("Juanito Alimaña");
                etUser.setText("Listo");
                etPass.setText("Calisto");
                llButtons.setBackgroundColor(getResources().getColor(R.color.sky_blue));
                tvSucc.setBackgroundColor(getResources().getColor(R.color.black));
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etUser.setText("");
                etPass.setText("");
                tvSucc.setText("Limpio :D");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"OnResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"OnDestroy");
    }
}