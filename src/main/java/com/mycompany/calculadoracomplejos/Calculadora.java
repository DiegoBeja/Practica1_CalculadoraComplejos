package com.mycompany.calculadoracomplejos;
import java.text.DecimalFormat;

public class Calculadora {
    Pila<String> resultados = new Pila();
    public Calculadora(){

    }

    public NumeroComplejo suma(NumeroComplejo num1, NumeroComplejo num2){
        NumeroComplejo resultado = new NumeroComplejo(num1.getReal() + num2.getReal(), num1.getImaginario() + num2.getImaginario());
       
        return resultado;
        //return parteReal + (parteImaginaria>0? " + ":"") + parteImaginaria + "i";
    }

    public String resta(float realNum1, float imaginarioNum1, float realNum2, float imaginarioNum2){
        float parteReal = realNum1 - realNum2;
        float parteImaginaria = imaginarioNum1 - imaginarioNum2;

        return parteReal + (parteImaginaria>0? " + ":"") + parteImaginaria + "i";
    }

    public String multiplicacion(float realNum1, float imaginarioNum1, float realNum2, float imaginarioNum2){
        float parteReal = (realNum1 * realNum2) + (imaginarioNum1 * imaginarioNum2 * -1);
        float parteImaginaria = (realNum1 * imaginarioNum2) + (realNum2 * imaginarioNum1);

        return parteReal + (parteImaginaria>0? " + ":"") + parteImaginaria + "i";
    }

    public String division(float realNum1, float imaginarioNum1, float realNum2, float imaginarioNum2){
        DecimalFormat cuatroDecimales = new DecimalFormat("0.0000");
        float denominador = (realNum2 * realNum2) + (imaginarioNum2 * imaginarioNum2);

        float parteReal = ((realNum1 * realNum2) + (imaginarioNum1 * imaginarioNum2)) / denominador;
        float parteImaginaria = ((imaginarioNum1 * realNum2) - (realNum1 * imaginarioNum2)) / denominador;

        return cuatroDecimales.format(parteReal) + (parteImaginaria>0? " + ":"") + cuatroDecimales.format(parteImaginaria) + "i";
    }
}
