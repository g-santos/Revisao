package com.example.opet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class DadosActivity extends AppCompatActivity {

    private EditText editTexto;
    private TextView textDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);
    }


    public void rolar(View view) {

        String numeros = editTexto.getText().toString();
        Integer numero = Integer.valueOf(numeros);
        Integer  total = 0;

        if(numero <=0){
            numero = 1;
        }

        String rolagens = "";
        for (int i = 0; i < numero; i++){

            Random rand = new Random();
            int rolagem = rand.nextInt(6) + 1;
            total += rolagem;
            rolagens += rolagem + ":";
        }

        rolagens += total;
        textDados.setText(rolagens);
    }
}
