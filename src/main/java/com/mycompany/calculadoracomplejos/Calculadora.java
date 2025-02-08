package com.mycompany.calculadoracomplejos;
import java.text.DecimalFormat;

public class Calculadora {
    public Calculadora(){

    }

    public String suma(int realNum1, int imaginarioNum1, int realNum2, int imaginarioNum2){
        int parteReal = realNum1 + realNum2;
        int parteImaginaria = imaginarioNum1 + imaginarioNum2;

        return parteReal + " + " + parteImaginaria + "i";
    }

    public String resta(int realNum1, int imaginarioNum1, int realNum2, int imaginarioNum2){
        int parteReal = realNum1 - realNum2;
        int parteImaginaria = imaginarioNum1 - imaginarioNum2;

        return parteReal + " + " + parteImaginaria + "i";
    }

    public String multiplicacion(int realNum1, int imaginarioNum1, int realNum2, int imaginarioNum2){
        int parteReal = (realNum1 * realNum2) + (imaginarioNum1 * imaginarioNum2 * -1);
        int parteImaginaria = (realNum1 * imaginarioNum2) + (realNum2 * imaginarioNum1);

        return parteReal + (parteImaginaria>0? " + ":"") + parteImaginaria + "i";
    }

    public String division(int realNum1, int imaginarioNum1, int realNum2, int imaginarioNum2){
        DecimalFormat cuatroDecimales = new DecimalFormat("0.0000");
        double denominador = (realNum2 * realNum2) + (imaginarioNum2 * imaginarioNum2);

        double parteReal = ((realNum1 * realNum2) + (imaginarioNum1 * imaginarioNum2)) / denominador;
        double parteImaginaria = ((imaginarioNum1 * realNum2) - (realNum1 * imaginarioNum2)) / denominador;

        return cuatroDecimales.format(parteReal) + (parteImaginaria>0? " + ":"") + cuatroDecimales.format(parteImaginaria) + "i";
    }
}
