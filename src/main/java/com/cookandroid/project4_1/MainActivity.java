package com.cookandroid.project4_1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // 멤버 변수
    EditText Edit1, Edit2;
    Button BtnAdd, BtnSub, BtnMul, BtnDiv, BtnMod;
    TextView TextResult;
    String num1, num2;
    Float result1; // double 써도 됨
    double result2;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("개선된 계산기");

        // 지역 변수
        Edit1 = findViewById(R.id.Edit1);
        Edit2 = findViewById(R.id.Edit2);
        BtnAdd = findViewById(R.id.BtnAdd);
        BtnSub = findViewById(R.id.BtnSub);
        BtnMul = findViewById(R.id.BtnMul);
        BtnDiv = findViewById(R.id.BtnDiv);
        BtnMod = findViewById(R.id.BtnMod);
        TextResult = findViewById(R.id.TextResult);

        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    num1 = Edit1.getText().toString();
                    num2 = Edit2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this, "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                    TextResult.setText("계산 결과: ");
                } else {
                    result1 = Float.parseFloat(num1) + Float.parseFloat(num2);
                    TextResult.setText("계산 결과: " + result1);

                }
            }
        });

        BtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this, "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                    TextResult.setText("계산 결과: ");
                } else {
                    result1 = Float.parseFloat(num1) - Float.parseFloat(num2);
                    TextResult.setText("계산 결과: " + result1);
                }
            }
        });

        BtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this, "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                    TextResult.setText("계산 결과: ");
                } else {
                    result1 = Float.parseFloat(num1) * Float.parseFloat(num2);
                    TextResult.setText("계산 결과: " + result1);
                }
            }
        });

        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                    num1 = Edit1.getText().toString();
                    num2 = Edit2.getText().toString();
                    if (num1.equals("") || num2.equals("")) {
                        Toast.makeText(MainActivity.this, "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                        TextResult.setText("계산 결과: ");
                    } else if (num1.equals("0") || num2.equals("0")) {
                            Toast.makeText(MainActivity.this, "계산 오류", Toast.LENGTH_SHORT).show();
                            TextResult.setText("계산 결과: ");
                    } else {
                        result1 = Float.parseFloat(num1) / Float.parseFloat(num2);
                        result2 = (int)(result1*100)/100.0; // 소수점 둘째자리 밑으로 버림
                        TextResult.setText("계산 결과: " + result2);
                    }
                }
        });

        BtnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this, "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                    TextResult.setText("계산 결과: ");
                } else if (num1.equals("0") || num2.equals("0")) {
                        Toast.makeText(MainActivity.this, "계산 오류", Toast.LENGTH_SHORT).show();
                        TextResult.setText("계산 결과: ");
                } else {
                    result1 = Float.parseFloat(num1) % Float.parseFloat(num2);
                    TextResult.setText("계산 결과: " + result1);
                }
            }
        });
    }
}
