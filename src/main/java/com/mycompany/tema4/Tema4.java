/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tema4;

/**
 *
 * @author Sebastian
 */
public class Tema4 {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio 1:");
                
        int numeroIf = 0;

        if (numeroIf < 0) {
            System.out.println("el numero es negativo");
        } else if (numeroIf > 0) {
            System.out.println("el numero es positivo");
        } else {
            System.out.println("el numero es cero");
        }
        
       
         System.out.println("Ejercicio 2:");
        int numeroWhile = 0; 
        
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        
        
         System.out.println("Ejercicio 3:");
        
         int numeroDoWhile = 0;
         
         do { 
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while ( numeroDoWhile <3 );
        
         
         System.out.println("Ejercicio 4:");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++ ){
            System.out.println(numeroFor);}
   
        
        System.out.println("Ejercicio 5:");
             
        String estacion = "invierno";
        
        switch(estacion){
            case "verano":
                System.out.println("La estación es verano");
                break;
            case "otoño":
                System.out.println("La estación es otoño");  
                break;
            case "invierno":
                System.out.println("La estación es invierno");    
                break;
            case "primavera":
                System.out.println("La estación es primavera");    
                break;
        }
    
    }
    
    
    
    

}
