package com.mycompany.calculadoracomplejos;

public class Pila <T>{
    T [] elementos;
    int tope;

    public Pila(){
        elementos = (T[]) new Object[10];
        tope = -1;
    }

    public Pila(int tope){
        elementos = (T[]) new Object[10];
        tope = -1;
    }

    public boolean pilaVacia(){
        return tope == -1;
    }

    public boolean pilaLlena(){
        return tope == elementos.length - 1;
    }
}
