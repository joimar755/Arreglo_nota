package Matriz_Ejercicios;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("digite tamaño"));
        int a[][] = new int[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = Integer.parseInt(JOptionPane.showInputDialog(""));
                System.out.println("[" + i + "]" + "[" + j + "]");

            }
        }
    }
}
