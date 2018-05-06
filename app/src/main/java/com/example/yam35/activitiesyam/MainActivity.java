package com.example.yam35.activitiesyam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText display;
    double op1=0, op2=0;
    char a = '+';


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);
    }




    public void AddClick(View view) {
        if (display.getText().toString().equals(""))
            op1 = 0;
        else {
            op1 = Double.parseDouble(display.getText().toString());
            display.setText("");
            switch (a) {
                case '+':
                    op2 = op1 + op2;
                    break;
                case '-':
                    op2 = op2 - op1;
                    break;
                case '*':
                    op2 = op2 * op1;
                    break;
                case '/':
                    if (op1 == 0) Toast.makeText(this, "divide by zero", Toast.LENGTH_SHORT);
                    else op2 = op2 / op1;
                    break;


            }
            display.setHint(Double.toString(op2));
            a = '+';
        }
    }

    public void subClick(View view) {
        if (display.getText().toString().equals(""))
            op1=0;
        else
            op1=Double.parseDouble(display.getText().toString());
        display.setText("");
        switch (a)
        {
            case '+': op2=op1+op2; break;
            case '-': op2=op2-op1; break;
            case '*': op2=op2*op1;break;
            case '/':
                if (op1 == 0) Toast.makeText(this, "divide by zero", Toast.LENGTH_SHORT);
                else op2=op2/op1; break;


        }
        display.setHint(Double.toString(op2));
        a = '-';

    }

    public void mulClick(View view) {
        if (display.getText().toString().equals(""))
            op1=0;
        else
            op1=Double.parseDouble(display.getText().toString());
        display.setText("");
        switch (a)
        {
            case '+': op2=op1+op2; break;
            case '-': op2=op2-op1; break;
            case '*': op2=op2*op1;break;
            case '/':
                if (op1 == 0) Toast.makeText(this, "divide by zero", Toast.LENGTH_SHORT);
                else op2=op2/op1; break;


        }
        display.setHint(Double.toString(op2));
        a = '*';
    }

    public void divClick(View view) {
        if (display.getText().toString().equals(""))
            op1=0;
        else
            op1=Double.parseDouble(display.getText().toString());
        display.setText("");
        switch (a)
        {
            case '+': op2=op1+op2; break;
            case '-': op2=op2-op1; break;
            case '*': op2=op2*op1;break;
            case '/':
                if (op1 == 0) Toast.makeText(this, "divide by zero", Toast.LENGTH_SHORT);
                else op2=op2/op1; break;


        }
        display.setHint(Double.toString(op2));
        a = '/';
    }

    public void acClick(View view) {
        op1=0;
        op2=0;
        display.setHint("");
        display.setText("");
    }

    public void equalClick(View view) {
        if (display.getText().toString().equals(""))
            op1=0;
        else
            op1=Double.parseDouble(display.getText().toString());
        display.setText("");
        switch (a)
        {
            case '+': op2=op1+op2; break;
            case '-': op2=op2-op1; break;
            case '*': op2=op2*op1;break;
            case '/':
                if (op1 == 0) Toast.makeText(this, "divide by zero", Toast.LENGTH_SHORT);
                else op2=op2/op1; break;


        }
        display.setHint(Double.toString(op2));
        a = 0;

    }

    public void creditsClick(View view) {
            Intent t = new Intent(this, Credits.class);
                String st = Double.toString(op2);
                t.putExtra("result", st);
                startActivity(t); {
            }



    }
}



