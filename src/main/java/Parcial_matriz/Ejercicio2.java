package Parcial_matriz;

public class Ejercicio2 {
    int n = 5;
    int a[][] = new int[n][n];
    int sumaP = 0;
    int sumaS = 0;
    int suma_t = 0;

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
        // diagonalPys
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j) {
                    // System.out.println("---------diagonal_principal----------");

                    System.out.println(a[i][j]);
                    sumaP += a[i][j];
                }
                if ((i + j) == a.length - 1) {
                    // System.out.println("---------diagonal_secundaria----------");
                    System.out.println(a[i][j]);
                    sumaS += a[i][j];
                }

            }
        }
        suma_t = sumaP + sumaS;
        System.out.println("la suma diagonal en x: " + suma_t);

    }

}
