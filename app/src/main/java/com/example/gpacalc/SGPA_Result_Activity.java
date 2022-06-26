package com.example.gpacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class SGPA_Result_Activity extends AppCompatActivity {
    TextView header,res,txt;
    float sgpa;
    String name,result,msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpa_result);
        header = findViewById(R.id.result_header);
        res = findViewById(R.id.result);
        txt = findViewById(R.id.msg);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            name = bundle.getString("name");
            result = bundle.getString("result");
            header.setText(name);
            res.setText(result);
        }
        sgpa = Float.parseFloat(result);
        if(sgpa>9)
            msg = "9+";
        else if(sgpa>7.5)
            msg = "7.5+";
        else if(sgpa>5)
            msg = "5+";
        else
            msg = "5-";
        txt.setText(msg);
    }
}