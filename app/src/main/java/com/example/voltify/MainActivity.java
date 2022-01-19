package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button btnInserisci;
    Button btnVisualizza;
    EditText txtitolo;
    GestoreBrani gb;
    Spinner spnGenere;
    String[] elencoGeneri = {"Rock", "Rap", "Pop"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInserisci=findViewById(R.id.btnInserisci);
        btnVisualizza=findViewById(R.id.btnVisualizza);
        txtitolo=findViewById(R.id.titolo);
        spnGenere = (Spinner) findViewById(R.id.spnGenere);
        ArrayAdapter<String> spGen = new ArrayAdapter<String>(this, R.layout.activity_main, elencoGeneri);
        spnGenere.setAdapter(spGen);

        gb= new GestoreBrani();

        btnInserisci.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        gb.addBrano(txtitolo.getText().toString());
                    }
                }
        );

        btnVisualizza.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        gb.visualizza();
                        Intent i = new Intent(MainActivity.this, GestoreBrani.class);
                        startActivity(i);
                    }
                }
        );
    }
}