package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSummarize;
    private Button btnSubtract;
    private Button btnMultiply;
    private Button btnDivide;

    private EditText firstNumber;
    private EditText secondNumber;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSummarize = findViewById(R.id.btn_summarize);
        btnSubtract = findViewById(R.id.btn_subtract);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDivide = findViewById(R.id.btn_divide);

        firstNumber = findViewById(R.id.et_num1);
        secondNumber = findViewById(R.id.et_num2);
        result = findViewById(R.id.tv_result);

        Calculator calculator = new Calculator();

        btnSummarize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setNumbers(firstNumber.getText().toString(), secondNumber.getText().toString());
                calculator.summarize();
                result.setText(calculator.getResult());
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setNumbers(firstNumber.getText().toString(), secondNumber.getText().toString());
                calculator.subtract();
                result.setText(calculator.getResult());
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setNumbers(firstNumber.getText().toString(), secondNumber.getText().toString());
                calculator.multiply();
                result.setText(calculator.getResult());
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setNumbers(firstNumber.getText().toString(), secondNumber.getText().toString());
                calculator.divide();
                result.setText(calculator.getResult());
            }
        });
    }
}