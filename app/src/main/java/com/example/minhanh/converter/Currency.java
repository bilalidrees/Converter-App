package com.example.minhanh.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Currency extends AppCompatActivity {
    Button btnCADtoVND, btnVNDtoCAD, btnVNDtoUSD, btnUSDtoVND;
    TextView tvOutput;
    EditText etInput;
    String input;
    double in, out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        CADtoVND();
        VNDtoCAD();
        USDtoVND();
        VNDtoUSD();
    }

    public void CADtoVND(){
        btnCADtoVND = (Button) findViewById(R.id.btnCADtoVND);
        btnCADtoVND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput = (EditText)findViewById(R.id.etInputCurrency);
                tvOutput = (TextView) findViewById(R.id.tvOutputCurrency);
                input = etInput.getText().toString();
                if(input.equals("") || input.equals(null)){
                    Toast.makeText(getApplicationContext(), "Do not leave blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        in = Double.valueOf(input);
                        out = in*18244.83;
                        DecimalFormat df = new DecimalFormat("###.####");
                        out = Double.valueOf(df.format(out));
                        tvOutput.setText(in + " CAD = " + out + " VND");
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void VNDtoCAD(){
        btnVNDtoCAD = (Button) findViewById(R.id.btnVNDtoCAD);
        btnVNDtoCAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput = (EditText)findViewById(R.id.etInputCurrency);
                tvOutput = (TextView) findViewById(R.id.tvOutputCurrency);
                input = etInput.getText().toString();
                if(input.equals("") || input.equals(null)){
                    Toast.makeText(getApplicationContext(), "Do not leave blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        in = Double.valueOf(input);
                        out = in/18244.83;
                        DecimalFormat df = new DecimalFormat("###.####");
                        out = Double.valueOf(df.format(out));
                        tvOutput.setText(in + " VND = " + out + " CAD");
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void USDtoVND(){
        btnUSDtoVND = (Button) findViewById(R.id.btnUSDtoVND);
        btnUSDtoVND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput = (EditText)findViewById(R.id.etInputCurrency);
                tvOutput = (TextView) findViewById(R.id.tvOutputCurrency);
                input = etInput.getText().toString();
                if(input.equals("") || input.equals(null)){
                    Toast.makeText(getApplicationContext(), "Do not leave blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        in = Double.valueOf(input);
                        out = in*22726.50;
                        DecimalFormat df = new DecimalFormat("###.####");
                        out = Double.valueOf(df.format(out));
                        tvOutput.setText(in + " USD = " + out + " VND");
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void VNDtoUSD(){
        btnVNDtoUSD = (Button) findViewById(R.id.btnVNDtoUSD);
        btnVNDtoUSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput = (EditText)findViewById(R.id.etInputCurrency);
                tvOutput = (TextView) findViewById(R.id.tvOutputCurrency);
                input = etInput.getText().toString();
                if(input.equals("") || input.equals(null)){
                    Toast.makeText(getApplicationContext(), "Do not leave blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        in = Double.valueOf(input);
                        out = in/22726.50;
                        DecimalFormat df = new DecimalFormat("###.####");
                        out = Double.valueOf(df.format(out));
                        tvOutput.setText(in + " VND = " + out + " USD");
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
