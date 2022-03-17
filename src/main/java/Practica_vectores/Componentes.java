/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SIN_TITULO.java."
package Practica_vectores;

import java.io.*;

public class Componentes {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int i;
		double res;
		double suma_a = 0;
		double suma_b = 0;
		double suma_c = 0;
		double suma_d = 0;
		double v1[];
		double v2[];
		v1 = new double[4];
		v2 = new double[4];

		for (i = 1; i <= v1.length; i++) {
			System.out.println(i + "digite el componente A");
			v1[i - 1] = Double.parseDouble(bufEntrada.readLine());
		}
		for (i = 1; i <= v2.length; i++) {
			System.out.println(i + "digite el componente B");
			v2[i - 1] = Double.parseDouble(bufEntrada.readLine());
		}
		for (i = 1; i <= v1.length; i++) {
			suma_a = v1[i - 1] + v2[i - 1];
		}

		for (i = 1; i <= v2.length; i++) {
			suma_b = v2[i - 1] + v1[i - 1];
		}
		for (i = 1; i <= v1.length; i++) {
			suma_c = v1[i - 1] + v2[i - 1];
		}
		for (i = 1; i <= v2.length; i++) {
			suma_d = v2[i - 1] + v1[i - 1];
		}

		System.out.println("A+B :[" + suma_a + "]" + "[" + suma_b + "],[" + suma_c + "]" + "[" + suma_d + "] ");
	}

}
