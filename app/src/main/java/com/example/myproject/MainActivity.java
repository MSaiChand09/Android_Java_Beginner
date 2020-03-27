package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView answer;
    EditText Num1, Num2;
    Button ADD, SUB, MUL, DIV, Calculator, Tocheck;
    LinearLayout x;
    LinearLayout y;
    Integer a, b, c, z;


    EditText edittext3;
    Button Prime, Polyndrome, Armstrong;
    TextView result1;

    boolean isPalindrome;
    boolean isArmstrong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = (EditText) findViewById(R.id.Num1);
        Num2 = (EditText) findViewById(R.id.Num2);

        x = findViewById(R.id.layout1);
        x.setVisibility(View.INVISIBLE);
        y = findViewById(R.id.layout3);
        y.setVisibility(View.INVISIBLE);

        ADD = findViewById(R.id.ADD);
        answer = findViewById(R.id.result1);
        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(Num1.getText().toString());
                b = Integer.parseInt(Num2.getText().toString());
                System.out.println("value of a: " + a);
                System.out.println("value of b: " + b);
                c = a + b;
                System.out.println("sum is : " + c);
                answer.setText(c.toString());
                Toast.makeText(getApplicationContext(), "sum is :" + c, Toast.LENGTH_LONG).show();
            }
        });

        SUB = findViewById(R.id.SUB);
        SUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(Num1.getText().toString());
                b = Integer.parseInt(Num2.getText().toString());
                System.out.println("value of a: " + a);
                System.out.println("value of b: " + b);
                c = a - b;
                System.out.println("sum is : " + c);
                answer.setText(c.toString());
                Toast.makeText(getApplicationContext(), "sub is :" + c, Toast.LENGTH_LONG).show();
            }
        });
        MUL = findViewById(R.id.MUL);
        MUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(Num1.getText().toString());
                b = Integer.parseInt(Num2.getText().toString());
                System.out.println("value of a: " + a);
                System.out.println("value of b: " + b);
                c = a * b;
                System.out.println("sum is : " + c);
                answer.setText(c.toString());
                Toast.makeText(getApplicationContext(), "mul is :" + c, Toast.LENGTH_LONG).show();
            }
        });
        DIV = findViewById(R.id.DIV);
        DIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(Num1.getText().toString());
                b = Integer.parseInt(Num2.getText().toString());
                System.out.println("value of a: " + a);
                System.out.println("value of b: " + b);
                c = a / b;
                System.out.println("sum is : " + c);
                answer.setText(c.toString());
                Toast.makeText(getApplicationContext(), "div is :" + c, Toast.LENGTH_LONG).show();
            }
        });
        Calculator = findViewById(R.id.Calculator);
        Calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                y.setVisibility(View.INVISIBLE);
                x.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(), "This is calculator", Toast.LENGTH_SHORT).show();
            }
        });
        Tocheck = findViewById(R.id.Tocheck_btn);
        y = findViewById(R.id.layout3);
        Tocheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x.setVisibility(View.INVISIBLE);
                y.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(), "To check the number", Toast.LENGTH_SHORT).show();
            }
        });

        Prime = findViewById(R.id.Prime_btn);
        Prime.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                y.setVisibility(View.VISIBLE);

                edittext3 = (EditText) findViewById(R.id.edittext3);

                double n = Double.parseDouble(edittext3.getText().toString());
                int f = 0;


                for (int i = 2; i < n; i++) {
                    if (n % i == 0)
                        f = 1;
                }

                if (f == 0) {
                    Toast.makeText(getApplicationContext(),
                            "Given Number is Prime Number",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Given Number is Not a Prime Number",
                            Toast.LENGTH_SHORT).show();

                }
            }
        });
        Polyndrome = findViewById(R.id.Polyndrome_btn);
        Polyndrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y.setVisibility(View.VISIBLE);
                edittext3 = (EditText) findViewById(R.id.edittext3);

                Log.i("Palindrome", "The Palindrome button was clicked");
                String s = String.valueOf(edittext3.getText());
                if (!s.isEmpty()) {
                    isPalindrome = s.equals(new StringBuilder(s).reverse().toString());
                    if (isPalindrome == true) {

                        Toast.makeText(getApplicationContext(), "is polyndrome :", Toast.LENGTH_LONG).show();

                    } else {
                        Toast.makeText(getApplicationContext(), "is not polyndrome :", Toast.LENGTH_LONG).show();


                    }
                }

            }
        });

        Armstrong = findViewById(R.id.Armstrong_btn);
        Armstrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y.setVisibility(View.VISIBLE);
                edittext3 = (EditText) findViewById(R.id.edittext3);
                Log.i("Palindrome", "The Armstrong button was clicked");
                String s = String.valueOf(edittext3.getText());
                if (!s.isEmpty()) {
                    isArmstrong = s.equals(new StringBuilder(s).reverse().toString());

                    if (isArmstrong ==false) {

                        Toast.makeText(getApplicationContext(), "is Armstrong :", Toast.LENGTH_LONG).show();

                    } else {
                        Toast.makeText(getApplicationContext(), "is not Armstrong :", Toast.LENGTH_LONG).show();


                    }
                }
            }


        });
    }
}