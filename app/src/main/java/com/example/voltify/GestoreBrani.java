package com.example.voltify;

import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Brano> ListaBrani;

    public GestoreBrani(){
        ListaBrani = new  ArrayList<Brano>();
    }

    public void addBrano(String titolo){
        Brano br = new Brano(titolo);
        ListaBrani.add(br);
    }
}
