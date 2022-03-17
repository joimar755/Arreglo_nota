package Parcial_practico;

import java.util.Scanner;

public class Peaje {
    Scanner sc = new Scanner(System.in);

    int[] Cantvh = new int[1];
    int n = 0;

    /*
     * double vehiculo_normal = 7000;
     * double bus = 11000;
     * double Camion_pequeño = 12000;
     * double camion_grande = 24000;
     * double mula = 37000;
     */
    String[] Vehiculos = { "vehiculo_normal", "bus", "Camion_pequeño", "camion_grande", "mula" };
    int[] peajes = { 7000, 11000, 12000, 24000, 37000 };

    int a = 0, total = 0;
    int cantidad_vh = 0, veh_mayor = 0, veh_menor = 0, porcentaje = 0;

    public void Vehículo_normal() {
        for (int i = 0; i < Cantvh.length; i++) {
            System.out.println("ingrese cantidad vehiculos: ");
            n = sc.nextInt();

            System.out.println("nombre: " + Vehiculos[0]);

            Cantvh[i] = n;
            cantidad_vh += Cantvh[i];
            porcentaje = (n * cantidad_vh) / 100;
            a = n * peajes[0];
            total += a;
            System.out.println("Recaudo " + a);

        }
    }

    public void bus() {
        for (int i = 0; i < Cantvh.length; i++) {
            System.out.println("ingrese cantidad vehiculos: ");
            n = sc.nextInt();
            System.out.println("nombre: " + Vehiculos[1]);
            Cantvh[i] = n;
            cantidad_vh += Cantvh[i];
            porcentaje = (n * cantidad_vh) / 100;
            a = n * peajes[1];
            total += a;
            System.out.println("Recaudo " + a);
        }
    }

    public void Camion_pequeño() {
        for (int i = 0; i < Cantvh.length; i++) {
            System.out.println("ingrese cantidad vehiculos: ");
            n = sc.nextInt();
            System.out.println("nombre: " + Vehiculos[2]);
            Cantvh[i] = n;
            cantidad_vh += Cantvh[i];
            porcentaje = (n * 100) / 100;
            a = n * peajes[2];
            total += a;
            System.out.println("Recaudo " + a);
        }
    }

    public void camion_grande() {
        for (int i = 0; i < Cantvh.length; i++) {
            System.out.println("ingrese cantidad : ");
            n = sc.nextInt();
            System.out.println("nombre: " + Vehiculos[3]);
            Cantvh[i] = n;
            cantidad_vh += Cantvh[i];
            porcentaje = (n * cantidad_vh) / 100;
            a = n * peajes[3];
            total += a;
            System.out.println("Recaudo " + a);

        }
    }

    public void mula() {
        for (int i = 0; i < Cantvh.length; i++) {
            System.out.println("ingrese cantidad vehiculos: ");
            n = sc.nextInt();
            System.out.println("nombre: " + Vehiculos[4]);
            Cantvh[i] = n;
            cantidad_vh += Cantvh[i];
            porcentaje = (n * cantidad_vh) / 100;
            a = n * peajes[4];
            total += a;
            System.out.println("Recaudo " + a);
        }
    }

    public void reporte_estadistico() {

        System.out.println("cantidad: " + cantidad_vh);
        System.out.println("porcentaje: " + porcentaje);
        System.out.println("Recaudo_total: " + total);
    }

}
