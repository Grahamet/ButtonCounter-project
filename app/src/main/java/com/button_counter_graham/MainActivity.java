package com.button_counter_graham;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button inc, dec, clear;
    TextView tV;
    int count;
    int[] colour;
    Random random = new Random();
    View screenView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc = findViewById(R.id.button_inc);
        dec = findViewById(R.id.button_dec);
        clear = findViewById(R.id.button_clear);
        tV = findViewById(R.id.textView);

        colour = new int[] {Color.BLACK, Color.GREEN, Color.GRAY, Color.YELLOW, Color.BLUE, Color.CYAN};
        int aryLength = colour.length;
        screenView = findViewById(R.id.rView);

        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                tV.setText("Count: " + count);
                int rNum = random.nextInt(aryLength);
                screenView.setBackgroundColor(colour[rNum]);
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count --;
                tV.setText("Count: " + count);
                int rNum = random.nextInt(aryLength);
                screenView.setBackgroundColor(colour[rNum]);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                tV.setText("Count: " + count);
                int rNum = random.nextInt(aryLength);
                screenView.setBackgroundColor(colour[rNum]);
            }
        });
    }








}