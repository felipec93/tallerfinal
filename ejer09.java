package co.edu.campusucc;

import java.util.Scanner;

public class ejer09 {
	public static void main(String[] args) {
		System.out.println(" 88888888888888888888888888888888888888888 ");
		System.out.println(" -  ___________________________________  +");
		System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -");
		System.out.println(" - |         FECHA: 03-noviembre-2020    | +");
		System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -");
		System.out.println(" - |              ID:  760728          | +");
		System.out.println(" + |___________________________________| -");
		System.out.println(" 88888888888888888888888888888888888888888");

		int numero1, numero2, salario, descuento, valorapagar;

		Scanner leer = new Scanner(System.in);
		System.out.println("lea el valor de salario de pedro ");
		numero1 = leer.nextInt();
		System.out.println("lea valor de descuento ");
		numero2 = leer.nextInt();

		salario = numero1;
		descuento = numero2;

		valorapagar = salario - descuento;

		System.out.println("leer valor a pagar a pedro: $" + valorapagar);
		

		System.out.println("lea el valor de salario de marta ");
		numero1 = leer.nextInt();
		System.out.println("lea valor de descuento ");
		numero2 = leer.nextInt();

		salario = numero1;
		descuento = numero2;

		valorapagar = salario - descuento;

		System.out.println("leer valor a pagar a marta:$" + valorapagar);
		

		System.out.println("lea el valor de salario de jose ");
		numero1 = leer.nextInt();
		System.out.println("lea valor de descuento ");
		numero2 = leer.nextInt();

		salario = numero1;
		descuento = numero2;

		valorapagar = salario - descuento;

		System.out.println("leer valor a pagar de jose:$" + valorapagar);

	}
}
