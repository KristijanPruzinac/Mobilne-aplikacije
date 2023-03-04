package com.example.bmipruki;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickIzracunaj(View v){
        //Objekti
        EditText Tezina = findViewById(R.id.Tezina);
        EditText Visina = findViewById(R.id.Visina);

        float tezina = Float.valueOf(Tezina.getText().toString());
        float visina = Float.valueOf(Visina.getText().toString());

        //Prikaz textView objekata
        findViewById(R.id.VasBmi).setVisibility(View.VISIBLE);
        TextView Vrijednost = findViewById(R.id.VrijednostBMI); Vrijednost.setVisibility(View.VISIBLE);
        TextView Stanje = findViewById(R.id.StanjeBMI); Stanje.setVisibility(View.VISIBLE);

        ImageView Sretan = findViewById(R.id.happy);
        ImageView Tuzan = findViewById(R.id.sad);

        double BMI = tezina / (Math.pow(visina, 2)) * 10000;

        //Ispis
        Vrijednost.setText(String.valueOf(BMI));

        //Stanje
        if (BMI < 18.5) { //Pothranjenost
            Stanje.setText("Pothranjeni ste!");
            Sretan.setVisibility(View.INVISIBLE);
            Tuzan.setVisibility(View.VISIBLE);
        }
        else if (BMI < 25) { //Normalna tezina
            Stanje.setText("Imate normalnu težinu");
            Sretan.setVisibility(View.VISIBLE);
            Tuzan.setVisibility(View.INVISIBLE);
        }
        else { //Pretilost
            Stanje.setText("Pretili ste!");
            Sretan.setVisibility(View.INVISIBLE);
            Tuzan.setVisibility(View.VISIBLE);
        }
    }
}