package ejercicios;

import java.util.Scanner;
public class ampliacion2_javi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EJERCICIO 2
		
		/* Modifica el programa anterior de forma que la comprobación de los números se haga mediante una función.*/
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("El limite superior es: ");
		int n1=teclado.nextInt();
		System.out.print("El limite inferior es: ");
		int n2=teclado.nextInt();
		int suma=0;
		
		for (int i=0;i<10;i++) 
		{
			int comprobar=ComprobarLimite(n1,n2);
			suma=suma+comprobar;
		}
		
		System.out.println("La suma es "+suma);
		
	}
	
	public static int ComprobarLimite (int LimSup, int LimInf)
	{
		Scanner teclado = new Scanner (System.in);
		int numero;
		
		int mayor;
		mayor=LimSup>LimInf ? LimSup:LimInf;
		
		int menor;
		menor=LimInf<LimSup ? LimInf:LimSup;
		
		do
		{
			System.out.print("Introduce un numero: ");
			numero=teclado.nextInt();
		} while (numero<menor || numero>mayor);
		
		return numero;
	}
	
	
	
	
}
