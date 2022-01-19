package com.example.voltify;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GestoreBrani extends AppCompatActivity {
    ListView listaBrani;
    ArrayList<Brano> ListaBrani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestore_brani);
        listaBrani=findViewById(R.id.listaBrani);
    }

    public GestoreBrani(){
        ListaBrani = new  ArrayList<Brano>();
    }

    public void addBrano(String titolo){
        Brano br = new Brano(titolo);
        ListaBrani.add(br);
    }

    public void visualizza(){
        listaBrani.setAdapter((ListAdapter) ListaBrani);
    }
}
