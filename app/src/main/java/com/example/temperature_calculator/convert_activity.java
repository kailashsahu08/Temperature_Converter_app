package com.example.temperature_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class convert_activity extends AppCompatActivity {
    EditText temp;
    TextView tdes1,tdes2,res1,res2,about;

    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);
        about = findViewById(R.id.aboutConverter);
        temp = findViewById(R.id.insert_value);
        tdes1 = findViewById(R.id.resultdes1);
        tdes2 = findViewById(R.id.resultdes2);
        res1 =  findViewById(R.id.result1);
        res2 = findViewById(R.id.result2);
        convert = findViewById(R.id.convert);
        Intent get = getIntent();
        int getp = get.getIntExtra("temp",0);
        if(getp==1)
        {
            about.setText("Enter the temperature in celsius Here: ");
        }
        else if(getp==2)
        {
            about.setText("Enter the temperature in Fahrenheit Here: ");
        } else if (getp==3) {
            about.setText("Enter the temperature in Kelvin Here: ");
        }


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getp == 1)
                {
                    float a= Float.parseFloat(temp.getText().toString());
                    float frn8 = (float) ((a * 1.8) +32);
                    float kelvin = (float) (a+273.15);
                    tdes1.setText("The temperature in Fahrenheit is :");
                    tdes2.setText("the temperature in Kelvin is : ");
                    res1.setText(frn8+"");
                    res2.setText(kelvin+"");
                }
                else if(getp==2)
                {
                    float a= Float.parseFloat(temp.getText().toString());
                    float celsius = (float) ((a-32)*5/9);
                    float kelvin = (float) (((a-32)*5/9)+273.15);
                    tdes1.setText("The temperature in celsius is :");
                    tdes2.setText("the temperature in Kelvin is : ");
                    res1.setText(celsius+"");
                    res2.setText(kelvin+"");

                }
                else if(getp==3)
                {
                    float a= Float.parseFloat(temp.getText().toString());
                    float celsius = (float) (a-273.15);
                    float frn8 = (float) ((a-273.15)*1.8 + 32);
                    tdes1.setText("The temperature in celsius is :");
                    tdes2.setText("the temperature in Fahrenheit is : ");
                    res1.setText(celsius+"");
                    res2.setText(frn8+"");
                }
            }
        });
    }
}