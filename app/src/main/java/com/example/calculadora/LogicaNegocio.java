package com.example.calculadora;

public class LogicaNegocio {

    private double  res;

    public double suma(double op1,double op2){
        res = 0.0;
        res = op1 + op2;
        return res;
    }

    public double resta(double op1,double op2){
        res = 0.0;
        res = op1 - op2;
        return res;
    }

    public double multiplicacion(double op1,double op2){
        res = 0.0;
        res = op1 * op2;
        return res;
    }

    public double division(double op1,Double op2){
        res = 0.0;
        if(op2 == 0.0){

        }else{
            res = op1 / op2;
        }
        return res;
    }

    public double potencia(double op1,double op2){
        res = 0.0;
        res = Math.pow(op1,op2);
        return res;
    }

    public double porcentaje(double op1,double op2){
        res = 0.0;
        res = op2*(op1/100.0);
        return res;
    }

    public double raiz(double op1){
        res = 0.0;
        res = Math.sqrt(op1);
        return res;
    }

    public double seno(double op1){
        res = 0.0;
        double rad = Math.toRadians(op1);
        res = (Math.sin(rad));
        return res;
    }

    public double coseno(double op1){
        res = 0.0;
        double rad = Math.toRadians(op1);
        res = (Math.cos(rad));
        return res;
    }

    public double tangente(double op1){
        res = 0.0;
        double rad = Math.toRadians(op1);
        res = (Math.tan(rad));
        return res;
    }

    public double inverseno(double op1){
        res = 0.0;
        double angulo = (Math.asin(op1));
        res = Math.toDegrees(angulo);
        return res;
    }

    public double invercoseno(double op1){
        res = 0.0;
        double angulo = (Math.acos(op1));
        res = Math.toDegrees(angulo);
        return res;
    }

    public double invertangente(double op1){
        res = 0.0;
        double angulo = (Math.atan(op1));
        res = Math.toDegrees(angulo);
        return res;
    }

    public double factorial(double op1){
        res = 1;
        for (double i=op1; i>=1; i--){
            res = res*i;
        }
        return res;
    }
}
