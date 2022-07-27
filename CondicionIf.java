package com.open_bootcamp;

public class CondicionIf{
    //Condicion if
    public static void main(String [] args){
        int numeroif = 0;

        if (numeroif > 0){
            System.out.println(numeroif + " es un numero positivo.");
        }else if(numeroif < 0){
            System.out.print(numeroif + " es un numero negativo.");
        }else{
            System.out.println(numeroif);
        }  
    }
}