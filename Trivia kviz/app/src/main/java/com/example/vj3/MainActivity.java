package com.example.vj3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    public int numPitanje = -1;
    public ArrayList<ArrayList<String>> pitanja;

    public TextView question;
    public EditText input;
    public Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Dodavanje pitanja
        pitanja = new ArrayList<ArrayList<String>>();
        pitanja.add(new ArrayList<String>(Arrays.asList("Italy", "Rome")));
        pitanja.add(new ArrayList<String>(Arrays.asList("Croatia", "Zagreb")));
        pitanja.add(new ArrayList<String>(Arrays.asList("England", "London")));
        pitanja.add(new ArrayList<String>(Arrays.asList("Spain", "Madrid")));

        //Reference na objekte
        question = findViewById(R.id.Pitanje);
        input = findViewById(R.id.Input);
        next = findViewById(R.id.Next);

        //Prvo pitanje
        newQuestion();
    }

    //Promjena teksta zadatka
    public void newQuestion(){
        numPitanje++;
        try {
            question.setText("Capital of " + pitanja.get(numPitanje).get(0));

            //Zavrsetak kviza
        } catch (IndexOutOfBoundsException e){
            question.setText("Uspješno ste rješili Trivia Kviz!");
        }
    }

    public void NextQuestion(View v){
        try {
            //Provjera odgovora
            if (input.getText().toString().toLowerCase().equals(pitanja.get(numPitanje).get(1).toLowerCase())){
                newQuestion();
            }

            //Izbjegavanje crasha nakon što završi kviz
        } catch (IndexOutOfBoundsException e){
            return;
        }

    }
}