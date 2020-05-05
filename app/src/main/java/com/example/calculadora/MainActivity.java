package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText pantalla;
    public double operando1, operando2, res;
    int op;

    public int idsBtns[] = {R.id.num0,R.id.num1,R.id.num2,R.id.num3,R.id.num4,R.id.num5,R.id.num6,R.id.num7,R.id.num8,R.id.num9,
            R.id.division,R.id.multi,R.id.clear,R.id.delete,R.id.suma,R.id.resta,R.id.raiz,R.id.porcentaje,R.id.coma,R.id.parentesis,
            R.id.seno,R.id.coseno,R.id.tangente,R.id.igual,R.id.invercoseno,R.id.inverseno,R.id.invertangente,R.id.off,
            R.id.factorial,R.id.potencia};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);

        pantalla = (EditText) findViewById(R.id.pantalla);

        for(int i=0;i<30;i++){
            new Button(getApplicationContext());
            Button btn;
            btn = findViewById(idsBtns[i]);
            btn.setOnClickListener(this);
        }
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
                res = ln.calculoIgual(op,operando1,operando2);

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
