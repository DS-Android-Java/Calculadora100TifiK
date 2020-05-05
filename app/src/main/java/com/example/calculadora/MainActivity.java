package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText pantalla;
    public double operando1, operando2, res;
    public Button button0, button1, button2, button3,button4, button5, button6, button7, button8, button9, division,
            multiplicacion, clear, delete, suma, resta, potencia, porcentaje, coma, parentesis,
            seno,coseno,tangente,igual,invercoseno,inverseno,invertangente,off,factorial,alapotencia;
    int op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);

        pantalla = (EditText) findViewById(R.id.pantalla);

        button0 = findViewById(R.id.num0);
        button1 = findViewById(R.id.num1);
        button2 = findViewById(R.id.num2);
        button3 = findViewById(R.id.num3);
        button4 = findViewById(R.id.num4);
        button5 = findViewById(R.id.num5);
        button6 = findViewById(R.id.num6);
        button7 = findViewById(R.id.num7);
        button8 = findViewById(R.id.num8);
        button9 = findViewById(R.id.num9);
        division = findViewById(R.id.division);
        multiplicacion = findViewById(R.id.multi);
        clear = findViewById(R.id.clear);
        delete = findViewById(R.id.delete);
        suma = findViewById(R.id.suma);
        resta = findViewById(R.id.resta);
        potencia = findViewById(R.id.potencia);
        porcentaje = findViewById(R.id.porcentaje);
        coma = findViewById(R.id.coma);
        parentesis = findViewById(R.id.parentesis);

        seno = findViewById(R.id.seno);
        coseno = findViewById(R.id.coseno);
        tangente = findViewById(R.id.tangente);
        igual = findViewById(R.id.igual);
        invercoseno = findViewById(R.id.invercoseno);
        inverseno = findViewById(R.id.inverseno);
        invertangente = findViewById(R.id.invertangente);
        off = findViewById(R.id.off);
        factorial = findViewById(R.id.factorial);
        alapotencia = findViewById(R.id.alapotencia);



        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        division.setOnClickListener(this);
        multiplicacion.setOnClickListener(this);
        clear.setOnClickListener(this);
        delete.setOnClickListener(this);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        potencia.setOnClickListener(this);
        porcentaje.setOnClickListener(this);
        coma.setOnClickListener(this);
        parentesis.setOnClickListener(this);
        seno.setOnClickListener(this);
        coseno.setOnClickListener(this);
        tangente.setOnClickListener(this);
        igual.setOnClickListener(this);
        invercoseno.setOnClickListener(this);
        inverseno.setOnClickListener(this);
        invertangente.setOnClickListener(this);
        off.setOnClickListener(this);
        factorial.setOnClickListener(this);
        alapotencia.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
           case R.id.num0:
                Toast.makeText(this, "Button 0 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.num1:
                Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.num2:
                Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.num3:
                Toast.makeText(this, "Button 3 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.num4:
                Toast.makeText(this, "Button 4 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.num5:
                Toast.makeText(this, "Button 5 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.num6:
                Toast.makeText(this, "Button 6 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.num7:
                Toast.makeText(this, "Button 7 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.num8:
                Toast.makeText(this, "Button 8 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.num9:
                Toast.makeText(this, "Button 9 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.division:
                Toast.makeText(this, "Button of divide", Toast.LENGTH_SHORT).show();
                break;
            case R.id.multi:
                Toast.makeText(this, "Button of multiply", Toast.LENGTH_SHORT).show();
                break;
            case R.id.clear:
                Toast.makeText(this, "Button of clear clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete:
                Toast.makeText(this, "Button of delete", Toast.LENGTH_SHORT).show();
                break;
            case R.id.suma:
                Toast.makeText(this, "Button of sum", Toast.LENGTH_SHORT).show();
                break;
            case R.id.resta:
                Toast.makeText(this, "Button of rest", Toast.LENGTH_SHORT).show();
                break;
            case R.id.potencia:
                Toast.makeText(this, "Button of potency", Toast.LENGTH_SHORT).show();
                break;
            case R.id.porcentaje:
                Toast.makeText(this, "Button of percent", Toast.LENGTH_SHORT).show();
                break;
            case R.id.coma:
                Toast.makeText(this, "Button of comma", Toast.LENGTH_SHORT).show();
                break;
            case R.id.parentesis:
                Toast.makeText(this, "Button of parentheses", Toast.LENGTH_SHORT).show();
                break;
            case R.id.seno:
                Toast.makeText(this,"Botton of sine",Toast.LENGTH_LONG).show();
                break;
            case R.id.coseno:
                Toast.makeText(this,"Botton of cosine",Toast.LENGTH_LONG).show();
                break;
            case R.id.tangente:
                Toast.makeText(this,"Botton of tangent ",Toast.LENGTH_LONG).show();
                break;
            case R.id.igual:
                Toast.makeText(this,"Botton of equal",Toast.LENGTH_LONG).show();
                break;
            case R.id.invercoseno:
                Toast.makeText(this,"Botton of cosine inverse",Toast.LENGTH_LONG).show();
                break;
            case R.id.inverseno:
                Toast.makeText(this,"Botton of sine inverse",Toast.LENGTH_LONG).show();
                break;
            case R.id.invertangente:
                Toast.makeText(this,"Botton of tangent inverse",Toast.LENGTH_LONG).show();
                break;
            case R.id.off:
                Toast.makeText(this,"Botton of off ",Toast.LENGTH_LONG).show();
                break;
            case R.id.factorial:
                Toast.makeText(this,"Botton of factorial",Toast.LENGTH_LONG).show();
                break;
            case R.id.alapotencia:
                Toast.makeText(this,"Botton of to the power",Toast.LENGTH_LONG).show();
                break;
        }
    }





}
