package com.example.gpacalc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.util.Locale;

public class CGPA_Activity extends AppCompatActivity {
    EditText sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    Button calc,reset;
    String s1,s2,s3,s4,s5,s6,s7,s8;
    float r1,r2,r3,r4,r5,r6,r7,r8,cgpa;
    int c1,c2,c3,c4,c5,c6,c7,c8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        sem1 = findViewById(R.id.sem1);
        sem2 = findViewById(R.id.sem2);
        sem3 = findViewById(R.id.sem3);
        sem4 = findViewById(R.id.sem4);
        sem5 = findViewById(R.id.sem5);
        sem6 = findViewById(R.id.sem6);
        sem7 = findViewById(R.id.sem7);
        sem8 = findViewById(R.id.sem8);
        calc = findViewById(R.id.calc_cgpa);
        reset = findViewById(R.id.reset_cgpa);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = sem1.getText().toString();
                s2 = sem2.getText().toString();
                s3 = sem3.getText().toString();
                s4 = sem4.getText().toString();
                s5 = sem5.getText().toString();
                s6 = sem6.getText().toString();
                s7 = sem7.getText().toString();
                s8 = sem8.getText().toString();
                r1=0;
                r2=0;
                r3=0;
                r4=0;
                r5=0;
                r6=0;
                r7=0;
                r8=0;
                c1=0;
                c2=0;
                c3=0;
                c4=0;
                c5=0;
                c6=0;
                c7=0;
                c8=0;
                if (!s1.equals("") && !s1.equals("0")) {
                    r1 = Float.parseFloat(s1);
                    c1=20;
                }
                if (!s2.equals("") && !s1.equals("0")) {
                    r2 = Float.parseFloat(s2);
                    c2=20;
                }
                if (!s3.equals("") && !s1.equals("0")) {
                    r3 = Float.parseFloat(s3);
                    c3=24;
                }
                if (!s4.equals("") && !s1.equals("0")) {
                    r4 = Float.parseFloat(s4);
                    c4=24;
                }
                if (!s5.equals("") && !s1.equals("0")) {
                    r5 = Float.parseFloat(s5);
                    c5=25;
                }
                if (!s6.equals("") && !s1.equals("0")) {
                    r6 = Float.parseFloat(s6);
                    c6=24;
                }
                if (!s7.equals("") && !s1.equals("0")) {
                    r7 = Float.parseFloat(s7);
                    c7=20;
                }
                if (!s8.equals("") && !s1.equals("0")) {
                    r8 = Float.parseFloat(s8);
                    c8=18;
                }
                int s = c1+c2+c3+c4+c5+c6+c7+c8;
                cgpa = (float) ((r1*c1+r2*c2+r3*c3+r4*c4+r5*c5+r6*c6+r7*c7+r8*c8)/s);
                String result = String.format(Locale.US,"%.2f",cgpa);

                Bundle bundle = new Bundle();
                bundle.putString("name", "CGPA");
                bundle.putString("result", result);
                Intent intent = new Intent(getApplicationContext(), SGPA_Result_Activity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sem1.setText("");
                sem2.setText("");
                sem3.setText("");
                sem4.setText("");
                sem5.setText("");
                sem6.setText("");
                sem7.setText("");
                sem8.setText("");
                s1="";
                s2="";
                s3="";
                s4="";
                s5="";
                s6="";
                s7="";
                s8="";
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