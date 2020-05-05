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
        potencia = findViewById(R.id.raiz);
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
        alapotencia = findViewById(R.id.potencia);


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
        String captura;

        switch (v.getId()) {
           case R.id.num0:
                captura = pantalla.getText().toString();
                captura = captura+"0";
                pantalla.setText(captura);
                break;
            case R.id.num1:
                captura = pantalla.getText().toString();
                captura = captura+"1";
                pantalla.setText(captura);
                break;
            case R.id.num2:
                captura = pantalla.getText().toString();
                captura = captura+"2";
                pantalla.setText(captura);
                break;
            case R.id.num3:
                captura = pantalla.getText().toString();
                captura = captura+"3";
                pantalla.setText(captura);
                break;
            case R.id.num4:
                captura = pantalla.getText().toString();
                captura = captura+"4";
                pantalla.setText(captura);
                break;
            case R.id.num5:
                captura = pantalla.getText().toString();
                captura = captura+"5";
                pantalla.setText(captura);
                break;
            case R.id.num6:
                captura = pantalla.getText().toString();
                captura = captura+"6";
                pantalla.setText(captura);
                break;
            case R.id.num7:
                captura = pantalla.getText().toString();
                captura = captura+"7";
                pantalla.setText(captura);
                break;
            case R.id.num8:
                captura = pantalla.getText().toString();
                captura = captura+"8";
                pantalla.setText(captura);
                break;
            case R.id.num9:
                captura = pantalla.getText().toString();
                captura = captura+"9";
                pantalla.setText(captura);
                break;
            case R.id.division:
                try{
                    String aux = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux);
                }catch (NumberFormatException e){}

                pantalla.setText("");
                op=4;
                break;
            case R.id.multi:
                try{
                    String aux = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux);
                }catch (NumberFormatException e){}

                pantalla.setText("");
                op=3;
                break;
            case R.id.clear:
                pantalla.setText("");
                operando1=0.0;
                operando2=0.0;
                res=0.0;
                break;
            case R.id.delete:
               if(!pantalla.getText().toString().equals("")){
                   pantalla.setText(pantalla.getText().subSequence(0, pantalla.getText().length()-1)+"");
               }
                break;
            case R.id.suma:
                try{
                    String aux = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux);
                }catch (NumberFormatException e){}

               pantalla.setText("");
               op=1;
                break;
            case R.id.resta:
                try{
                    String aux = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux);
                }catch (NumberFormatException e){}

                pantalla.setText("");
                op=2;
                break;
            case R.id.potencia:
                try{
                    String aux = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux);
                }catch (NumberFormatException e){}

                pantalla.setText("");
                op=5;
                break;
            case R.id.porcentaje:
                try{
                    String aux = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux);
                }catch (NumberFormatException e){}

                pantalla.setText("");
                op=6;
                break;
            case R.id.coma:
                captura = pantalla.getText().toString();
                captura = captura+".";
                pantalla.setText(captura);
                break;
            case R.id.parentesis:
                /*captura = pantalla.getText().toString();
                captura = captura+"()";
                pantalla.setText(captura);*/
                break;
            case R.id.seno:
                try{
                    String aux = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux);
                }catch (NumberFormatException e){}

                pantalla.setText("Sin("+operando1+")");
                op=8;
                break;
            case R.id.coseno:
                try{
                    String aux = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux);
                }catch (NumberFormatException e){}

                pantalla.setText("Cos("+operando1+")");
                op=9;
                break;
            case R.id.tangente:
                try{
                    String aux = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux);
                }catch (NumberFormatException e){}

                pantalla.setText("Tan("+operando1+")");
                op=10;
                break;
            case R.id.igual:
                try {
                    String aux2 = pantalla.getText().toString();
                    operando2 = Double.parseDouble(aux2);
                }catch (NumberFormatException e){}
                pantalla.setText("");

                LogicaNegocio ln = new LogicaNegocio();
                if(op == 1){
                    //suma
                    res = ln.suma(operando1,operando2);
                }else if(op ==2){
                    //resta
                    res = ln.resta(operando1,operando2);
                }else if(op ==3){
                    //multi
                    res = ln.multiplicacion(operando1,operando2);
                }else if(op ==4){
                    //division
                    res = ln.division(operando1,operando2);
                }else if(op ==5){
                    //potencia
                    res = ln.potencia(operando1,operando2);
                }else if(op ==6){
                    //porcentaje
                    res = ln.porcentaje(operando1,operando2);
                }else if(op ==7){
                    //raiz
                    res = ln.raiz(operando1);
                }else if(op ==8){
                    //sin
                    res = ln.seno(operando1);
                }else if(op ==9){
                    //cos
                    res = ln.coseno(operando1);
                }else if(op ==10){
                    //tan
                    res = ln.tangente(operando1);
                }else if(op ==11){
                    //csc
                    res = ln.inverseno(operando1);
                }else if(op ==12){
                    //sec
                    res = ln.invercoseno(operando1);
                }else if(op ==13){
                    //ctg
                    res = ln.invertangente(operando1);
                }else if(op ==14){
                    //factorial
                    res = ln.factorial(operando1,operando2);
                }

                pantalla.setText(""+res);
                operando1 = res;
                break;
            case R.id.invercoseno:
                try{
                    String aux = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux);
                }catch (NumberFormatException e){}

                pantalla.setText("Csc("+operando1+")");
                op=11;
                break;
            case R.id.inverseno:
                try{
                    String aux = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux);
                }catch (NumberFormatException e){}

                pantalla.setText("Sec("+operando1+")");
                op=12;
                break;
            case R.id.invertangente:
                try{
                    String aux = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux);
                }catch (NumberFormatException e){}

                pantalla.setText("Ctg("+operando1+")");
                op=13;
                break;
            case R.id.off:
                finish();
                break;
            case R.id.factorial:
                try{
                    String aux = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux);
                }catch (NumberFormatException e){}

                pantalla.setText("");
                op=14;
                break;
            case R.id.raiz:
                try{
                    String aux = pantalla.getText().toString();
                    operando1 = Double.parseDouble(aux);
                }catch (NumberFormatException e){}

                pantalla.setText("√ ("+operando1+")");
                op=7;
                break;
        }
    }
}
