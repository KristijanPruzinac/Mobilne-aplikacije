package hr.elpros.kockicapruzinac;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public View root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        root = findViewById(android.R.id.content).getRootView();
    }

    public void BaciKocku(View v){
        final int min = 1;
        final int max = 6;

        final int rand1 = new Random().nextInt((max - min) + 1) + min;
        final int rand2 = new Random().nextInt((max - min) + 1) + min;

        TextView Kocka1 = findViewById(R.id.Kocka1); Kocka1.setText(String.valueOf(rand1));
        TextView Kocka2 = findViewById(R.id.Kocka2); Kocka2.setText(String.valueOf(rand2));

        final int rand3 = new Random().nextInt((max - min) + 1) + min;
        switch (rand3){
            case 1:
                root.setBackgroundColor(Color.argb(255, 200, 255, 255));
                break;
            case 2:
                root.setBackgroundColor(Color.argb(255, 255, 200, 255));
                break;
            case 3:
                root.setBackgroundColor(Color.argb(255, 255, 255, 200));
                break;
            case 4:
                root.setBackgroundColor(Color.argb(255, 200, 220, 255));
                break;
            case 5:
                root.setBackgroundColor(Color.argb(255, 255, 220, 220));
                break;
            case 6:
                root.setBackgroundColor(Color.argb(255, 220, 255, 220));
                break;
        }
    }
}