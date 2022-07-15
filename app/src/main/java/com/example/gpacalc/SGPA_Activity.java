package com.example.gpacalc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SGPA_Activity extends AppCompatActivity {
    Button sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpa);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        sem1 = findViewById(R.id.to_sem1);
        sem2 = findViewById(R.id.to_sem2);
        sem3 = findViewById(R.id.to_sem3);
        sem4 = findViewById(R.id.to_sem4);
        sem5 = findViewById(R.id.to_sem5);
        sem6 = findViewById(R.id.to_sem6);
        sem7 = findViewById(R.id.to_sem7);
        sem8 = findViewById(R.id.to_sem8);

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SGPA_Activity.this, Sem1_activity.class);
                startActivity(intent);
            }
        });

        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SGPA_Activity.this, Sem2_Activity.class);
                startActivity(intent);
            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SGPA_Activity.this, Sem3_activity.class);
                startActivity(intent);
            }
        });

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SGPA_Activity.this, Sem4_activity.class);
                startActivity(intent);
            }
        });

        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SGPA_Activity.this, Sem5_Activity.class);
                startActivity(intent);
            }
        });

        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SGPA_Activity.this, Sem6_Activity.class);
                startActivity(intent);
            }
        });

        sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SGPA_Activity.this, Sem7_Activity.class);
                startActivity(intent);
            }
        });

        sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SGPA_Activity.this, Sem8_Activity.class);
                startActivity(intent);
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