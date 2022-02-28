package Array;

import java.util.Scanner;

public class Arreglo {
    int[] n = new int[6];
    int[] m = new int[4];
    int[] c = new int[10];

    public void Cargar_array() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese 6 numeros");
        for (int i = 0; i < n.length; i++) {
            System.out.println("ingrese número " + (i + 1));
            n[i] = teclado.nextInt();
            c[i] = n[i]; // copiar los numeros en otro arreglo
        }
        System.out.println("Ingrese 4 numeros");
        for (int i = 0; i < m.length; i++) {
            System.out.println("ingrese número " + (i + 1));
            m[i] = teclado.nextInt();
            c[i + n.length] = m[i]; // suma de los arreglos
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println("imprimiendo arreglo..." + c[i]); // imprimir arreglo
        }
    }

    // ordenamiento burbuja
    public void Ordenar_burbuja() {
        int aux;
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1; j++) {
                if (c[j] > c[j + 1]) {
                    aux = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = aux;
                }
            }
        }
        System.out.println("\n\n\t\tOrdenamiento Burbuja");
        for (int i = 0; i < c.length; i++) {
            System.out.println(" - " + c[i]); // imprimir arreglo
        }

    }

    // ordenamiento seleccion
    public void Ordenar_seleccion() {
        int aux;
        int min;
        for (int i = 0; i < c.length; i++) {
            min = i;
            for (int j = i + 1; j < c.length; j++) {
                if (c[j] < c[min]) {
                    min = j;
                }

            }
            aux = c[i];
            c[i] = c[min];
            c[min] = aux;
        }
        System.out.println("\n\n\t\tOrdenamiento Seleccion creciente: ");
        for (int i = 0; i < c.length; i++) {
            System.out.println(" - " + c[i]); // imprimir arreglo
        }
        System.out.println("\n\n\t\tOrdenamiento Seleccion decreciente: ");
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.println(" - " + c[i]); // imprimir arreglo
        }
    }

    // ordenamiento insercion
    public void Ordenar_insercion() {

    }

    // ordenamiento shell
    public void Ordenar_shell() {

    }

    // ordenamiento quicksort
    public void Ordenar_quicksort() {

    }

}
