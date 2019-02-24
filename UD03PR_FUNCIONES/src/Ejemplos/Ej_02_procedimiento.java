package Ejemplos;

import java.util.Scanner;

public class Ej_02_procedimiento {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner teclado= new Scanner (System.in);
			
			int numero1;
			int numero2;
			int numero3;
			int numero4;
			
			
			numero1=teclado.nextInt();
			numero2=teclado.nextInt();
			numero3=teclado.nextInt();
			numero4=teclado.nextInt();
			
			//vamos a hacer la llamda a la funcion
			sumaNumeros(numero1, numero2);	
			sumaNumeros(numero3, numero4);
			sumaNumeros(numero1, numero3);
			
		}
		
		
	// declaracion de una funcion que me hace la suma de 2 numeros
		public static void sumaNumeros (int n1, int n2) {
			int s = n1 + n2; //declaro la variable s porque es la 
						 //variable que voy a devolver al programa principal
						 /*la variable que devuelvo al programa principal
						 * y el tipo de dato definido en la declaracion
						 * deben ser coherentes
						 */
			System.out.println(s);	
			
	}

}
