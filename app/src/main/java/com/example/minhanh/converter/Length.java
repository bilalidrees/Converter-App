package com.example.minhanh.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Length extends AppCompatActivity {
    Button btnCmtoInch, btnInchtoCm, btnKmtoMile, btnMiletoKm, btnFootToMeter, btnMetertoFoot;
    String input;
    TextView tvOutput;
    EditText etInput;
    double in, out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        CmToInch();
        InchToCm();
        FeetToMeter();
        MeterToFeet();
        KmtoMiles();
        MilesToKm();
    }

    public void CmToInch(){
        btnCmtoInch = (Button) findViewById(R.id.btnCmtoInch);
        btnCmtoInch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput = (EditText)findViewById(R.id.etInputLength);
                tvOutput = (TextView) findViewById(R.id.tvOutputLength);
                input = etInput.getText().toString();
                if(input.equals("") || input.equals(null)){
                    Toast.makeText(getApplicationContext(), "Do not leave blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        in = Double.valueOf(input);
                        out = in*0.393701;
                        DecimalFormat df = new DecimalFormat("###.####");
                        out = Double.valueOf(df.format(out));
                        tvOutput.setText(in + " cm = " + out + " inches");
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void InchToCm(){
        btnInchtoCm = (Button) findViewById(R.id.btnInchtoCm);
        btnInchtoCm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput = (EditText)findViewById(R.id.etInputLength);
                tvOutput = (TextView) findViewById(R.id.tvOutputLength);
                input = etInput.getText().toString();
                if(input.equals("") || input.equals(null)){
                    Toast.makeText(getApplicationContext(), "Do not leave blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        in = Double.valueOf(input);
                        out = in/0.393701;
                        DecimalFormat df = new DecimalFormat("###.####");
                        out = Double.valueOf(df.format(out));
                        tvOutput.setText(in + " inches = " + out + " cm");
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void MeterToFeet(){
        btnMetertoFoot = (Button) findViewById(R.id.btnMetertoFeet);
        btnMetertoFoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput = (EditText)findViewById(R.id.etInputLength);
                tvOutput = (TextView) findViewById(R.id.tvOutputLength);
                input = etInput.getText().toString();
                if(input.equals("") || input.equals(null)){
                    Toast.makeText(getApplicationContext(), "Do not leave blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        in = Double.valueOf(input);
                        out = in*3.28084;
                        DecimalFormat df = new DecimalFormat("###.####");
                        out = Double.valueOf(df.format(out));
                        tvOutput.setText(in + " m = " + out + " ft");
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void FeetToMeter(){
        btnFootToMeter = (Button) findViewById(R.id.btnFeetToMeter);
        btnFootToMeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput = (EditText)findViewById(R.id.etInputLength);
                tvOutput = (TextView) findViewById(R.id.tvOutputLength);
                input = etInput.getText().toString();
                if(input.equals("") || input.equals(null)){
                    Toast.makeText(getApplicationContext(), "Do not leave blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        in = Double.valueOf(input);
                        out = in/3.28084;
                        DecimalFormat df = new DecimalFormat("###.####");
                        out = Double.valueOf(df.format(out));
                        tvOutput.setText(in + " ft = " + out + " m");
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void KmtoMiles(){
        btnKmtoMile = (Button) findViewById(R.id.btnKmtoMiles);
        btnKmtoMile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput = (EditText)findViewById(R.id.etInputLength);
                tvOutput = (TextView) findViewById(R.id.tvOutputLength);
                input = etInput.getText().toString();
                if(input.equals("") || input.equals(null)){
                    Toast.makeText(getApplicationContext(), "Do not leave blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        in = Double.valueOf(input);
                        out = in*0.621371;
                        DecimalFormat df = new DecimalFormat("###.####");
                        out = Double.valueOf(df.format(out));
                        tvOutput.setText(in + " km = " + out + " miles");
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void MilesToKm(){
        btnMiletoKm = (Button) findViewById(R.id.btnMilesToKm);
        btnMiletoKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput = (EditText)findViewById(R.id.etInputLength);
                tvOutput = (TextView) findViewById(R.id.tvOutputLength);
                input = etInput.getText().toString();
                if(input.equals("") || input.equals(null)){
                    Toast.makeText(getApplicationContext(), "Do not leave blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        in = Double.valueOf(input);
                        out = in/0.621371;
                        DecimalFormat df = new DecimalFormat("###.####");
                        out = Double.valueOf(df.format(out));
                        tvOutput.setText(in + " miles = " + out + " km");
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
