package ejercicios;
import java.util.Scanner;
public class calculadora_con_funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduzca numero 1");
		System.out.println("Introduzca numero 2");
		int n1;
		int n2;
		n1=teclado.nextInt();
		n2=teclado.nextInt();
		
		int suma;
		suma=sumaNumeros(n1,n2);
		System.out.println(suma);
		
		int resta;
		resta=restaNumeros(n1,n2);
		System.out.println(resta);
		
		int multiplicacion;
		multiplicacion=multiplicaNumeros(n1,n2);
		System.out.println(multiplicacion);
		
		int division;
		division=divideNumeros(n1,n2);
		System.out.println(division);

	}
	
	public static int sumaNumeros (int n1,int n2) {
		int r=n1+n2;
		
		return r;
		
	}
	
	public static int restaNumeros (int n1, int n2) {
		int r=n1-n2;
		
		return r;
	}
	
	public static int multiplicaNumeros (int n1, int n2) {
		int r=n1*n2;
		
		return r;
	}
	
	public static int divideNumeros (int n1, int n2) {
		int r=n1/n2;
		
		return r;
	}

}
