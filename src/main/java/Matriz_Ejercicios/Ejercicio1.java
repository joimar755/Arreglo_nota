package Matriz_Ejercicios;

import java.io.*;
import java.math.*;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public void Cargar_matriz() {
        int a[][];
        double i;
        double j;
        int n;
        double suma = 0;
        double sumai = 0;
        System.out.println("digite tama�o matriz");
        n = Integer.parseInt(JOptionPane.showInputDialog("digite tamaño"));
        a = new int[n][n];
        suma = 0;
        sumai = 0;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.println("digite un dato  la casilla [" + i + "]" + "[" + j + "]");
                a[n - 1][n - 1] = (int) Math.floor(Math.random() * 100);
                System.out.println(a[n - 1][n - 1]);
                suma = suma + a[n - 1][n - 1];
                if (a[n - 1][n - 1] % 2 != 0) {
                    sumai = sumai + a[n - 1][n - 1];
                }
            }
        }
        System.out.println("la suma total de la matriz " + suma);
        System.out.println("suma de los impar " + sumai);
    }

    public void Mostrar_matriz() {

    }

    public void Sumar_matriz() {

    }
}
