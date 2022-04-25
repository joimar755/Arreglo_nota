package Parcial_recuperacion;

public class Matriz_letra {
    int sumaP = 0, sumaS = 0, sumat = 0, sumal = 0, sumau = 0, sumah = 0, sumaF = 0, sumai = 0, sumac = 0, fila1 = 0,
            fila2 = 0, fila3 = 0, fila4 = 0, n = 5;
    int a[][] = new int[n][n];

    int mitad = a[0].length / 2;
    int mitadf = a.length / 2;

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

    public void Imprimir_matriz() {
        for (int i = 0; i < a.length; i++) {
            String resultado = "";
            for (int j = 0; j < a[0].length; j++) {
                resultado = resultado + "  " + a[i][j];
            }
            System.out.println("" + resultado);
        }
    }

    public void Imprimir_Letras() { // suma de las letras
        for (int j = 0; j < a.length; j++) { // fila
            fila1 += a[j][0]; // suma de la primera columna

            System.out.println(a[j][0]);

        }
        for (int j = 0; j < a.length; j++) { // fila
            fila3 += a[j][a.length - 1]; // suma de la ultima columna

        }

        for (int i = 0; i < a.length; i++) { // columna
            fila2 += a[a.length - 1][i]; // suma de la ultima fila

        }

        for (int i = 0; i < a.length; i++) { // columna
            for (int j = 0; j < a[0].length; j++) { // fila

                if (i == j) {

                    sumaP += a[i][j];
                }
                if ((i + j) == a.length - 1) {

                    sumaS += a[i][j];
                }
                if (i == mitadf) {

                    sumaF += a[i][j];

                }
                if (j == mitad) {

                    System.out.println(a[i][j]);
                    sumac += a[i][j];
                }

            }

        }
        sumat = sumaP + sumaS;
        int sumaz = fila1 + fila2 - a[a.length - 1][0];
        int s = sumaz;
        int f = fila3 - a[a.length - 1][a.length - 1];
        int sumau = s + f;
        int sumah = fila1 + fila3 + sumaF - a[a.length / 2][a.length - 1] - a[a.length / 2][0];
        int sumai = fila2 + fila4 + sumac - a[a.length - 1][a.length / 2] - a[0][a.length / 2];

        System.out.println("la suma diagonal en x: " + sumat);
        System.out.println("la suma diagonal en l: " + sumaz);
        System.out.println("la suma diagonal en u: " + sumau);
        System.out.println("la suma diagonal en H: " + sumah);
        System.out.println("la suma diagonal en i: " + sumai);

    }

}
