package ejercicios;

import java.util.Scanner;
public class ampliacion4_javi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EJERCICIO 4
		
		// Aprovechando la función creada en el ejercicio 2, realizar el ejercicio 3.
		
		int liminf=1;
		int limsup=10;
		int suma=0;
		
		for (int i=0;i<10;i++) 
		{
			int numero=ComprobarLimite(liminf,limsup);
			System.out.println("El numero que has introducido es: "+numero);
			suma=suma+numero;
			limsup+=10;
			liminf+=10;
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