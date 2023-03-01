package com.example.konvertervaluta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    EditText strana = findViewById(R.id.stranaText);
    EditText domaca = findViewById(R.id.domacaText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Eur(View v){
        float valueStrana = Float.parseFloat(strana.toString());

        valueStrana *= 7.533;

        domaca.setText(String.valueOf(valueStrana));
    }

    public void Canadian(View v){
        float valueStrana = Float.parseFloat(strana.toString());

        valueStrana *= 5.190;

        domaca.setText(String.valueOf(valueStrana));
    }

    public void Dollar(View v){
        float valueStrana = Float.parseFloat(strana.toString());

        valueStrana *= 7.059;

        domaca.setText(String.valueOf(valueStrana));
    }
}