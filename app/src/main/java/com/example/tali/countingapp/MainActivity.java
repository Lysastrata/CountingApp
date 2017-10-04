package com.example.tali.countingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNum = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText) findViewById(R.id.secondNumEditText);
                TextView result = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());
                int resultNum = num1 + num2;

                result.setText(resultNum + "");
            }
        });
        Button subButton = (Button) findViewById(R.id.subButton);
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNum = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText) findViewById(R.id.secondNumEditText);
                TextView result = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());
                int resultNum = num1 - num2;

                result.setText(resultNum + "");
            }
        });
        Button multButton = (Button) findViewById(R.id.multButton);
        multButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNum = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText) findViewById(R.id.secondNumEditText);
                TextView result = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());
                int resultNum = num1 * num2;

                result.setText(resultNum + "");
            }
        });
        Button divButton = (Button) findViewById(R.id.divButton);
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNum = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText) findViewById(R.id.secondNumEditText);
                TextView result = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());
                int resultNum = num1 / num2;

                result.setText(resultNum + "");
            }
        });
    }
}
