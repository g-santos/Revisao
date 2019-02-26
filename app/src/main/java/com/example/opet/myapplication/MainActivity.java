package com.example.opet.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTexto = findViewById(R.id.editTexto);

    }

    public void palindromo (View view){
        String palavra = editTexto.getText().toString();
        String reverso = new StringBuilder(palavra).reverse().toString();
        if(reverso.toUpperCase().equals(palavra.toUpperCase())){
            Toast.makeText(this, "Palindromo", Toast.LENGTH_SHORT);
        }else{
            Toast.makeText(this, "Não é palindromo", Toast.LENGTH_SHORT).show();
        }
    }


}
