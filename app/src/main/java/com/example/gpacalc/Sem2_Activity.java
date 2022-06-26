package com.example.gpacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class Sem2_Activity extends AppCompatActivity {
    EditText m1,m2,m3,m4,m5,m6,m7,m8;
    Button calc,reset;
    String s1,s2,s3,s4,s5,s6,s7,s8;
    float n1,n2,n3,n4,n5,n6,n7,n8,sgpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2);
        m1 = findViewById(R.id.sem2_1);
        m2 = findViewById(R.id.sem2_2);
        m3 = findViewById(R.id.sem2_3);
        m4 = findViewById(R.id.sem2_4);
        m5 = findViewById(R.id.sem2_5);
        m6 = findViewById(R.id.sem2_6);
        m7 = findViewById(R.id.sem2_7);
        m8 = findViewById(R.id.sem2_8);
        calc = findViewById(R.id.calc_sem2);
        reset = findViewById(R.id.reset_sem2);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = m1.getText().toString();
                s2 = m2.getText().toString();
                s3 = m3.getText().toString();
                s4 = m4.getText().toString();
                s5 = m5.getText().toString();
                s6 = m6.getText().toString();
                s7 = m7.getText().toString();
                s8 = m8.getText().toString();
                n1=0;
                n2=0;
                n3=0;
                n4=0;
                n5=0;
                n6=0;
                n7=0;
                n8=0;
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

                if(s6.length()==1)
                    n6 = 1;
                else if(s6.length()==2)
                    if(Float.parseFloat(s6)>=40)
                        n6 = Float.parseFloat(String.valueOf((m6.getText().toString()).charAt(0))) + 1;
                    else
                        n6=0;
                else if(s6.length()==3)
                    n6 = 10;

                if(s7.length()==1)
                    n7 = 1;
                else if(s7.length()==2)
                    if(Float.parseFloat(s7)>=40)
                        n7 = Float.parseFloat(String.valueOf((m7.getText().toString()).charAt(0))) + 1;
                    else
                        n7=0;
                else if(s7.length()==3)
                    n7 = 10;

                if(s8.length()==1)
                    n8=1;
                else if(s8.length()==2)
                    if(Float.parseFloat(s8)>=40)
                        n8 = Float.parseFloat(String.valueOf((m8.getText().toString()).charAt(0))) + 1;
                    else
                        n8=0;
                else if(s8.length()==3)
                    n8 = 10;

                sgpa = (float) ((n1*4 + n2*4 + n3*3 + n4*3 + n5*3 + n6*1 + n7*1 + n8*1)/20.0);
                String result = String.format(Locale.US,"%.2f",sgpa);

                Bundle bundle = new Bundle();
                bundle.putString("name", "SGPA for 2nd SEM");
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
                s6="";
                s7="";
                s8="";
                m1.setText("");
                m2.setText("");
                m3.setText("");
                m4.setText("");
                m5.setText("");
                m6.setText("");
                m7.setText("");
                m8.setText("");
            }
        });
    }
}