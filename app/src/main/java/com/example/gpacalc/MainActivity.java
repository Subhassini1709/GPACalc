package com.example.gpacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button cgpa,sgpa,gpa,percent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cgpa = findViewById(R.id.to_cgpa);
        sgpa = findViewById(R.id.to_sgpa);
        gpa = findViewById(R.id.to_gpa);
        percent = findViewById(R.id.to_percent);

        cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CGPA_Activity.class);
                startActivity(intent);
            }
        });

        sgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SGPA_Activity.class);
                startActivity(intent);
            }
        });

        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GPA_Activity.class);
                startActivity(intent);
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Percentage_Activity.class);
                startActivity(intent);
            }
        });
    }
}