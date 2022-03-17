package Practica_vectores;
/*
Realizar un algoritmo que lea una secuencia de 10 números como máximo y los 
almacene en una estructura de tipo vector. 
El algoritmo debe devolver el vector inverso.
Ejemplo:
V = { 8, 4, 2, 6, 0, 1, 7, 6, 6, 5 }
Inverso:
VI= { 5, 6, 6, 7, 1, 0, 6, 2, 4, 8 }

*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int n = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("ingresar numeros: ");
            n = sc.nextInt();

            num[i] = n;
        }
        // almacenar vector
        for (int i = 0; i < num.length; i++) {
            System.out.println("numeros almacenados: " + num[i]);
        }

        // VI
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println("el vector inverso es: " + num[i]);
        }

    }
}
