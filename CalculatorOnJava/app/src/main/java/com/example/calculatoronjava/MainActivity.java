package com.example.calculatoronjava;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private TextView an;

    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.num1);
        editText2 = findViewById(R.id.num2);
        an = findViewById(R.id.Answer);
    }

    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.buttonPlus) {
            double a = Double.parseDouble(String.valueOf(editText1.getText()));
            double b = Double.parseDouble(String.valueOf(editText2.getText()));
            double s = a + b;
            an.setText(a + "+" + b + "=" + s);
        } else if (id == R.id.buttonMinus) {
            double a = Double.parseDouble(String.valueOf(editText1.getText()));
            double b = Double.parseDouble(String.valueOf(editText2.getText()));
            double s = a - b;
            an.setText(a + "-" + b + "=" + s);
        } else if (id == R.id.buttonDelen) {
            double a = Double.parseDouble(String.valueOf(editText1.getText()));
            double b = Double.parseDouble(String.valueOf(editText2.getText()));
            if (b != 0) {
                double s = a / b;
                an.setText(a + "/" + b + "=" + s);
            } else {
                an.setText("Er");
            }

        }
        else if (id == R.id.buttonUmn) {
            double a = Double.parseDouble(String.valueOf(editText1.getText()));
            double b = Double.parseDouble(String.valueOf(editText2.getText()));
            double s = a * b;
            an.setText(a + "*" + b + "=" + s);
        }
        else if (id == R.id.buttonClear) {
            editText1.setText("");
            editText2.setText("");
            an.setText("0");
        }
        else if (id == R.id.buttonExit) {
            finish();
        }
    }
}
