package Parcial_matriz;

public class Ejercicio2 {
    int n = 5;
    int a[][] = new int[n][n];
    int sumaP = 0;
    int sumaS = 0;
    int suma_t = 0;
    int suma_z = 0;
    int suma_u = 0;
    int suma_h = 0;
    int suma_F = 0;
    int suma_i = 0;
    int suma_c = 0;
    int fila1 = 0;
    int fila2 = 0;
    int fila3 = 0;
    int fila4 = 0;
    // int resta = a[a.length - 1][0];
    int mitad = a[0].length / 2;
    int mitad_f = a.length / 2;

    public void Cargar_matriz() {
        if (n % 2 != 0 && n % 2 != 0) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = (int) Math.floor(Math.random() * 100);
                }
            }
        } else {
            System.out.println("ingrese numero impar");
        }
    }

    public void Mostrar_matriz() {
        for (int i = 0; i < a.length; i++) {
            String resultado = "";
            for (int j = 0; j < a[0].length; j++) {
                resultado = resultado + "  " + a[i][j];
            }
            System.out.println("" + resultado);
        }
    }

    public void Sumar_datos() {
        for (int j = 0; j < a.length; j++) {
            fila1 += a[j][0];
            System.out.println(a[j][0]);

        }
        for (int j = 0; j < a.length; j++) {
            fila3 += a[j][a.length - 1];
            System.out.println(a[j][a.length - 1]);

        }

        for (int i = 0; i < a.length; i++) {
            fila2 += a[a.length - 1][i];
            // System.out.println("------------------");
            System.out.println(a[a.length - 1][i]);

        }
        System.out.println("------------------");
        for (int i = 0; i < a.length; i++) {
            fila4 += a[0][i];
            // System.out.println("------------------");
            // System.out.println(a[0][i]);

        }

        // diagonalPys
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

                if (i == j) {
                    // System.out.println("---------diagonal_principal----------");

                    // System.out.println(a[i][j]);
                    sumaP += a[i][j];
                }
                if ((i + j) == a.length - 1) {
                    // System.out.println("---------diagonal_secundaria----------");
                    // System.out.println(a[i][j]);
                    sumaS += a[i][j];
                }
                if (i == mitad_f) {
                    // System.out.println("---------mitad_columna----------");
                    // System.out.println(a[i][j]);
                    suma_F += a[i][j];

                }
                if (j == mitad_f) {
                    // System.out.println("---------mitad_fila----------");
                    System.out.println(a[i][j]);
                    suma_c += a[i][j];
                }

            }

        }

        suma_t = sumaP + sumaS;
        suma_z = fila1 + fila2 - a[a.length - 1][0];
        int s = suma_z;
        int f = fila3 - a[a.length - 1][a.length - 1];
        int f1 = fila4 - a[0][a.length - 1];
        suma_u = s + f;
        suma_h = fila1 + fila3 + suma_F - a[a.length / 2][a.length - 1] - a[a.length / 2][0];
        suma_i = fila2 + fila4 + suma_c - a[a.length - 1][a.length / 2] - a[0][a.length / 2];

        System.out.println("la suma diagonal en x: " + suma_t);
        System.out.println("la suma diagonal en l: " + suma_z);
        System.out.println("la suma diagonal en u: " + suma_u);
        System.out.println("la suma diagonal en H: " + suma_h);
        System.out.println("la suma diagonal en i: " + suma_i);

    }

}
