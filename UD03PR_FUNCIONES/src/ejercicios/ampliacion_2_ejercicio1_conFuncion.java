package ejercicios;
import java.util.Scanner;
public class ampliacion_2_ejercicio1_conFuncion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int numero,i=0,suma=0;	
		boolean valido;
		
		while(i<10) {
			System.out.println("Introduzca un número:");
			numero=teclado.nextInt();
			valido=valorNumeros(numero);	
			if(valido) {
				System.out.println("número valido");
				suma=suma+numero;
			}else {
				System.out.println("error");
			}
			i++;
			
			System.out.println("La suma es :"+suma);
		}
	}
	
	
	public static boolean valorNumeros(int numero) {	
		boolean valido=true;
		int contador=0;
		if(numero>1 && numero<100) {
			valido=true;
			contador++;				
		}
		if ((numero>100)||(numero<1)) {
			valido=false;	
			contador++;
		}
		return valido;
	}
}