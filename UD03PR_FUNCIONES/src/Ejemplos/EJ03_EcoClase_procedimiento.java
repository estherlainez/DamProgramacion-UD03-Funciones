package Ejemplos;

import java.util.Scanner;

public class EJ03_EcoClase_procedimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ejemplo de procedimiento*/
		
		Scanner teclado= new Scanner (System.in);
		
		System.out.print("Introduzca tu nombre: ");
		String nombre=teclado.nextLine();
		
		System.out.print("Introduzca el numero de veces que muestra hola: ");
		int numeroVeces=teclado.nextInt();
		
		/*llamar a la funcion*/
	   Saludar(numeroVeces, nombre);
	}

	/*declaracion de la funcion*/
	public static void Saludar(int numeroVeces, String nombre) {
		for(int i=0; i<numeroVeces; i++) {
			System.out.println("hola....." +nombre);
		}
	
	}

}