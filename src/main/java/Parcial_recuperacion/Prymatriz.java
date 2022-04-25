package Parcial_recuperacion;

import java.util.Scanner;

public class Prymatriz {
    public static void main(String[] args) {
        Matriz_letra L = new Matriz_letra();
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n\n\t\tMenu matriz\n"); // salto linea
            System.out.println("[1] Cargar_matriz");
            System.out.println("[2] Mostrar matriz");
            System.out.println("[3] Sumar_datos");
            System.out.println("[4] Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    L.Cargar_matriz();
                    break;
                case 2:
                    L.Imprimir_matriz();
                    break;
                case 3:
                    L.Imprimir_Letras();
                    break;
                case 4:
                    System.out.println("\n\n\t\tFin del programa");
                    break;

                default:
                    break;
            }
        } while (opcion != 4);
    }
}
