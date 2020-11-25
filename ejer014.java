package co.edu.campusucc;

import java.util.Scanner;

public class ejer014 {

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
		
		
		
		int numero1,numero3,numero2,sume,numero4;
		
		
		System.out.println("numero 1");
		numero1 = leer.nextInt();
		System.out.println("numero 2");
		numero2 = leer.nextInt();
		
		System.out.println("numero 3");
		numero3 = leer.nextInt();
		
		System.out.println("numero 4");
		numero4 = leer.nextInt();
		
		sume = numero4+numero3+numero1+numero2;
		
		
		System.out.println("la suma de "+ numero1 + " + " + numero2 + " + " + numero3 + " + " + numero4 + " es: " + sume);
		System.out.println("Numero : "+ numero1  + numero2  + numero3 +  numero4 + " ..... la suma es: " + sume);
		System.out.println(sume);
		

	}
			
	}

