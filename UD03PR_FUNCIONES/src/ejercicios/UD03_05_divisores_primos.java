package ejercicios;
import java.util.Scanner;
public class UD03_05_divisores_primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int numero;
		int resto;
		numero=teclado.nextInt();
		boolean primo;
		primo=esPrimo(numero);
		boolean var;
		
	for(int i=2;i<numero;i++) {
		resto=numero%i;
		if(numero%i==0) {
			var=esPrimo(resto);
			if (var==true) {
				System.out.println("divisor primo de " + numero+ " es:"+i);
			}
		}
		
	}
	
	}

	public static boolean esPrimo(int numero) {
		boolean esPrimo=true;
		int resto;
		esPrimo=true; 
		for(int i=2;i<numero;i++) {
			resto=numero%i;
			
			if(resto==0) {
			 esPrimo=false;
			}
		 }
		return esPrimo;
	}
	
	
}
