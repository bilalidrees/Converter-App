package com.example.minhanh.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class Temperature extends AppCompatActivity {
    Button btnCtoF, btnFtoC;
    TextView tvOutput;
    EditText etInput;
    String input, output;
    double in, out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        CtoF();
        FtoC();
    }

    public void CtoF(){
        btnCtoF = (Button) findViewById(R.id.btnCtoF);
        btnCtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput = (EditText)findViewById(R.id.etInputTemp);
                tvOutput = (TextView) findViewById(R.id.tvOutputTemp);
                input = etInput.getText().toString();
                if(input.equals("") || input.equals(null)){
                    Toast.makeText(getApplicationContext(), "Do not leave blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        in = Double.valueOf(input);
                        out = (in*1.8) + 32;
                        DecimalFormat df = new DecimalFormat("#.##");
                        out = Double.valueOf(df.format(out));
                        tvOutput.setText(in + "°C = " + out + "°F");
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void FtoC(){
        btnFtoC = (Button) findViewById(R.id.btnFtoC);
        btnFtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput = (EditText)findViewById(R.id.etInputTemp);
                tvOutput = (TextView) findViewById(R.id.tvOutputTemp);
                input = etInput.getText().toString();
                if(input.equals("") || input.equals(null)){
                    Toast.makeText(getApplicationContext(), "Do not leave blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        in = Double.valueOf(input);
                        out = (in-32)/1.8;
                        DecimalFormat df = new DecimalFormat("#.##");
                        out = Double.valueOf(df.format(out));
                        tvOutput.setText(in + "°F = " + out + "°C");
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }


}
