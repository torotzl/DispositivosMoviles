package com.example.clase2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText usuario; //Declarar componentes
    TextView textView;
    Button btnjuanito;
    Button btnAlimaña;
    String Usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText) findViewById(R.id.usuario); //Comprobar el "Tipo de Dato" del componente con su id
        textView = (TextView) findViewById(R.id.textview);
        btnjuanito = (Button) findViewById(R.id.btnJuanito);
        btnAlimaña = (Button) findViewById(R.id.btnAlimaña);//No es necesario poner el tipo de dato en parentesis, pero con este se evitan problemas con id iguales

        btnjuanito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Ome Recocha ome");
                Usuario = String.valueOf(usuario.getText());
            }
        });
        btnAlimaña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}