package Matriz_Ejercicios;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Ejercicio1 m = new Ejercicio1();
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n\n\t\tMenu matriz\n");
            System.out.println("[1] Cargar_matriz");
            System.out.println("[2] Mostrar matriz");
            System.out.println("[3] Sumar_matriz");
            System.out.println("[4] Sumar_Columnas");
            System.out.println("[5] Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    m.Cargar_matriz();
                    break;
                case 2:
                    m.Mostrar_matriz();
                    break;
                case 3:
                    m.Sumar_matriz();
                    break;
                case 4:
                    m.Sumar_Columas_Y_Filas();
                    break;
                case 5:
                    System.out.println("\n\n\t\tFin del programa");
                    break;

                default:
                    break;
            }
        } while (opcion != 5);
    }
}
