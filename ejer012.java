package co.edu.campusucc;

import java.util.Scanner;

public class ejer012 {

public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println(" 88888888888888888888888888888888888888888 ");
		System.out.println(" -  ___________________________________  +" );
		System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -" );
		System.out.println(" - |         FECHA: 03-noviembre-2020    | +" );
		System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -" );
		System.out.println(" - |              ID:  760728          | +" );
		System.out.println(" + |___________________________________| -" );
		System.out.println(" 88888888888888888888888888888888888888888" );

		int paginas, minutos, numero2;

		System.out.println("minutos utilizados para escribir");
		numero2 = leer.nextInt();
		System.out.println("cantidad de paginas escritas ");
		minutos = leer.nextInt();

		paginas = numero2 * 15 / 30;
		minutos = 30 * 75 / 15;

		System.out.println("cantidad de paginas escritas en dos horas :" + paginas);
		System.out.println("cantidad de minutos utilizados para escribir 75 paginas :" + minutos);

	}

}
