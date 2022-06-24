package com.example.gpacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Percentage_Activity extends AppCompatActivity {
    EditText gpa;
    TextView percent;
    Button calc,reset;
    float p,g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);
        gpa = findViewById(R.id.gpa);
        percent = findViewById(R.id.percentage);
        calc = (Button) findViewById(R.id.calc_percent);
        reset = (Button) findViewById(R.id.reset_percent);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g = Float.parseFloat(gpa.getText().toString());
                p = (float) ((g-0.75)*10);
                percent.setText(String.format(Locale.US,"%.2f",p) + "%");
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gpa.setText("");
                percent.setText("");
                p=0;
                g=0;
            }
        });
    }
}