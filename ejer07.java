package co.edu.campusucc;

import java.util.Scanner;

public class ejer07 {
	public static void main(String[] args) {
		System.out.println(" 88888888888888888888888888888888888888888 ");
		System.out.println(" -  ___________________________________  +" );
		System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -" );
		System.out.println(" - |         FECHA: 03-noviembre-2020    | +" );
		System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -" );
		System.out.println(" - |              ID:  760728          | +" );
		System.out.println(" + |___________________________________| -" );
		System.out.println(" 88888888888888888888888888888888888888888" );
		
		int numero1, numero2, suma, resta, producto;
		int promedio;

		Scanner leer = new Scanner(System.in);

		System.out.println("lea el primer numero ");
		numero1 = leer.nextInt();
		System.out.println("lea el segundo numero ");
		numero2 = leer.nextInt();

		suma = numero1 + numero2;
		resta = numero1 - numero2;
		producto = numero1 * numero2;
		promedio = suma / 2;

		System.out.println("el resultado de la suma es:"+suma);
		System.out.println("el resulatdo de la resta es:"+resta);
		System.out.println("el resultado del producto es:"+producto);
		System.out.println("el resultado promedio es :"+promedio);
	}

}


