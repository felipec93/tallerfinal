package co.edu.campusucc;

import java.util.Scanner;

public class ejer03 {
	public static void main(String[] args) {
		System.out.println(" 88888888888888888888888888888888888888888 ");
		System.out.println(" -  ___________________________________  +");
		System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -");
		System.out.println(" - |       FECHA: 19-noviembre-2020    | +");
		System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -");
		System.out.println(" - |              ID:   760728         | +");
		System.out.println(" + |___________________________________| -");
		System.out.println(" 88888888888888888888888888888888888888888");
		
		Scanner leer = new Scanner(System.in); 

		int maximo;
		int num;
		
		int cont, valor = 0, suma = 0;

		System.out.println("Inserte el m�ximo de n�meros: ");
		maximo = leer.nextInt();

		for (cont = 0; cont < maximo; cont++) {
			System.out.println("Inserte un n�mero: ");
			num = leer.nextInt();
			valor = valor + num;

		}

		System.out.println("numero " + valor);

	}
}
