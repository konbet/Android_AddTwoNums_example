package com.example.android_addtwonums_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edTxt_num1 = findViewById(R.id.edTxt_num1);
        final EditText edTxt_num2 = findViewById(R.id.edTxt_num2);
        final EditText edTxt_result = findViewById(R.id.edTxt_result);

        Button btn_add = findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = edTxt_num1.getText().toString();
                String strNum2 = edTxt_num2.getText().toString();

                double num1 = Double.valueOf(strNum1);
                double num2 = Double.valueOf(strNum2);

                double sum = num1 + num2;
                String strSum = String.valueOf(sum);

                edTxt_result.setText(strSum);
            }
        });

        Button btn_min = findViewById(R.id.btn_min);
        btn_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = edTxt_num1.getText().toString();
                String strNum2 = edTxt_num2.getText().toString();

                double num1 = Double.valueOf(strNum1);
                double num2 = Double.valueOf(strNum2);

                double sum = num1 - num2;
                String strSum = String.valueOf(sum);

                edTxt_result.setText(strSum);
            }
        });

        Button btn_mul = findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = edTxt_num1.getText().toString();
                String strNum2 = edTxt_num2.getText().toString();

                double num1 = Double.valueOf(strNum1);
                double num2 = Double.valueOf(strNum2);

                double sum = num1 * num2;
                String strSum = String.valueOf(sum);

                edTxt_result.setText(strSum);
            }
        });

        Button btn_div = findViewById(R.id.btn_div);
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = edTxt_num1.getText().toString();
                String strNum2 = edTxt_num2.getText().toString();

                double num1 = Double.valueOf(strNum1);
                double num2 = Double.valueOf(strNum2);

                double sum = num1 / num2;
                String strSum = String.valueOf(sum);

                edTxt_result.setText(strSum);
            }
        });

        Button btn_clr = findViewById(R.id.btn_clr);
        btn_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edTxt_num1.setText("");
                edTxt_num2.setText("");
                edTxt_result.setText("");
            }
        });

    }
}
