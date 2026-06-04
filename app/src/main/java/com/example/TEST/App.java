package com.example.TEST;
import java.util.Scanner;
//hola
//HOLA TATY
//jk
//hola mundo


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la longitud de la circunferencia: ");
        double C = sc.nextDouble();

        double radio = C / (2 * Math.PI);

        System.out.println("El radio de la circunferencia es: " + radio);
    }
}