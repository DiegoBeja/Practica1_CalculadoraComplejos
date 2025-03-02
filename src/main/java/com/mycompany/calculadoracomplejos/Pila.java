package com.mycompany.calculadoracomplejos;

public class Pila <T>{
    private T [] elementos;
    private int tope;

    public Pila(){
        elementos = (T[]) new Object[100000];
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
    
    public void push(T objeto){
        if (pilaLlena()) {
            System.out.println("Desbordamiento");
        } else {
            ++tope;
            elementos[tope] = objeto;

        }
    }

    public T pop(){
        T objeto = null;

        if (pilaVacia()) {
            System.out.println("No se puede");
        } else {
            objeto = elementos[tope];
            --tope;
        }

        return objeto;
    }

    public T peek()
    {
        T objeto = null;

        if (pilaVacia()) {
            System.out.println("No se puede");
        } else {
            objeto = elementos[tope];
        }
        return objeto;
    }
}
