package Array;

import java.util.Scanner;

public class Arr_n {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] nombres = new String[35]; // arreglo nombre estudiantes
        double[] notas = new double[35]; // guardar la definitiva de las notas

        double n1, n2, n3;

        int ganaron = 0; // contador de estudiantes que aprobaron
        int perdieron = 0; // contador de estudiantes que reprobaron

        // pedir los nombres de los estudiantes
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno: " + (i + 1));
            System.out.print("Nombre: ");
            nombres[i] = teclado.nextLine();
            System.out.print("Nota 1: ");
            n1 = Double.parseDouble(teclado.nextLine());
            System.out.print("Nota 2: ");
            n2 = Double.parseDouble(teclado.nextLine());
            System.out.print("Nota 3: ");
            n3 = Double.parseDouble(teclado.nextLine());

            notas[i] = (n1 + n2 + n3) / 3; // promedio
            System.out.println(" " + notas[i]);

        }

        double masAlta = Double.MIN_VALUE; // nota mas alta
        double masbajo = Double.MAX_VALUE; // nota mas baja
        String alumno = ""; // nombre del alumno que tiene la nota mas alta
        String alumno_b = ""; // nombre del alumno que tiene la nota mas baja
        double Suma_total = 0; // suma de todas las notas

        // buscar la nota mas alta
        for (int i = 0; i < notas.length; i++) {

            if (notas[i] >= masAlta) {
                masAlta = notas[i];
            }

            if (notas[i] <= masbajo) {
                masbajo = notas[i];
            }

            Suma_total += notas[i];

        }

        for (int i = 0; i < notas.length; i++) {
            if (masAlta == notas[i]) {
                alumno = nombres[i];
            }

            if (masbajo == notas[i]) {
                alumno_b = nombres[i];
            }
            //
            if (notas[i] >= 3.0) {
                ganaron += 1;
            }
            if (notas[i] < 3.0) {
                perdieron += 1;
            }
        }

        double promedio_total = Suma_total / notas.length; // promedio de todas las notas

        System.out.println("El promedio mas alto es: " + masAlta);
        System.out.println("El alumno " + (alumno) + " tiene el promedio mas alto.");
        System.out.println("---------------------------------------------------------");
        System.out.println("el promedio mas bajo es: " + masbajo);
        System.out.println("El alumno " + (alumno_b) + " tiene el promedio mas bajo.");
        System.out.println("---------------------------------------------------------");
        System.out.println("ganaron:" + ganaron);
        System.out.println("perdieron:" + perdieron);
        System.out.println("promedio del curso: " + promedio_total);

    }

}
