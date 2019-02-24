package ejercicios;
import java.util.Scanner;
public class UD_07_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca numero");
		int numero=teclado.nextInt();
		int resultado=factorial(numero);
		System.out.println("El factorial de "+ numero +" es " +resultado);
	}
	
	public static int factorial(int numero) {
		
		int resultado;
		if (numero==0) {
			return resultado = 1;
		}else {
			return resultado=numero * factorial(numero-1);
			}
		
		
	}

}
