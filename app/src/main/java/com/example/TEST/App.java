package com.example.TEST;

import java.util.Scanner;
//hola
//HOLA TATY
//jk
//hola mundo
//Hola grupo7

public class App {
    public static void main(String[] args) {

        System.out.println("2.\tDiseñe un algoritmo que permita ingresar números enteros positivos. El proceso termina cuando se ingrese un número negativo. Al finalizar, mostrar la cantidad de números ingresados, la suma total y el promedio. ");
        System.out.println("realiza guangasig");

        //programa
        try (Scanner sc = new Scanner(System.in)) {
            //programa
            int numero;
            int suma = 0 ;
            int contador = 0 ;
            
            System.out.println("ingrese numeros enteros positivos: ");
            System.out.println("ingrese numero negativo para terminar: ");
            
            while (true){
                numero = sc.nextInt();
                
                if (numero < 0){
                    break;
                }
                
                suma = suma + numero ;
                contador++;
            }
            
            if(contador > 0){
                double promedio =(double)suma/contador ;
                
                System.out.println("resultados: ");
                System.out.println("cantidad de numeros ingresados "+ contador);
                System.out.println("suma total: "+ suma);
                System.out.println("promedio : "+ promedio);
            } else {
                System.out.println("no se ingresaron numeros positivos");
            }
            
            System.out.print("Introduzca la longitud de la circunferencia: ");
            
            
            double C = sc.nextDouble();
            
            double radio = C / (2 * Math.PI);
            
            System.out.println("El numero de la circunferencia  es: " + radio);
        }
    }
}