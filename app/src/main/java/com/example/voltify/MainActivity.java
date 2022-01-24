package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button btnInserisci; //definizione variabile Button
    Button btnVisualizza; //definizione variabile Button
    EditText txtitolo; //definizione variabile EditText
    GestoreBrani gb; //definizione oggetto classe GestoreBrani
    Spinner spnGenere; //definizione variabile Spinner
    String[] elencoGeneri = {"Rock", "Rap", "Pop"}; //definizione array spinner

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInserisci=findViewById(R.id.btnInserisci); //associazione variabile all'elemento nella view
        btnVisualizza=findViewById(R.id.btnVisualizza); //associazione variabile all'elemento nella view
        txtitolo=findViewById(R.id.titolo); //associazione variabile all'elemento nella view
        spnGenere = (Spinner) findViewById(R.id.spnGenere); //associazione variabile all'elemento nella view
        ArrayAdapter<String> spGen = new ArrayAdapter<String>(this, R.layout.activity_main, elencoGeneri);
        //generazione ArrayAdapter dall'array definito precedentemente per lo spinner
        spnGenere.setAdapter(spGen); //aggiunta ArrayAdapter allo spinner

        gb= new GestoreBrani(); //definizione istanza classe GestoreBrani

        btnInserisci.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        gb.addBrano(txtitolo.getText().toString(),spnGenere.getSelectedItem().toString());
                        //richiamo tramite l'istanza 'gb' della funzione 'addBrano' con passaggio parametri
                        Log.d("funzionamento MainActivity", "funziona metodo btnInserisci.setOnClickListener");
                        //messaggio per sapere se il metodo funziona
                    }
                }
        );

        btnVisualizza.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent i = new Intent(MainActivity.this, GestoreBrani.class);//definizione Intent
                        startActivity(i); //start della seconda activity
                        Log.d("funzionamento", "funziona metodo btnVisualizza.setOnClickListener");
                        //messaggio per sapere se il metodo funziona
                    }
                }
        );
    }
}