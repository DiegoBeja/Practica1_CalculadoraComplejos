package com.mycompany.calculadoracomplejos;

public class NumeroComplejo {
    private int parteReal;
    private int parteImaginaria;
    
    public NumeroComplejo(){
        
    }
    
    public NumeroComplejo(int parteReal, int parteImaginaria){
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;  
    }
    
    public void setReal(int real){
        this.parteReal = real;
    }
    
    public int getReal(){
        return parteReal;
    }
    
    public void setImaginario(int imaginario){
        this.parteImaginaria = imaginario;
    }
    
    public int getImaginario(){
        return this.parteImaginaria;
    }
}
