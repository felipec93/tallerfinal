package co.edu.campusucc;

import java.util.Scanner;

public class ejer06 {

	public static void main(String[] args) {
		System.out.println(" 88888888888888888888888888888888888888888 ");
		System.out.println(" -  ___________________________________  +");
		System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -");
		System.out.println(" - |         FECHA: 03-noviembre-2020    | +");
		System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -");
		System.out.println(" - |              ID:  760728          | +");
		System.out.println(" + |___________________________________| -");
		System.out.println(" 88888888888888888888888888888888888888888");

		int numero1, numero2, resultado1, resultado2;

		Scanner leer = new Scanner(System.in);

		System.out.println("lea el primer numero ");
		numero1 = leer.nextInt();
		System.out.println("lea el segundo numero ");
		numero2 = leer.nextInt();

		resultado1 = numero1 * numero1 * numero1;
		resultado2 = numero2 * numero2 * numero2;

		System.out.println(" El cubo de " + numero1 + " su  cubo es: " + resultado1);
		System.out.println(" El cubo de " + numero2 + " su  cubo es: " + resultado2);
	}

}
