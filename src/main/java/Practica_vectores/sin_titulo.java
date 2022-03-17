/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int i;
		double suma_a;
		double suma_b;
		double suma_c;
		double suma_d;
		double v1[];
		double v2[];
		v1 = new double[4];
		v2 = new double[4];
		for (i = 1; i <= 4; i++) {
			System.out.println(i + "digite el componente A");
			v1[i - 1] = Double.parseDouble(bufEntrada.readLine());
		}
		for (i = 1; i <= 4; i++) {
			System.out.println(i + "digite el componente B");
			v2[i - 1] = Double.parseDouble(bufEntrada.readLine());
		}
		for (i = 1; i <= 2; i++) {
			suma_a = v1[i - 1] + v2[i - 1];
			for (i = 2; i <= 3; i++) {
				suma_b = v1[i - 1] + v2[i - 1];
				for (i = 3; i <= 4; i++) {
					suma_c = v1[i - 1] + v2[i - 1];
					for (i = 1; i <= 4; i++) {
						suma_d = v1[i - 1] + v2[i - 1];
					}
				}
			}
		}
		System.out.println("A+B :[" + suma_a + "]" + "[" + suma_b + "],[" + suma_c + "]" + "[" + suma_d + "] ");
	}

}
