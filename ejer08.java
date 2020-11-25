package co.edu.campusucc;

import java.util.Scanner;

public class ejer08 {
	public static void main(String[] args) {
		System.out.println(" 88888888888888888888888888888888888888888 ");
		System.out.println(" -  ___________________________________  +" );
		System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -" );
		System.out.println(" - |         FECHA: 03-noviembre-2020    | +" );
		System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -" );
		System.out.println(" - |              ID:  760728          | +" );
		System.out.println(" + |___________________________________| -" );
		System.out.println(" 88888888888888888888888888888888888888888" );
		
		double numero1, numero2, numero3, nota1, nota2, nota3;
		double notafinal;

		Scanner leer = new Scanner(System.in);

		System.out.println("lea la nota1 ");
		numero1 = leer.nextDouble();
		System.out.println("lea nota2 ");
		numero2 = leer.nextDouble();
		System.out.println("lea nota3 ");
		numero3 = leer.nextDouble();

		nota1 = numero1 * 30 / 100;
		nota2 = numero2 * 30 / 100;
		nota3 = numero3 * 40 / 100;
		notafinal = nota1 + nota2 + nota3;

		System.out.println("leer valor de nota1:" + nota1);
		System.out.println("leer valor de nota2:" + nota2);
		System.out.println("leer valor de nota3:" + nota3);
		System.out.println("nota final de pedro" + notafinal);
		
		
		System.out.println("lea la nota1 ");
		numero1 = leer.nextDouble();
		System.out.println("lea nota2 ");
		numero2 = leer.nextDouble();
		System.out.println("lea nota3 ");
		numero3 = leer.nextDouble();

		nota1 = numero1 * 30 / 100;
		nota2 = numero2 * 30 / 100;
		nota3 = numero3 * 40 / 100;
		notafinal = nota1 + nota2 + nota3;
		
		System.out.println("leer valor de nota1:" + nota1);
		System.out.println("leer valor de nota2:" + nota2);
		System.out.println("leer valor de nota3:" + nota3);
		System.out.println("nota final de luis es" + notafinal);

		System.out.println("lea la nota1 ");
		numero1 = leer.nextDouble();
		System.out.println("lea nota2 ");
		numero2 = leer.nextDouble();
		System.out.println("lea nota3 ");
		numero3 = leer.nextDouble();
		

		nota1 = numero1 * 30 / 100;
		nota2 = numero2 * 30 / 100;
		nota3 = numero3 * 40 / 100;
		notafinal = nota1 + nota2 + nota3;

		

		System.out.println("leer valor de nota1:" + nota1);
		System.out.println("leer valor de nota2:" + nota2);
		System.out.println("leer valor de nota3:" + nota3);
		System.out.println("nota final de mariana es" + notafinal);

	}

}


