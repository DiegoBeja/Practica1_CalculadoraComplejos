package com.mycompany.calculadoracomplejos;

import java.util.Scanner;

public class CalculadoraComplejos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora x = new Calculadora();

        System.out.println("~~Seleccione una opcion~~");
        System.out.println("1) Consola");
        System.out.println("2) GUI");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Que operacion desea hacer?");
                System.out.println("1) Suma");
                System.out.println("2) Resta");
                System.out.println("3) Multiplicacion");
                System.out.println("4) Division");
                int opcionOperacion = scanner.nextInt();
                switch (opcionOperacion){
                    case 1:
                        System.out.print("Ingrese la parte entera del primer numero:");
                        float entera1 = scanner.nextFloat();
                        System.out.print("Ingrese la parte imaginaria del primer numero:");
                        float imaginario1 = scanner.nextFloat();
                        System.out.print("Ingrese la parte entera del segundo numero:");
                        float entera2 = scanner.nextFloat();
                        System.out.print("Ingrese la parte imaginaria del segundo numero:");
                        float imaginario2 = scanner.nextFloat();
                        
                        NumeroComplejo num1 = new NumeroComplejo(entera1, imaginario1);
                        NumeroComplejo num2 = new NumeroComplejo(entera2, imaginario2);

                        System.out.println(x.suma(num1, num2));
                        break;

                    case 2:
                        System.out.print("Ingrese la parte entera del primer numero:");
                        float entera1Resta = scanner.nextFloat();
                        System.out.print("Ingrese la parte imaginaria del primer numero:");
                        float imaginario1Resta = scanner.nextFloat();
                        System.out.print("Ingrese la parte entera del segundo numero:");
                        float entera2Resta = scanner.nextFloat();
                        System.out.print("Ingrese la parte imaginaria del segundo numero:");
                        float imaginario2Resta = scanner.nextFloat();
                        
                        NumeroComplejo num1Resta = new NumeroComplejo(entera1Resta, imaginario1Resta);
                        NumeroComplejo num2Resta = new NumeroComplejo(entera2Resta, imaginario2Resta);

                        System.out.println(x.resta(num1Resta, num2Resta));
                        break;

                    case 3:
                        System.out.print("Ingrese la parte entera del primer numero:");
                        float entera1Multi = scanner.nextFloat();
                        System.out.print("Ingrese la parte imaginaria del primer numero:");
                        float imaginario1Multi = scanner.nextFloat();
                        System.out.print("Ingrese la parte entera del segundo numero:");
                        float entera2Multi = scanner.nextFloat();
                        System.out.print("Ingrese la parte imaginaria del segundo numero:");
                        float imaginario2Multi = scanner.nextFloat();
                        
                        NumeroComplejo num1Multi = new NumeroComplejo(entera1Multi, imaginario1Multi);
                        NumeroComplejo num2Multi = new NumeroComplejo(entera2Multi, imaginario2Multi);

                        System.out.println(x.multiplicacion(num1Multi, num2Multi));
                        break;

                    case 4:
                        System.out.print("Ingrese la parte entera del primer numero:");
                        float entera1Div = scanner.nextFloat();
                        System.out.print("Ingrese la parte imaginaria del primer numero:");
                        float imaginario1Div = scanner.nextFloat();
                        System.out.print("Ingrese la parte entera del segundo numero:");
                        float entera2Div = scanner.nextFloat();
                        System.out.print("Ingrese la parte imaginaria del segundo numero:");
                        float imaginario2Div = scanner.nextFloat();
                        
                        NumeroComplejo num1Div = new NumeroComplejo(entera1Div, imaginario1Div);
                        NumeroComplejo num2Div = new NumeroComplejo(entera2Div, imaginario2Div);

                        System.out.println(x.division(num1Div, num2Div));
                        break;
                }
                break;
            case 2:
                CalculadoraInterfaz calculadora = new CalculadoraInterfaz();
                calculadora.setVisible(true);
                break;
        }
    }
}
