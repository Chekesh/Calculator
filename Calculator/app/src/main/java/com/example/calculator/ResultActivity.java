package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle bundle = getIntent().getExtras();
        Integer sum = bundle.getInt("key");
        Integer first = bundle.getInt("firstNum");
        Integer second = bundle.getInt("secondNum");
        if (first < 0 && second<0){
            ((TextView)findViewById(R.id.textView_3)).setText("("+first.toString()+")"+"+"+"(" +second.toString()+")"+"="+ sum.toString());
        }
        else if (first < 0){
            ((TextView)findViewById(R.id.textView_3)).setText("("+first.toString()+")"+"+"+second.toString()+"="+ sum.toString());
        }
        else if (second < 0){
            ((TextView)findViewById(R.id.textView_3)).setText(first.toString()+""+"("+second.toString()+")"+"="+ sum.toString());
        }
        else {
            ((TextView) findViewById(R.id.textView_3)).setText(first.toString() + "+" + second.toString() + "=" + sum.toString());
        }
    }
}