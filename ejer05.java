package co.edu.campusucc;

import java.util.Scanner;

public class ejer05 {

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
	
	
	int metroslongitud, metroscortados, terminac;

	metroslongitud = 12;
	metroscortados = 2;

	
	terminac = metroslongitud / metroscortados;
	
	System.out.println("la pieza se termina de cortar en "+terminac + " dias ");

	
}

}

