package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    Button btnInserisci;
    EditText txtitolo;
    GestoreBrani gb;
    Spinner spnGenere;
    String[] elencoGeneri = {"Rock", "Liscio", "POP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInserisci=findViewById(R.id.btnInserisci);
        txtitolo=findViewById(R.id.plain);
        spnGenere = (Spinner) findViewById(R.id.spnGenere);
        ArrayAdapter<String> spGen = new ArrayAdapter<String>(this, R.layout.activity_main, elencoGeneri);
        spnGenere.setAdapter(spGen);

        gb= new GestoreBrani();

        btnInserisci.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        String testo = spnGenere.getSelectedItem().toString();
                        Toast.makeText(getApplicationContext(), testo, Toast.LENGHT_LONG).show();
                        gb.addBrano(txtitolo.getText().toString());
                    }
                }
        );
    }
}