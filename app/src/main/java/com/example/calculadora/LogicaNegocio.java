package com.example.calculadora;

import android.widget.Switch;

public class LogicaNegocio {

    private double res;

    public double suma(double op1, double op2) {
        res = 0.0;
        res = op1 + op2;
        return res;
    }

    public double resta(double op1, double op2) {
        res = 0.0;
        res = op1 - op2;
        return res;
    }

    public double multiplicacion(double op1, double op2) {
        res = 0.0;
        res = op1 * op2;
        return res;
    }

    public double division(double op1, Double op2) {
        res = 0.0;
        if (op2 == 0.0) {

        } else {
            res = op1 / op2;
        }
        return res;
    }

    public double potencia(double op1, double op2) {
        res = 0.0;
        res = Math.pow(op1, op2);
        return res;
    }

    public double porcentaje(double op1, double op2) {
        res = 0.0;
        res = op2 * (op1 / 100.0);
        return res;
    }

    public double raiz(double op1) {
        res = 0.0;
        res = Math.sqrt(op1);
        return res;
    }

    public double seno(double op1) {
        res = 0.0;
        double rad = Math.toRadians(op1);
        res = (Math.sin(rad));
        return res;
    }

    public double coseno(double op1) {
        res = 0.0;
        double rad = Math.toRadians(op1);
        res = (Math.cos(rad));
        return res;
    }

    public double tangente(double op1) {
        res = 0.0;
        double rad = Math.toRadians(op1);
        res = (Math.tan(rad));
        return res;
    }

    public double inverseno(double op1) {
        res = 0.0;
        double angulo = (Math.asin(op1));
        res = Math.toDegrees(angulo);
        return res;
    }

    public double invercoseno(double op1) {
        res = 0.0;
        double angulo = (Math.acos(op1));
        res = Math.toDegrees(angulo);
        return res;
    }

    public double invertangente(double op1) {
        res = 0.0;
        double angulo = (Math.atan(op1));
        res = Math.toDegrees(angulo);
        return res;
    }

    public double factorial(double op1) {
        res = 1;
        for (double i = op1; i >= 1; i--) {
            res = res * i;
        }
        return res;
    }

    public double calculoIgual(int op, double op1, double op2) {
        switch (op) {
            case 1:
                //suma
                res = suma(op1, op2);
                break;
            case 2:
                //resta
                res = resta(op1, op2);
                break;
            case 3:
                //multi
                res = multiplicacion(op1, op2);
                break;
            case 4:
                //division
                res = division(op1, op2);
                break;
            case 5:
                //potencia
                res = potencia(op1, op2);
                break;
            case 6:
                //porcentaje
                res = porcentaje(op1, op2);
                break;
            case 7:
                //raiz
                res = raiz(op1);
                break;
            case 8:
                //sin
                res = seno(op1);
                break;
            case 9:
                //cos
                res = coseno(op1);
                break;
            case 10:
                //tan
                res = tangente(op1);
                break;
            case 11:
                //csc
                res = inverseno(op1);
                break;
            case 12:
                //sec
                res = invercoseno(op1);
                break;
            case 13:
                //ctg
                res = invertangente(op1);
                break;
            case 14:
                //factorial
                res = factorial(op1);
                break;
        }
        return res;
    }
}
