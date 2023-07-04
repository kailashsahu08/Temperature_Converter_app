package com.example.temperature_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.CtoK);
        c2 = findViewById(R.id.FtoK);
        c3 = findViewById(R.id.KtoC);
        Intent toConvert = new Intent(MainActivity.this,convert_activity.class);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toConvert.putExtra("temp",1);
                startActivity(toConvert);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toConvert.putExtra("temp",2);
                startActivity(toConvert);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toConvert.putExtra("temp",3);
                startActivity(toConvert);
            }
        });
    }
}