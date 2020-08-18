package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText no1, no2;
    private String num1, num2, stringAns;
    private int input1, input2, answer;
    private TextView ans;
    private Button addBtn, subBtn, divBtn, multyBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        no1 = findViewById(R.id.number1);
        no2= findViewById(R.id.number2);
        ans = findViewById(R.id.result);


        addBtn = findViewById(R.id.add);
        subBtn = findViewById(R.id.subract);
        multyBtn = findViewById(R.id.multiply);
        divBtn = findViewById(R.id.divide);

        Intent intent = getIntent();
        num1 = intent.getStringExtra(FirstActivity.number1);
        num2 = intent.getStringExtra(FirstActivity.number2);


        input1 = Integer.parseInt(num1);
        input2 = Integer.parseInt(num2);

        no1.setText(num1);
        no2.setText(num2);
    }

    @Override
    protected void onResume() {
        super.onResume();

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = input1 + input2;
                ans.setText(input1 + " + " + input2 + " = " + answer);

            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = input1 - input2;
                ans.setText(input1 + " - " + input2 + " = " + answer);

            }
        });

        multyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = input1  * input2;
                ans.setText(input1 + " * " + input2 + " = " + answer);

            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = input1 / input2;
                ans.setText(input1 + " / " + input2 + " = " + answer);

            }
        });
    }
}