package Practica_vectores;

import java.util.Scanner;

/*
Realizar un algoritmo que lea de un dispositivo de entrada dos vectores de tamaño 10 y devuelva el vector suma.
Si tenemos los vectores V1 = (a1, a2, …, a10) y V2 = (b1, b2, …, b10) el vector suma se
define como el vector obtenido de sumar componente a componente:
V1 + V2 = (a1+ b1, a2+ b2, …, a10+ b10) . 

*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[4];
        int[] v2 = new int[4];
        int a = 0, b = 0;
        double suma_a = 0, suma_b = 0, suma_c = 0, suma_d = 0;

        for (int i = 0; i < v1.length; i++) {
            System.out.println("digite componente A");
            a = sc.nextInt();
            v1[i] = a;
        }
        for (int i = 0; i < v2.length; i++) {
            System.out.println("digite componente B");
            b = sc.nextInt();
            v2[i] = b;
        }

        for (int i = 1; i <= 2; i++) {
            suma_a = v1[i] + v2[i];
            for (int j = 2; j <= 3; i++) {
                suma_b = v1[i] + v2[i];
                for (int k = 3; k <= 4; i++) {
                    suma_c = v1[i] + v2[i];
                    for (int l = 1; l <= 4; i++) {
                        suma_c = v1[i] + v2[i];
                    }
                }
            }
        }
        System.out.println("A+B :[" + suma_a + "]" + "[" + suma_b + "],[" + suma_c + "]" + "[" + suma_d + "] ");

    }
}
