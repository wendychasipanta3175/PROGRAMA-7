package com.example.TEST;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa de la circunferencia: ");
        double C = sc.nextDouble();

        double radio = C / (2 * Math.PI);

        System.out.println("El radio de  de tal cosa es: " + radio);
    }
}