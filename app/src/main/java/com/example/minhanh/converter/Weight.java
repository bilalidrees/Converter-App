package com.example.minhanh.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Weight extends AppCompatActivity {
    Button btnKgtoPounds, btnPoundstoKg;
    TextView tvOutput;
    EditText etInput;
    String input;
    double in, out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        KgtoPounds();
        PoundstoKg();
    }
    public void KgtoPounds(){
        btnKgtoPounds = (Button) findViewById(R.id.btnKgtoPounds);
        btnKgtoPounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput = (EditText)findViewById(R.id.etInputWeight);
                tvOutput = (TextView) findViewById(R.id.tvOutputWeight);
                input = etInput.getText().toString();
                if(input.equals("") || input.equals(null)){
                    Toast.makeText(getApplicationContext(), "Do not leave blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        in = Double.valueOf(input);
                        out = in*2.20462262185;
                        DecimalFormat df = new DecimalFormat("#.##");
                        out = Double.valueOf(df.format(out));
                        tvOutput.setText(in + " kg = " + out + " lbs");
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void PoundstoKg(){
        btnPoundstoKg = (Button) findViewById(R.id.btnPoundsToKg);
        btnPoundstoKg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput = (EditText)findViewById(R.id.etInputWeight);
                tvOutput = (TextView) findViewById(R.id.tvOutputWeight);
                input = etInput.getText().toString();
                if(input.equals("") || input.equals(null)){
                    Toast.makeText(getApplicationContext(), "Do not leave blank", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        in = Double.valueOf(input);
                        out = in/2.20462262185;
                        DecimalFormat df = new DecimalFormat("#.##");
                        out = Double.valueOf(df.format(out));
                        tvOutput.setText(in + " lbs = " + out + " kg");
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
