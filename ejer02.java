package co.edu.campusucc;

import java.util.Scanner;

public class ejer02 {

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

		int N, aux, inverso = 0, cifra;
		do {
			System.out.print("Digite mas de un digito para saber si es capic�a ");
			N = leer.nextInt();
		} while (N < 10);

		aux = N;
		while (aux != 0) {
			cifra = aux % 10;
			inverso = inverso * 10 + cifra;
			aux = aux / 10;
		}

		if (N == inverso) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}
	}
}
