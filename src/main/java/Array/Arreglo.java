package Array;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arreglo {
    int[] n = new int[6];
    int[] m = new int[4];
    int[] c = new int[10];
    int pos;
    int salto;
    int j;
    int k;

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
                    aux = c[j]; // intercambiar
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
        int aux;
        for (int i = 0; i < c.length; i++) {
            pos = i;
            aux = c[i]; // numero actual
            while ((pos > 0) && (c[pos - 1] > aux)) {
                c[pos] = c[pos - 1];
                pos--;
            }
            c[pos] = aux; // refrescar el numero
        }
        System.out.println("\n\n\t\tOrdenamiento Insercion creciente: ");
        for (int i = 0; i < c.length; i++) {
            System.out.println(" - " + c[i]); // imprimir arreglo
        }
        System.out.println("\n\n\t\tOrdenamiento Insercion decreciente: ");
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.println(" - " + c[i]); // imprimir arreglo
        }

    }

    // ordenamiento shell
    public void Ordenar_shell() {

        salto = c.length / 2;
        while (salto > 0) {
            for (int i = salto; i < c.length; i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (c[j] < c[k]) {
                        j = -1;

                    } else {
                        int aux = c[j];
                        c[j] = c[k];
                        c[k] = aux;
                        j -= salto;
                    }

                }
            }
            salto = salto / 2;
        }
        System.out.println("\n\n\t\tOrdenamiento Shell creciente: ");
        for (int i = 0; i < c.length; i++) {
            System.out.println(" - " + c[i]); // imprimir arreglo
        }

    }

    public void quick(int[] arreglo, int primero, int ultimo) {
        int i = primero;
        int j = ultimo;
        int aux;
        int pivote = arreglo[(primero + ultimo) / 2];
        do {
            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            if (i <= j) {
                aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            quick(arreglo, primero, j);
        }
        if (i < ultimo) {
            quick(arreglo, i, ultimo);
        }
        Ordenar_quicksort();

    }

    // ordenamiento quicksort

    public void Ordenar_quicksort() {
        System.out.println("\n\n\t\tOrdenamiento Quicksort creciente: ");
        for (int i = 0; i < c.length; i++) {
            System.out.println(" - " + c[i]); // imprimir arreglo
        }

    }

    public void busqueda_binaria() {
        int dato, inf, sup, mitad, i;
        boolean band = false;
        System.out.println("\n\n\t\tBusqueda Binaria");

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar"));
        inf = 0; // limite inferior
        sup = c.length; // limite superior
        i = 0; // contador
        mitad = (inf + sup) / 2;
        while (inf <= sup && i < c.length) {
            if (c[mitad] == dato) {
                band = true;
                break;
            }
            if (c[mitad] > dato) {
                sup = mitad;
                mitad = (inf + sup) / 2;
            }
            if (c[mitad] < dato) {
                inf = mitad;
                mitad = (inf + sup) / 2;
            }
            i++;

        }
        if (band == true) {
            System.out.println("\n\n\t\tEl numero " + dato + " se encuentra en la posicion " + mitad);
        } else {
            System.out.println("\n\n\t\tEl numero " + dato + " no se encuentra en el arreglo");
        }
    }

    public void busqueda_secuencial() {
        int dato, i;
        boolean band = false;
        System.out.println("\n\n\t\tBusqueda Secuencial");
        System.out.println("\n\n\t\tIngrese el numero a buscar: ");
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar"));
        i = 0;
        while (i < c.length) {
            if (c[i] == dato) {
                band = true;
                break;
            }
            i++;
        }
        if (band == true) {
            System.out.println("\n\n\t\tEl numero " + dato + " se encuentra en la posicion " + i);
        } else {
            System.out.println("\n\n\t\tEl numero " + dato + " no se encuentra en el arreglo");
        }

    }

}
