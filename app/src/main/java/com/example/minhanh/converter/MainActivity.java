package com.example.minhanh.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTemp, btnWeight, btnLength, btnCurrency;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToTemp();
        goToCurrency();
        goToLength();
        goToWeight();
    }

    public void goToTemp(){
        btnTemp = (Button) findViewById(R.id.btnTemperature);
        btnTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Temperature.class));
            }
        });
    }
    public void goToLength(){
        btnLength = (Button) findViewById(R.id.btnLength);
        btnLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Length.class));
            }
        });
    }
    public void goToCurrency(){
        btnCurrency = (Button) findViewById(R.id.btnCurrency);
        btnCurrency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Currency.class));
            }
        });
    }
    public void goToWeight(){
        btnWeight = (Button) findViewById(R.id.btnWeight);
        btnWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Weight.class));
            }
        });
    }
}
