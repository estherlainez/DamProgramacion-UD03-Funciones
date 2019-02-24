package ejercicios;
import java.util.Scanner;
public class ampliacion1_mascorrecto_corregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);	
		int numero;
		int suma=0;
		
		for(int i=0; i<10;i++) {
			do {
				System.out.println("Introduzca un número:");
				numero=teclado.nextInt();
			
			}while (numero>100||numero<1); 
		
			suma=suma+numero;
		}
		System.out.println("La suma es"+ suma);
	}
}