package Ejemplos;

import java.util.Scanner;

public class EJ_01_funcion {
/*sintaxis de la declaracion de la función/procedimiento es:
 * public static tipoSalida NombredelaFunción(tipoDatoEntrada1 parametro1,....., tpoDatoEntrada parametro)
 * codigo que estamos ejecutando
 * return salida
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner (System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		
		int suma;
		
		numero1=teclado.nextInt();
		numero2=teclado.nextInt();
		numero3=teclado.nextInt();
		numero4=teclado.nextInt();
		//vamos a hacer la llamda a la funcion
		suma=sumaNumeros(numero1, numero2);
		System.out.println(suma);
		suma=sumaNumeros(numero3, numero4);
		System.out.println(suma);
		suma=sumaNumeros(numero1, numero3);
		System.out.println(suma);
	}
	
	
// declaracion de una funcion que me hace la suma de 2 numeros
	public static int sumaNumeros (int n1, int n2) {
		int s = n1 + n2; //declaro la variable s porque es la 
					 //variable que voy a devolver al programa principal
					 /*la variable que devuelvo al programa principal
					 * y el tipo de dato definido en la declaracion
					 * deben ser coherentes
					 */
		return s;
		
	}
}
