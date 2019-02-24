package ejercicios;
import java.util.Scanner;
public class Ejercicio05_divisoresPrimos_javi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EJERCICIO 5
		
		/* Implementar una función que muestra, por consola todos los divisores primos del número que se le pasa como parámetro*/
	
		Scanner teclado = new Scanner (System.in);
	
		System.out.print("Introduce un numero: ");
		int numero=teclado.nextInt();
		
		for (int i=1;i<=numero;i++)
		{
			boolean primo=DivPrimo(i);
			if (primo==true)
			{
				if (numero%i==0)
				{
					System.out.println(i);
				}
			}
		}	
	}	
	public static boolean DivPrimo(int num)
	{
		boolean esprimo=true;
		for (int i=2;i<num;i++)
		{
			if (num%i==0)
			{
				esprimo=false;
			}
		}
		return esprimo;	
	}
}