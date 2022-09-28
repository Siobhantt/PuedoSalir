package puedosalir;

import java.util.Scanner;

public class PuedoSalir {

	public static void main(String[] args) {
		/*Diseñar un algoritmo que nos indique si podemos salir a la calle. 
		 * Existen aspectos que influirán en esta decisión: solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. 
			Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle: el hecho de tener que ir a la biblioteca.*/

		boolean lluvia;
		boolean tareaFin;
		boolean biblioteca; 
		boolean puedoSalir;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Esta lloviendo?");
		lluvia = leer.nextBoolean();
		
		System.out.println("Has terminado los deberes?");
		tareaFin = leer.nextBoolean();
		
		System.out.println("Tengo que ir a la biblioteca?");
		biblioteca = leer.nextBoolean();
		
		puedoSalir = (!lluvia && tareaFin) || biblioteca;
		
		System.out.println("Puedo salir?: " + (puedoSalir ? "Si" : "No"));
		
		leer.close();
	
		// TODO Auto-generated method stub

	}

}
