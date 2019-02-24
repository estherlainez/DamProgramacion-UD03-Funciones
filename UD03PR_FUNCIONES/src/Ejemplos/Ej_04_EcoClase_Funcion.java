package Ejemplos;
import java.util.Scanner;
public class Ej_04_EcoClase_Funcion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*vamos a crear una funciona para devolver un valor.*/
		
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Introduzca tu nombre");
		
		String nombre=teclado.nextLine();
		
		String salida;
		salida=Saludar(nombre);
		
		String dia=" Hoy es viernes";
		
		AñadirDia(dia, salida);
		
	}

	//declaro primero la funcion saludar. Fuera de la funcion main
	
	public static String Saludar(String nombre) {
		
		String saludo, despedida;
		
		saludo="Hola  " + nombre;
		
		System.out.println(saludo);
		
		/*con return indicamos la variable que se devuelve a la funcion main.
		 * Si declaramos un tipo de dato de salida, es obligatorio indicar
		 * con return la variable que vamos a devolver a la funcion main
		 */
		return saludo;
	}
	
	/*añado un procedimiento para añadir dia, en la funcion main 
	 * tambien declaro la variable dia del procedimiento*/
	
	public static void AñadirDia(String dia, String salida) {
	
		System.out.println(salida+dia);
	}
	
}
