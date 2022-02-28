package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pseint {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a[];
		int aux;
		int i;
		int j;
		int n;
		// Se lee el tama�o del Vector
		System.out.println("digite tama�o del Vector");
		n = Integer.parseInt(bufEntrada.readLine());
		// Se dimensiona el tama�o del vector se le da un nombre al mismo para el caso
		// Vectos A de tama�o n
		a = new int[n];
		// ciclo que carga el vector (Se podria hacer con un m�todo aparte)
		for (i = 1; i <= n; i++) {
			System.out.println("Digite el dato para la posici�n " + i);
			a[i - 1] = (int) Math.floor(Math.random() * 100);
			System.out.println(a[i - 1]);
		}
		// Ciclos que permiten realizar los intercambios y ordenar por el Metodo de
		// Burbuja o Bubble Sort
		for (i = 1; i <= n - 1; i++) {
			for (j = 1; j <= n - 1; j++) {
				if (a[j - 1] < a[j]) {
					aux = a[j];
					a[j] = a[j - 1];
					a[j - 1] = aux;
					System.out.println("realizo el siguiente intercambio  " + a[j - 1] + "Con  " + a[j]);
				}
			}
		}
		// Ciclo que recorre el vector ya ordenado y lo imprime
		for (i = 1; i <= n; i++) {
			System.out.println("Vector ordenado " + a[i - 1]);
		}
	}

}
