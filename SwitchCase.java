package com.open_bootcamp;

public class SwitchCase {
    public static void main(String[] args) {
        var estación = "verano";
    
        switch(estación) {
            case "verano":
            case "otoño":
            case "invierno":
            case "primavera":
            System.out.println("La estacion actual es " + estación);
                break;
            default:
                System.out.println(estación + " no es una estación.");
                break; 
        }  
    }
}
