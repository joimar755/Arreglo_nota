/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SIN_TITULO.java."

import java.io.*;
import java.math.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a[][];
		double i;
		double j;
		int n;
		double suma=0;
		double sumai=0;
		System.out.println("digite tama�o matriz");
		n = Integer.parseInt(bufEntrada.readLine());
		a = new int[n][n];
		suma = 0;
		sumai = 0; 
		
		for (i=1;i<=n;i++) {
			for (j=1;j<=n;j++) {
				System.out.println("digite un dato  la casilla ["+i+"]"+"["+j+"]");
				a[n-1][n-1] = Math.floor(Math.random()*100);
				System.out.println(a[n-1][n-1]);
				suma = suma+a[n-1][n-1];
				if (a[n-1][n-1]%2!=0) {
					sumai = sumai+a[n-1][n-1];
				}
			}
		}
		System.out.println("la suma total de la matriz "+suma);
		System.out.println("suma de los impar "+sumai); 
	}


}

