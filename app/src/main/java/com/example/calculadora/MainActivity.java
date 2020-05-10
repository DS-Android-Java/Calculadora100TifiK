package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText pantalla;
    TextView tvD;
    public double operando1, operando2, res;
    int op, error, format;
    String tvDigitado;
    String captura;

    public int idsBtns[] = {R.id.num0, R.id.num1, R.id.num2, R.id.num3, R.id.num4, R.id.num5, R.id.num6, R.id.num7, R.id.num8, R.id.num9,
            R.id.division, R.id.multi, R.id.clear, R.id.delete, R.id.suma, R.id.resta, R.id.raiz, R.id.porcentaje, R.id.coma, R.id.parentesis,
            R.id.seno, R.id.coseno, R.id.tangente, R.id.igual, R.id.invercoseno, R.id.inverseno, R.id.invertangente, R.id.off,
            R.id.factorial, R.id.potencia};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);

        pantalla = findViewById(R.id.pantalla);
        tvD = findViewById(R.id.tvD);
        tvDigitado = "";
        error = 0;
        format = 0;
        for (int i = 0; i < 30; i++) {
            new Button(getApplicationContext());
            Button btn;
            btn = findViewById(idsBtns[i]);
            btn.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.num0:
                capCero();
                break;
            case R.id.num1:
                capUno();
                break;
            case R.id.num2:
                capDos();
                break;
            case R.id.num3:
                capTres();
                break;
            case R.id.num4:
                capCuatro();
                break;
            case R.id.num5:
                capCinco();
                break;
            case R.id.num6:
                capSeis();
                break;
            case R.id.num7:
                capSiete();
                break;
            case R.id.num8:
                capOcho();
                break;
            case R.id.num9:
                capNueve();
                break;
            case R.id.division:
                metDivision();
                break;
            case R.id.multi:
                metMultiplicacion();
                break;
            case R.id.clear:
                capClear();
                break;
            case R.id.delete:
                capDelete();
                break;
            case R.id.suma:
                metSuma();
                break;
            case R.id.resta:
                metResta();
                break;
            case R.id.potencia:
                metPotencia();
                break;
            case R.id.porcentaje:
                metPorcentaje();
                break;
            case R.id.coma:
                capComa();
                break;
            case R.id.parentesis:
                /*captura = pantalla.getText().toString();
                captura = captura+"()";
                pantalla.setText(captura);*/
                break;
            case R.id.seno:
                metSeno();
                break;
            case R.id.coseno:
                metCoseno();
                break;
            case R.id.tangente:
                metTangente();
                break;
            case R.id.igual:
                metIgual();
                break;
            case R.id.invercoseno:
                metInverCoseno();
                break;
            case R.id.inverseno:
                metInverSeno();
                break;
            case R.id.invertangente:
                metInverTangente();
                break;
            case R.id.off:
                finish();
                break;
            case R.id.factorial:
                metFactorial();
                break;
            case R.id.raiz:
                metRaiz();
                break;
        }
    }

    private void capCero() {
        captura = pantalla.getText().toString();
        captura = captura + "0";
        pantalla.setText(captura);
    }

    private void capUno() {
        captura = pantalla.getText().toString();
        captura = captura + "1";
        pantalla.setText(captura);
    }

    private void capDos() {
        captura = pantalla.getText().toString();
        captura = captura + "2";
        pantalla.setText(captura);
    }

    private void capTres() {
        captura = pantalla.getText().toString();
        captura = captura + "3";
        pantalla.setText(captura);
    }

    private void capCuatro() {
        captura = pantalla.getText().toString();
        captura = captura + "4";
        pantalla.setText(captura);
    }

    private void capCinco() {
        captura = pantalla.getText().toString();
        captura = captura + "5";
        pantalla.setText(captura);

    }

    private void capSeis() {
        captura = pantalla.getText().toString();
        captura = captura + "6";
        pantalla.setText(captura);
    }

    private void capSiete() {
        captura = pantalla.getText().toString();
        captura = captura + "7";
        pantalla.setText(captura);
    }

    private void capOcho() {
        captura = pantalla.getText().toString();
        captura = captura + "8";
        pantalla.setText(captura);
    }

    private void capNueve() {
        captura = pantalla.getText().toString();
        captura = captura + "9";
        pantalla.setText(captura);
    }

    private void capComa() {
        captura = pantalla.getText().toString();
        captura = captura + ".";
        pantalla.setText(captura);

    }

    private void capClear() {
        pantalla.setText("");
        operando1 = 0.0;
        operando2 = 0.0;
        res = 0.0;
        error = 0;
        tvDigitado = "";
        op = 0;
        tvD.setText(tvDigitado);
    }

    private void capDelete() {
        if (!pantalla.getText().toString().equals("")) {
            pantalla.setText(pantalla.getText().subSequence(0, pantalla.getText().length() - 1) + "");
        }
    }

    //metodos
    private void metDivision() {
        if (error >= 1) {
            Toast.makeText(this, "No puede seleccionar otra operación", Toast.LENGTH_LONG).show();
        } else {
            try {
                String aux = pantalla.getText().toString();
                operando1 = Double.parseDouble(aux);
            } catch (NumberFormatException e) {
            }

            if (op == 2) {
                operando1 = -operando1;
                tvDigitado = "-" + pantalla.getText() + "/";
            } else {
                tvDigitado = pantalla.getText() + "/";
            }
            pantalla.setText("");
            tvD.setText(tvDigitado);
            op = 4;
            error++;
            format = 2;
        }
    }

    private void metMultiplicacion() {
        if (error >= 1) {
            Toast.makeText(this, "No puede seleccionar otra operación", Toast.LENGTH_LONG).show();
        } else {
            try {
                String aux = pantalla.getText().toString();
                operando1 = Double.parseDouble(aux);
            } catch (NumberFormatException e) {
            }

            if (op == 2) {
                operando1 = -operando1;
                tvDigitado = "-" + pantalla.getText() + "*";
            } else {
                tvDigitado = pantalla.getText() + "*";
            }
            pantalla.setText("");
            tvD.setText(tvDigitado);
            op = 3;
            error++;
            format = 2;
        }
    }

    private void metSuma() {
        try {
            String aux = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux);
        } catch (NumberFormatException e) {
        }

        if (op == 2 && format == 0) {
            operando1 = -operando1;
            tvDigitado = "-" + pantalla.getText() + "+";
            op = 1;
        } else if (format == 2) {//Para cuando son funciones especiales
            tvDigitado = tvDigitado + pantalla.getText() + "+";
        } else if (op == 1 && format == 0) {
            tvDigitado = "+" + pantalla.getText() + "+";
            op = 1;
        } else {
            tvDigitado = pantalla.getText() + "+";
            op = 1;
        }
        pantalla.setText("");
        tvD.setText(tvDigitado);
    }

    private void metResta() {
        try {
            String aux = pantalla.getText().toString();
            operando1 = Double.parseDouble(aux);
        } catch (NumberFormatException e) {
        }

        if (op == 2 && format == 0) {
            operando1 = -operando1;
            tvDigitado = "-" + pantalla.getText() + "-";
            op = 2;
        } else if (format == 2) {//Para cuando son funciones especiales
            tvDigitado = tvDigitado + pantalla.getText() + "-";
            operando1 = -operando1;
        } else if (op == 1 && format == 0) {
            tvDigitado = "+" + pantalla.getText() + "-";
            op = 2;
        } else {
            tvDigitado = pantalla.getText() + "-";
            op = 2;
        }
        pantalla.setText("");
        tvD.setText(tvDigitado);
    }

    private void metPotencia() {
        if (error >= 1) {
            Toast.makeText(this, "No puede seleccionar otra operación", Toast.LENGTH_LONG).show();
        } else {
            try {
                String aux = pantalla.getText().toString();
                operando1 = Double.parseDouble(aux);
            } catch (NumberFormatException e) {
            }

            if (op == 2) {
                operando1 = -operando1;
                tvDigitado = "-" + pantalla.getText() + "^";
            } else {
                tvDigitado = pantalla.getText() + "^";
            }
            pantalla.setText("");
            tvD.setText(tvDigitado);
            op = 5;
            error++;
            format = 2;
        }
    }

    private void metPorcentaje() {
        if (error >= 1) {
            Toast.makeText(this, "No puede seleccionar otra operación", Toast.LENGTH_LONG).show();
        } else {
            try {
                String aux = pantalla.getText().toString();
                operando1 = Double.parseDouble(aux);
            } catch (NumberFormatException e) {
            }

            if (op == 2) {
                operando1 = -operando1;
                tvDigitado = "-" + pantalla.getText() + "%";
            } else {
                tvDigitado = pantalla.getText() + "%";
            }
            pantalla.setText("");
            tvD.setText(tvDigitado);
            op = 6;
        }
    }

    private void metSeno() {
        if (error >= 1) {
            Toast.makeText(this, "No puede seleccionar otra operación", Toast.LENGTH_LONG).show();
        } else {
            try {
                String aux = pantalla.getText().toString();
                operando1 = Double.parseDouble(aux);
            } catch (NumberFormatException e) {
            }
            if (op == 2) {
                operando1 = -operando1;
                tvDigitado = "Sin(" + operando1 + ")";
            } else {
                pantalla.setText("Sin(" + operando1 + ")");
                tvDigitado = "Sin(" + operando1 + ")";
            }

            tvD.setText(tvDigitado);
            format = 1;
            op = 8;
            error++;
        }
    }

    private void metCoseno() {
        if (error >= 1) {
            Toast.makeText(this, "No puede seleccionar otra operación", Toast.LENGTH_LONG).show();
        } else {
            try {
                String aux = pantalla.getText().toString();
                operando1 = Double.parseDouble(aux);
            } catch (NumberFormatException e) {
            }

            if (op == 2) {
                operando1 = -operando1;
                tvDigitado = "Cos(" + operando1 + ")";
            } else {
                pantalla.setText("Cos(" + operando1 + ")");
                tvDigitado = "Cos(" + operando1 + ")";
            }
            tvD.setText(tvDigitado);
            format = 1;
            op = 9;
            error++;
        }
    }

    private void metTangente() {
        if (error >= 1) {
            Toast.makeText(this, "No puede seleccionar otra operación", Toast.LENGTH_LONG).show();
        } else {
            try {
                String aux = pantalla.getText().toString();
                operando1 = Double.parseDouble(aux);
            } catch (NumberFormatException e) {
            }

            if (op == 2) {
                operando1 = -operando1;
                tvDigitado = "Tan(" + operando1 + ")";
            } else {
                pantalla.setText("Tan(" + operando1 + ")");
                tvDigitado = "Tan(" + operando1 + ")";
            }
            tvD.setText(tvDigitado);
            format = 1;
            op = 10;
            error++;
        }
    }

    private void metIgual() {
        try {
            String aux2 = pantalla.getText().toString();
            operando2 = Double.parseDouble(aux2);
        } catch (NumberFormatException e) {
        }
        pantalla.setText("");

        LogicaNegocio ln = new LogicaNegocio();
        res = ln.calculoIgual(op, operando1, operando2);

        if (format == 1) {//Para cuando son funciones especiales
            tvDigitado = tvDigitado + " = " + res;
        } else {
            tvDigitado = tvDigitado + operando2 + " = " + res;
        }
        pantalla.setText("" + res);
        operando1 = res;
        tvD.setText(tvDigitado);
        op = -1;
        error = 0;
        format = 0;
    }

    private void metInverCoseno() {
        if (error >= 1) {
            Toast.makeText(this, "No puede seleccionar otra operación", Toast.LENGTH_LONG).show();
        } else {
            try {
                String aux = pantalla.getText().toString();
                operando1 = Double.parseDouble(aux);
            } catch (NumberFormatException e) {
            }

            if (op == 2) {
                operando1 = -operando1;
                tvDigitado = "Csc(" + operando1 + ")";
            } else {
                pantalla.setText("Csc(" + operando1 + ")");
                tvDigitado = "Csc(" + operando1 + ")";
            }
            tvD.setText(tvDigitado);
            format = 1;
            op = 11;
            error++;
        }
    }

    private void metInverSeno() {
        if (error >= 1) {
            Toast.makeText(this, "No puede seleccionar otra operación", Toast.LENGTH_LONG).show();
        } else {
            try {
                String aux = pantalla.getText().toString();
                operando1 = Double.parseDouble(aux);
            } catch (NumberFormatException e) {
            }

            if (op == 2) {
                operando1 = -operando1;
                tvDigitado = "Sec(" + operando1 + ")";
            } else {
                pantalla.setText("Sec(" + operando1 + ")");
                tvDigitado = "Sec(" + operando1 + ")";
            }
            tvD.setText(tvDigitado);
            format = 1;
            op = 12;
            error++;
        }
    }

    private void metInverTangente() {
        if (error >= 1) {
            Toast.makeText(this, "No puede seleccionar otra operación", Toast.LENGTH_LONG).show();
        } else {
            try {
                String aux = pantalla.getText().toString();
                operando1 = Double.parseDouble(aux);
            } catch (NumberFormatException e) {
            }

            if (op == 2) {
                operando1 = -operando1;
                tvDigitado = "Ctg(" + operando1 + ")";
            } else {
                pantalla.setText("Ctg(" + operando1 + ")");
                tvDigitado = "Ctg(" + operando1 + ")";
            }
            tvD.setText(tvDigitado);
            format = 1;
            op = 13;
            error++;
        }
    }

    private void metFactorial() {
        if (error >= 1 || op == 2) {
            Toast.makeText(this, "No puede seleccionar esta operación", Toast.LENGTH_LONG).show();
        } else {
            try {
                String aux = pantalla.getText().toString();
                operando1 = Double.parseDouble(aux);
            } catch (NumberFormatException e) {
            }

            tvDigitado = pantalla.getText() + "!";
            pantalla.setText("");
            tvD.setText(tvDigitado);
            format = 1;
            op = 14;
            error++;
        }
    }

    private void metRaiz() {
        if (error >= 1 || op == 2) {
            Toast.makeText(this, "No puede seleccionar esta operación", Toast.LENGTH_LONG).show();
        } else {
            try {
                String aux = pantalla.getText().toString();
                operando1 = Double.parseDouble(aux);
            } catch (NumberFormatException e) {
            }

            pantalla.setText("√ (" + operando1 + ")");
            tvDigitado = "√ (" + operando1 + ")";
            tvD.setText(tvDigitado);
            format = 1;
            op = 7;
            error++;
        }
    }

}