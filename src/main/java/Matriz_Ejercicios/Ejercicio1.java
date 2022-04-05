package Matriz_Ejercicios;

import java.io.*;
import java.math.*;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    int n = 3;
    int a[][] = new int[n][n];
    int mitad = a[0].length / 2;
    int mitad_f = a.length / 2;

    double suma = 0;
    double sumai = 0, sumaC = 0, sumaF = 0;

    public void Cargar_matriz() {

        // n = Integer.parseInt(JOptionPane.showInputDialog("ingrese tamaño"));
        if (n % 2 != 0 && n % 2 != 0) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = (int) Math.floor(Math.random() * 100);
                }
            }
        } else {
            System.out.println("ingrese numero impar");
        }

    }

    public void Mostrar_matriz() {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("[" + i + "]" + "[" + j + "]");
                System.out.println(a[i][j]);
            }
        }
        System.out.println("-----------------------------------------");
        System.out.println(Arrays.deepToString(a));
        System.out.println("-----------------------------------------");

        for (int i = 0; i < a.length; i++) {
            String resultado = "";
            for (int j = 0; j < a[0].length; j++) {
                resultado = resultado + "  " + a[i][j];
            }
            System.out.println("" + resultado);
        }
    }

    public void Sumar_matriz() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                suma = suma + a[i][j];
                if (a[i][j] % 2 != 0) {
                    sumai = sumai + a[i][j];
                }
            }
        }
        System.out.println("la suma total de la matriz " + suma);
        System.out.println("suma de los impar " + sumai);
    }

    public void Sumar_Columas() {
        System.out.println("---------------------------------------------");
        // diagonal (j - i) < mitad && (i - j) < mitad)

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == mitad_f) {
                    System.out.println(a[i][j]);
                    sumaC += a[i][j];
                }
                if (j == mitad) {
                    System.out.println(a[i][j]);
                    sumaF += a[i][j];

                }

            }

        }

        System.out.println("suma fila: " + sumaC + " suma columna: " + sumaF);

    }

}
