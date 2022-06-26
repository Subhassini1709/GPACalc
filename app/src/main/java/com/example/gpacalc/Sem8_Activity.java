package com.example.gpacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class Sem8_Activity extends AppCompatActivity {
    EditText m1,m2,m3,m4,m5;
    Button calc,reset;
    String s1,s2,s3,s4,s5;
    float n1,n2,n3,n4,n5,sgpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem8);
        m1 = findViewById(R.id.sem8_1);
        m2 = findViewById(R.id.sem8_2);
        m3 = findViewById(R.id.sem8_3);
        m4 = findViewById(R.id.sem8_4);
        m5 = findViewById(R.id.sem8_5);
        calc = findViewById(R.id.calc_sem8);
        reset = findViewById(R.id.reset_sem8);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = m1.getText().toString();
                s2 = m2.getText().toString();
                s3 = m3.getText().toString();
                s4 = m4.getText().toString();
                s5 = m5.getText().toString();
                n1=0;
                n2=0;
                n3=0;
                n4=0;
                n5=0;
                if(s1.length()==1) //FAIL
                    n1 = 0;
                else if(s1.length()==2) //11-99
                    if(Float.parseFloat(s1)>=40)
                        n1 = Float.parseFloat(String.valueOf((m1.getText().toString()).charAt(0))) + 1;
                    else
                        n1=0;
                else if(s1.length()==3)//100
                    n1 = 10;

                if(s2.length()==1)
                    n2 = 0;
                else if(s2.length()==2)
                    if(Float.parseFloat(s2)>=40)
                        n2 = Float.parseFloat(String.valueOf((m2.getText().toString()).charAt(0))) + 1;
                    else
                        n2=0;
                else if(s2.length()==3)
                    n2 = 10;

                if(s3.length()==1)
                    n3 = 1;
                else if(s3.length()==2)
                    if(Float.parseFloat(s3)>=40)
                        n3 = Float.parseFloat(String.valueOf((m3.getText().toString()).charAt(0))) + 1;
                    else
                        n3=0;
                else if(s3.length()==3)
                    n3 = 10;

                if(s4.length()==1)
                    n4 = 1;
                else if(s4.length()==2)
                    if(Float.parseFloat(s4)>=40)
                        n4 = Float.parseFloat(String.valueOf((m4.getText().toString()).charAt(0))) + 1;
                    else
                        n4=0;
                else if(s4.length()==3)
                    n4 = 10;

                if(s5.length()==1)
                    n5 = 1;
                else if(s5.length()==2)
                    if(Float.parseFloat(s5)>=40)
                        n5 = Float.parseFloat(String.valueOf((m5.getText().toString()).charAt(0))) + 1;
                    else
                        n5=0;
                else if(s5.length()==3)
                    n5 = 10;

                sgpa = (float) ((n1*3 + n2*3 + n3*8 + n4*1 + n5*3)/18.0);
                String result = String.format(Locale.US,"%.2f",sgpa);

                Bundle bundle = new Bundle();
                bundle.putString("name", "SGPA for 8th SEM");
                bundle.putString("result", result);
                Intent intent = new Intent(getApplicationContext(), SGPA_Result_Activity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1="";
                s2="";
                s3="";
                s4="";
                s5="";
                m1.setText("");
                m2.setText("");
                m3.setText("");
                m4.setText("");
                m5.setText("");
            }
        });
    }
}