package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //EditText pantalla;
    public double operando1, operando2, res;
    int op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);

        //pantalla = (EditText) findViewById(R.id.pantalla);
    }

    Button button0 = findViewById(R.id.num0);
    Button button1 = findViewById(R.id.num1);
    Button button2 = findViewById(R.id.num2);
    Button button3 = findViewById(R.id.num3);
    Button button4 = findViewById(R.id.num4);
    Button button5 = findViewById(R.id.num5);
    Button button6 = findViewById(R.id.num6);
    Button button7 = findViewById(R.id.num7);
    Button button8 = findViewById(R.id.num8);
    Button button9 = findViewById(R.id.num9);

}
