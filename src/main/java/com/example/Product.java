package com.example;

public class Product{
    private double valor;
    private int quantidade;
    public String raca;


    public Product(String raca,double valor,int quantidade){
        this.valor = valor;
        this.quantidade = quantidade;
        this.raca = raca;
    }
    public String getRaca(){
        return this.raca;

    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public double getValor(){
        return this.valor;

    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getQuantidade (){
        return this.quantidade;
    } 
    public void setQuantidade (int quantidade){
        this.quantidade = quantidade;
    
    }

}