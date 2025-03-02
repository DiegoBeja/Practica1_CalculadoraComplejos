package com.mycompany.calculadoracomplejos;

public class NumeroComplejo {
    private float parteReal;
    private float parteImaginaria;
    
    public NumeroComplejo(){
        
    }
    
    public NumeroComplejo(float parteReal, float parteImaginaria){
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;  
    }
    
    public void setReal(float real){
        this.parteReal = real;
    }
    
    public float getReal(){
        return parteReal;
    }
    
    public void setImaginario(float imaginario){
        this.parteImaginaria = imaginario;
    }
    
    public float getImaginario(){
        return this.parteImaginaria;
    }
    
    @Override
    public String toString(){
        if(parteImaginaria == 0){
            return parteReal + "";
        } else if(parteReal == 0){
            return parteImaginaria + "i";
        } else if(parteImaginaria < 0){
            return parteReal + "-" + (-parteImaginaria) + "i";
        } else {
            return parteReal + "+" + parteImaginaria + "i";
        }
    }
}
