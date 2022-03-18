package Parcial_practico;

import java.util.Scanner;

public class Princ {
    public static void main(String[] args) {
        Peaje p = new Peaje();
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n\n\t\tPEAJES\n");
            System.out.println("[1] Vehículo_normal");
            System.out.println("[2] bus");
            System.out.println("[3] Camion_pequeño");
            System.out.println("[4] camion_grande");
            System.out.println("[5] mula");
            System.out.println("[6] reporte_estadistico");
            System.out.println("[7] salir");
            System.out.println("\n\n\t\tIngrese una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    p.Vehículo_normal();
                    break;
                case 2:
                    p.bus();
                    break;
                case 3:
                    p.Camion_pequeño();
                    break;
                case 4:
                    p.camion_grande();
                    break;
                case 5:
                    p.mula();
                    break;
                case 6:
                    p.reporte_estadistico();
                    break;
                case 7:
                    System.out.println("\n\n\t\tFin del programa");
                    break;

                default:
                    break;
            }
        } while (opcion != 7);
    }
}
