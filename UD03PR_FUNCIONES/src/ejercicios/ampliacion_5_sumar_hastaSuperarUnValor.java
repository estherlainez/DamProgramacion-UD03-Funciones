package ejercicios;
import java.util.Scanner;
public class ampliacion_5_sumar_hastaSuperarUnValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int numero;
		numero=teclado.nextInt();
		int i=0;
		int suma=0;
		boolean aceptado;
		aceptado=sumaNumeros(numero);
	}
	
	public static boolean sumaNumeros(int numero) {
		int i=0;
		int suma=0;
		boolean aceptado=true;
		do {
			System.out.println("Introduzca numeros");
			Scanner teclado= new Scanner(System.in);
			numero=teclado.nextInt();
			i++;
			suma=numero+suma;
			System.out.println("La suma es "+suma);
			System.out.println("La cantidad de numeros es "+i);
			
		}while (suma<500);
		if (suma>500) {
			aceptado=true;
			System.out.println("Ha llegado a la cantidad de 500");
		}
		if (suma<500) {
			aceptado=false;
			System.out.println("Introduzca numeros");
		}
	return aceptado;
	}
	
}
