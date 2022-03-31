package Parcial_practico;

import java.util.Scanner;

public class Peaje {
    Scanner sc = new Scanner(System.in);

    int[] Cantvh = new int[1];
    int n;

    /*
     * double vehiculo_normal = 7000;
     * double bus = 11000;
     * double Camion_pequeño = 12000;
     * double camion_grande = 24000;
     * double mula = 37000;
     */
    String[] Vehiculos = { "vehiculo_normal", "bus", "Camion_pequeño", "camion_grande", "mula" }; // crear arreglo de la
                                                                                                  // categorias de
                                                                                                  // vehiculos
    int[] peajes = { 7000, 11000, 12000, 24000, 37000 };// arreglo precio de peajes

    int a = 0, total = 0;
    int cantidad_vh = 0, veh_mayor = 0, veh_menor = 0, porcentaje;
    String vh = "";
    String vh_m = "";

    public void Vehículo_normal() {
        for (int i = 0; i < Cantvh.length; i++) {
            System.out.println("ingrese cantidad vehiculos: ");
            n = sc.nextInt();

            System.out.println("nombre: " + Vehiculos[0]);

            Cantvh[i] = n; // guardar cantidad vehiculos
            cantidad_vh += Cantvh[i]; // sumar automaticamente la cantidad de vehiculos
            porcentaje = (cantidad_vh * 100) / n;
            a = n * peajes[0]; // multiplicar el recaudo
            total += a;// sumar automatica los peajes de cuantas veces tenga el numero n
            System.out.println("Recaudo " + a);

        }
        for (int i = 0; i < Cantvh.length; i++) {
            if (Cantvh[i] >= veh_mayor) {
                veh_mayor = Cantvh[i];
                vh = Vehiculos[0];
            }
            if (Cantvh[i] <= veh_mayor) {
                veh_menor = Cantvh[i];
                vh_m = Vehiculos[0];
            }
        }

    }

    public void bus() {
        for (int i = 0; i < Cantvh.length; i++) {
            System.out.println("ingrese cantidad vehiculos: ");
            n = sc.nextInt();
            System.out.println("nombre: " + Vehiculos[1]);
            Cantvh[i] = n;
            cantidad_vh += Cantvh[i];
            porcentaje = (cantidad_vh * 100) / n;
            a = n * peajes[1];
            total += a;
            System.out.println("Recaudo " + a);
        }
        for (int i = 0; i < Cantvh.length; i++) {
            if (Cantvh[i] >= veh_mayor) {
                veh_mayor = Cantvh[i];
                vh = Vehiculos[1];
            }
            if (Cantvh[i] <= veh_mayor) {
                veh_menor = Cantvh[i];
                vh_m = Vehiculos[1];
            }
        }
    }

    public void Camion_pequeño() {
        for (int i = 0; i < Cantvh.length; i++) {
            System.out.println("ingrese cantidad vehiculos: ");
            n = sc.nextInt();
            System.out.println("nombre: " + Vehiculos[2]);
            Cantvh[i] = n;
            cantidad_vh += Cantvh[i];
            porcentaje = (cantidad_vh * 100) / n;
            a = n * peajes[2];
            total += a;
            System.out.println("Recaudo " + a);
        }
        // buscar el mayor o el menor
        for (int i = 0; i < Cantvh.length; i++) {
            if (Cantvh[i] >= veh_mayor) {
                veh_mayor = Cantvh[i];
                vh = Vehiculos[2];
            }
            if (Cantvh[i] <= veh_mayor) {
                veh_menor = Cantvh[i];
                vh_m = Vehiculos[2];
            }
        }
    }

    public void camion_grande() {
        for (int i = 0; i < Cantvh.length; i++) {
            System.out.println("ingrese cantidad : ");
            n = sc.nextInt();
            System.out.println("nombre: " + Vehiculos[3]);
            Cantvh[i] = n;
            cantidad_vh += Cantvh[i];
            porcentaje = (cantidad_vh * 100) / n;
            a = n * peajes[3];
            total += a;
            System.out.println("Recaudo " + a);
        }
        // buscar el mayor o el menor
        for (int i = 0; i < Cantvh.length; i++) {
            if (Cantvh[i] >= veh_mayor) {
                veh_mayor = Cantvh[i];
                vh = Vehiculos[3];
            }
            if (Cantvh[i] <= veh_mayor) {
                veh_menor = Cantvh[i];
                vh_m = Vehiculos[3];
            }
        }
    }

    public void mula() {
        for (int i = 0; i < Cantvh.length; i++) {
            System.out.println("ingrese cantidad vehiculos: ");
            n = sc.nextInt();
            System.out.println("nombre: " + Vehiculos[4]);
            Cantvh[i] = n;
            porcentaje = (cantidad_vh * 100) / n;
            a = n * peajes[4];
            total += a;
            System.out.println("Recaudo " + a);
        }
        // buasar ek mayor o el menor
        for (int i = 0; i < Cantvh.length; i++) {
            if (Cantvh[i] >= veh_mayor) {
                veh_mayor = Cantvh[i];
                vh = Vehiculos[4];
            }
            if (Cantvh[i] <= veh_mayor) {
                veh_menor = Cantvh[i];
                vh_m = Vehiculos[4];
            }
        }
    }

    public void reporte_estadistico() {
        System.out.println("\n\n\t\tReporte Estadisticos");
        System.out.println("cantidad: " + cantidad_vh);
        System.out.println("porcentaje: " + porcentaje);
        System.out.println("Recaudo_total: " + total);
        System.out.println("vehículos que mas pasó por el peaje: " + veh_mayor + " " + (vh) + "");
        System.out.println("vehículos que menos pasó por el peaje: " + veh_menor + " " + (vh_m) + "");
    }

}
