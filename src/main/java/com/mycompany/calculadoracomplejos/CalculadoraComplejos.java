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

                        System.out.println(x.suma(entera1, imaginario1, entera2, imaginario2));
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

                        System.out.println(x.resta(entera1Resta, imaginario1Resta, entera2Resta, imaginario2Resta));
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

                        System.out.println(x.multiplicacion(entera1Multi, imaginario1Multi, entera2Multi, imaginario2Multi));
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

                        System.out.println(x.division(entera1Div, imaginario1Div, entera2Div, imaginario2Div));
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
