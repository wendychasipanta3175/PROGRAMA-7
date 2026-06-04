package com.example.TEST;
import java.util.Scanner;
//hola
//HOLA TATY
//jk
//hola mundo
//Hola grupo7


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //programa

        System.out.print("Introduzca la longitud: ");
        double C = sc.nextDouble();
//proceso
        double radio = C / (2 * Math.PI);

        System.out.println("El numero del circulo  es: " + radio);
    }
}