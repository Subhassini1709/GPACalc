package com.example.gpacalc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.MenuItem;
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
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        gpa = findViewById(R.id.gpa);
        percent = findViewById(R.id.percentage);
        calc = (Button) findViewById(R.id.calc_percent);
        reset = (Button) findViewById(R.id.reset_percent);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p=0;
                g=0;
                if (!gpa.getText().toString().equals(""))
                    g = Float.parseFloat(gpa.getText().toString());
                    if(g>=0.75)
                        p = (float) ((g-0.75)*10);
                percent.setText(String.format(Locale.US,"%.2f",p) + "%");
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gpa.setText("");
                percent.setText("");
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}