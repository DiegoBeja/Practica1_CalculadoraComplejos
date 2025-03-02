package com.mycompany.calculadoracomplejos;
import java.text.DecimalFormat;

public class Calculadora {
    public Calculadora(){

    }

    public NumeroComplejo suma(NumeroComplejo num1, NumeroComplejo num2){
        NumeroComplejo resultado = new NumeroComplejo(num1.getReal() + num2.getReal(), num1.getImaginario() + num2.getImaginario());
        
        return resultado;
    }

    public NumeroComplejo resta(NumeroComplejo num1, NumeroComplejo num2){
        NumeroComplejo resultado = new NumeroComplejo(num1.getReal() - num2.getReal(), num1.getImaginario() - num2.getImaginario());
        
        return resultado;
    }

    public NumeroComplejo multiplicacion(NumeroComplejo num1, NumeroComplejo num2){
        float parteReal = (num1.getReal() * num2.getReal()) + (num1.getImaginario() * num2.getImaginario() * -1);
        float parteImaginaria = (num1.getReal() * num2.getImaginario()) + (num2.getReal() * num1.getImaginario());
        
        NumeroComplejo resultado = new NumeroComplejo(parteReal, parteImaginaria); 
        return resultado;
    }

    public NumeroComplejo division(NumeroComplejo num1, NumeroComplejo num2){
        DecimalFormat cuatroDecimales = new DecimalFormat("0.0000");
        float denominador = (num2.getReal() * num2.getReal()) + (num2.getImaginario() * num2.getImaginario());

        float parteReal = ((num1.getReal() * num2.getReal()) + (num1.getImaginario() * num2.getImaginario())) / denominador;
        float parteImaginaria = ((num1.getImaginario() * num2.getReal()) - (num1.getReal() * num2.getImaginario())) / denominador;
       
        NumeroComplejo resultado = new NumeroComplejo(parteReal, parteImaginaria);
        return resultado;
    }
}
