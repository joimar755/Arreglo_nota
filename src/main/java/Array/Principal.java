package Array;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Arreglo Obj = new Arreglo();

        int Opcion = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("\n\n\t\tMetodo Ordenamiento\n");
            System.out.println("[1] Cargar el arreglo");
            System.out.println("[2] Ordenar burbuja");
            System.out.println("[3] Ordenar seleccion");
            System.out.println("[4] Ordenar insercion");
            System.out.println("[5] Ordenar shell");
            System.out.println("[6] Ordenar quicksort");
            System.out.println("[7] busqueda binaria");
            System.out.println("[8] Ordenar seleccion");
            System.out.println("[9] Salir");
            System.out.println("\n\n\t\tIngrese una opcion: ");
            Opcion = teclado.nextInt();

            switch (Opcion) {
                case 1:
                    Obj.Cargar_array();
                    break;
                case 2:
                    Obj.Ordenar_burbuja();
                    break;
                case 3:
                    Obj.Ordenar_seleccion();
                    break;
                case 4:
                    Obj.Ordenar_insercion();
                    break;
                case 5:
                    Obj.Ordenar_shell();
                    break;
                case 6:
                    Obj.Ordenar_quicksort();
                    break;
                case 7:
                    Obj.busqueda_binaria();
                    break;
                case 8:
                    Obj.busqueda_secuencial();
                    break;
                case 9:
                    System.out.println("\n\n\t\tFin del programa");
                    break;

                default:
                    break;
            }
        } while (Opcion != 9);

    }
}
