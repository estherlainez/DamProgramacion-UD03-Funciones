package ejercicios;
import java.util.Scanner;
public class UD3_03_funcion_primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca numero y te dire si el numero es primo");
		int numero=teclado.nextInt();
		boolean primo;
		primo=esPrimo(numero);
		if (primo==true) {
			System.out.println("numero es primo");
		}else {
			System.out.println("no primo");
		}
	
	}
	
	public static boolean esPrimo(int numero) {

	int contador=2;
	boolean esPrimo=true;
	int resto;
	/*Mi estrategia sera sera suponer que todos los numeros 
	 * que queramos comprobar van a ser primos, hasta que se demuestre lo contrario
	 * Eso sucedera cuando nos encontremos un divisor entre 2 y el numero -1
	 * Ejemplo para saber si 9 es primo tenemos que dividir entre 2,3,4,5,6,7,8. 
	 * Si entre estos numeros nos encontramos un divisor de modo 9%2=0 o 9%3=0 
	 * quedara demostrado que el numero no es primo debiendo dar como resultado false.
	 * En caso contrario la variable de retorno dara true
	 */
	//Hecho con for
	 for(int i=2;i<numero;i++) {
		 resto=numero%i;
		
		 if(resto==0) {
			 esPrimo=false;
		 }
	 }
	return esPrimo;
	//Hecho con while
	/*while((contador!=numero)&&(esPrimo==true)) {
		if (numero%contador!=0) {
			
			esPrimo=true;
		}else {
			esPrimo=false;
		}
		contador++;
	}
	return esPrimo;*/
	}
		
}

	
	

