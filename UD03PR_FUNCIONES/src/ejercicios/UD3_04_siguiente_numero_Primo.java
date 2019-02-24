package ejercicios;
import java.util.Scanner;
public class UD3_04_siguiente_numero_Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numero=teclado.nextInt();
		boolean primo;
		int contador;
		contador=numero +1;
		boolean sgteprimo;
		sgteprimo=false;
		do {
			primo=esPrimo(contador);
			if (primo==true) {
				System.out.println("el siguiente numero es primo: "+contador);
				sgteprimo=true;
			}else {
				contador++;
			}
			
		}while(sgteprimo!=true);
		
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

