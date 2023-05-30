package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Integer firsterm = 0;
    Integer secondterm = 0;
    Integer sum = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBtnAddResult(View view){
        try {
            EditText first_term = findViewById(R.id.editText1);
            firsterm = Integer.valueOf(first_term.getText().toString());
            EditText second_term = findViewById(R.id.editText2);
            secondterm = Integer.valueOf(second_term.getText().toString());
            sum=firsterm+secondterm;
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("key", sum);
            intent.putExtra("firstNum", firsterm);
            intent.putExtra("secondNum", secondterm);
            startActivity(intent);
        }
        catch(NumberFormatException e){
            Toast.makeText(this, "Вводите цифры, а не буквы", Toast.LENGTH_LONG).show();
        }
    }
}