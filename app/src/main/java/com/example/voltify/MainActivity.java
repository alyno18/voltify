package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button btnInserisci;
    EditText txtitolo;
    GestoreBrani gb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInserisci=findViewById(R.id.btnInserisci);
        txtitolo=findViewById(R.id.plain);
        gb= new GestoreBrani();

        btnInserisci.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        gb.addBrano(txtitolo.getText().toString());
                    }
                }
        );
    }
}