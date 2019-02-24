package ejercicios;
import java.util.Scanner;
public class ampliacion_4_ejercicio3_medianteFuncion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);	
		int numero=0;
		int comprobacion;
		int limiteSuperior=100;
		int limiteInferior=1;
		int i;
		for(i=1; i<=10;i++) {
			while(numero>=limiteInferior && numero<=limiteSuperior) {
				System.out.println("Introduzca número "+i+": debe estar comprendido entre "+ limiteInferior
						+" y "+limiteSuperior);
				numero=teclado.nextInt();
				/*limiteInferior=limiteInferior+10;
				limiteSuperior=limiteSuperior+10;*/
			}
			limiteInferior=limiteInferior+10;
			limiteSuperior=limiteSuperior+10;
		}
	
	}

	
	public static int valorNumeros(int limiteSuperior, int limiteInferior) {	
		Scanner teclado= new Scanner (System.in);
		int numero=0;
		int i;
		do {
			System.out.println("Introduzca un número:");
			i=teclado.nextInt();
			if (numero>limiteSuperior) {
				System.out.println("Numero fuera de limite maximo");
			}
			if (numero<limiteInferior) {
				System.out.println("Numero fuera de limite minimo");
			}
			else {
				System.out.println("Numero dentro de los lmites");
			}
		}while (numero>1||numero<100); 

		return numero;	
		}
	}