package Parcial_matriz;

import java.util.Scanner;

public class MenuM {
    public static void main(String[] args) {
        Ejercicio2 m = new Ejercicio2();
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n\n\t\tMenu matriz\n");
            System.out.println("[1] Cargar_matriz");
            System.out.println("[2] Mostrar matriz");
            System.out.println("[3] Sumar_datos");
            System.out.println("[4] Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    m.Cargar_matriz();
                    break;
                case 2:
                    m.Mostrar_matriz();
                    break;
                case 3:
                    m.Sumar_datos();
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
