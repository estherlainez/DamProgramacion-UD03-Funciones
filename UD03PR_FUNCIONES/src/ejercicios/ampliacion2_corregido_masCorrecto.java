package ejercicios;
import java.util.Scanner;
public class ampliacion2_corregido_masCorrecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);	
		int numero;
		int comprobacion;
		int limiteSuperior=100;
		int limiteInferior=1;
		
		comprobacion=valorNumeros(limiteSuperior,limiteInferior);
	}

	
	
	public static int valorNumeros(int limiteSuperior, int limiteInferior) {	
		Scanner teclado= new Scanner (System.in);
		int numero=0;
		do {
			System.out.println("Introduzca un número:");
			numero=teclado.nextInt();
			if (numero>100) {
				System.out.println("Numero fuera de limite maximo");
			}
			if (numero<1) {
				System.out.println("Numero fuera de limite minimo");
			}
			else {
				System.out.println("Numero dentro de los lmites");
			}
		}while (numero>100||numero<1); 

		return numero;	
		}
		
	}