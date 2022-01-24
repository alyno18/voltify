package com.example.voltify;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GestoreBrani extends AppCompatActivity {
    TextView brani; //definizione variabile TextView
    ArrayList<Brano> ListaBrani; //definizione ArrayList

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestore_brani);
        brani=findViewById(R.id.brani); //associazione variabile all'elemento nella view

    }

    public GestoreBrani(){
        ListaBrani = new  ArrayList<Brano>();
    }

    public void addBrano(String titolo, String genere){
        Brano br = new Brano(titolo, genere); //definizione istanza classe Brano con passaggio variabili
        ListaBrani.add(br); //aggiunta dell'istanza br all'ArrayList ListaBrani
        Log.d("funzionamento GestoriBrani", "funziona metodo addBrano");
        //messaggio per sapere se il metodo funziona
    }

    public String listaSong(){
        StringBuilder sbSong = new StringBuilder(); //definizione StringBuilder
        for (Brano brc : ListaBrani){
            sbSong.append("-"+ brc.getTitolo() +"\n" +"-"+ brc.getGenere() +"\n");
            //aggiunta del titolo e del genere tramite i getter nella classe brano nell'ArrayList
        }
        return sbSong.toString(); //stampa dell'ArrayList
    }
}
