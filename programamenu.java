package co.edu.campusucc;

import java.util.Random;
import java.util.Scanner;

public class programamenu {

	public static void main(String[] args) {
	
	System.out.println(" 88888888888888888888888888888888888888888 ");
	System.out.println(" -  ___________________________________  +" );
	System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -" );
	System.out.println(" - |         FECHA: 24-noviembre-2020    | +" );
	System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -" );
	System.out.println(" - |              ID:  760728          | +" );
	System.out.println(" + |___________________________________| -" );
	System.out.println(" 88888888888888888888888888888888888888888" );
	
	System.out.println("digite 1 para programa ejer");
	System.out.println("digite 2 para programa ejer01");
	System.out.println("digite 3 para programa ejer02");
	System.out.println("digite 4 para programa ejer03");
	System.out.println("digite 5 para programa ejer04");
	System.out.println("digite 6 para programa ejer05");
	System.out.println("digite 7 para programa ejer06");
	System.out.println("digite 8 para programa ejer07");
	System.out.println("digite 9 para programa ejer08");
	System.out.println("digite 10 para programa ejer09");
	System.out.println("digite 11 para programa ejer010");
	System.out.println("digite 12 para programa ejer011");
	System.out.println("digite 13 para programa ejer012");
	System.out.println("digite 14 para programa ejer013");
	System.out.println("digite 15 para programa ejer014");
	
	try (Scanner scan = new Scanner(System.in)){
		int opcionprograma;
		String comando ="";
		System.out.println("ingrese el numero del programa a ejecutar: ");
		opcionprograma = scan.nextInt();
		
		switch (opcionprograma) {
		case 1 :
			new ejer().main(args);
			
			break;
		case 2 :	
			new ejer01().main(args);
			break;
		case 3 :
			new ejer02().main(args);
			break;
		case 4 :
			new ejer03().main(args);
			break;
		case 5 :	
			new ejer04().main(args);
			break;
		case 6 :
			new ejer05().main(args);
			break;
		case 7 :
			new ejer06().main(args);
			break;
		case 8 :	
			new ejer07().main(args);
			break;
		case 9 :
			new ejer08().main(args);
			break;
		case 10 :
			new ejer09().main(args);
			break;
		case 11 :	
			new ejer010().main(args);
			break;
		case 12 :
			new ejer011().main(args);
			break;
		case 13 :
			new ejer012().main(args);
			break;
		case 14 :	
			new ejer013().main(args);
			break;
		case 15 :
			new ejer014().main(args);
			break;
			
			default :
		    try 
			{
			Runtime.getRuntime().exec(comando);
			}
			catch (Exception e)
			{
				System.out.println("Error en el metodo exec () ");
				e.printStackTrace();
			}
			
		
	}
	}
}
}