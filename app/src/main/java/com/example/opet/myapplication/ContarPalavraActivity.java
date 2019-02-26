package com.example.opet.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ContarPalavraActivity extends AppCompatActivity {

    private EditText editTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar_palavra);
    }

    public void contar (View view){
        String frase = editTexto.getText().toString().toUpperCase();
        frase = frase.replace("","");
        String palavras[] = frase.split("");
        Toast.makeText(this, String.valueOf(palavras.length), Toast.LENGTH_SHORT).show();
    }

}
