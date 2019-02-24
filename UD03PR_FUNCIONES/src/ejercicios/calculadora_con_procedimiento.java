package ejercicios;
import java.util.Scanner;
public class calculadora_con_procedimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduzca numero1");
		int n1;
		n1=teclado.nextInt();
		System.out.println("Introduzca numero2");
		int n2;
		n2=teclado.nextInt();
		
		sumaNumeros(n1,n2);
		restaNumeros(n1,n2);
		multiplicaNumeros (n1,n2);
		divideNumeros(n1,n2);
	}
	
	
	public static void sumaNumeros (int n1, int n2) {
		int r = n1 + n2; 
		System.out.println(r); 
		
	}
	public static void restaNumeros (int n1, int n2) {
		int r = n1- n2;
		System.out.println(r);
		
	}
	
	public static void multiplicaNumeros (int n1, int n2) {
		int r = n1 * n2;
		System.out.println(r);
	}
	
	public static void divideNumeros (int n1, int n2) {
		int r= n1/n2;
		System.out.println(r);
		
	}
	
	
	

}
