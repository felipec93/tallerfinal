package co.edu.campusucc;

import java.util.Scanner;

public class ejer010 {

	public static void main(String[] args) {
		System.out.println(" 88888888888888888888888888888888888888888 ");
		System.out.println(" -  ___________________________________  +");
		System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -");
		System.out.println(" - |         FECHA: 03-noviembre-2020    | +");
		System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -");
		System.out.println(" - |              ID:  760728          | +");
		System.out.println(" + |___________________________________| -");
		System.out.println(" 88888888888888888888888888888888888888888");
		double numero1, numero2, costo, pago, regreso;

		Scanner leer = new Scanner(System.in);

		System.out.println("lea valor de costo ");
		numero1 = leer.nextDouble();

		System.out.println("lea valor de pago");
		numero2 = leer.nextDouble();

		costo = numero1;
		pago = numero2;
		regreso = pago - costo;

		System.out.println("leer valor a devolver:" + regreso);

		// pago2

		System.out.println("lea valor de costo ");
		numero1 = leer.nextDouble();

		System.out.println("lea valor de pago");
		numero2 = leer.nextDouble();

		costo = numero1;
		pago = numero2;

		regreso = pago - costo;

		System.out.println("leer valor a devolver:" + regreso);

	}

}
