package Practica_vectores;
/* Realizar un algoritmo que lea una secuencia de 100 números 
como máximo y los almacene en una estructura de tipo array.
 Posteriormente, se debe calcular la suma de los N primeros 
 números almacenados. El dato N es un número introducido por un dispositivo de entrada.*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[3];
        int n = 0, a = 0;

        for (int i = 0; i < numero.length; i++) {
            System.out.println("numeros");
            n = sc.nextInt();

            numero[i] = n;
            a += numero[i];

        }

        for (int i = 0; i < numero.length; i++) {
            System.out.println("numeros  " + i + ":" + numero[i]);
        }
        System.out.println("suma de numeros " + a);

    }

}
