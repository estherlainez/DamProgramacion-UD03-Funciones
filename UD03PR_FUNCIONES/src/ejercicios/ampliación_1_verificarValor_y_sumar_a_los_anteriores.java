package ejercicios;
import java.util.Scanner;
public class ampliación_1_verificarValor_y_sumar_a_los_anteriores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);	
		int numero;
		int i = 0;		
		int suma=0;
			
		while(i<10) {
			System.out.println("Introduzca un número:");
			numero=teclado.nextInt();
			if(numero>1 && numero<100) {
				System.out.println("número valido");				
			}
			if ((numero>100)||(numero<1)) {
				System.out.println("error");
			}	
			i++;
			suma=suma+numero;
		}
		System.out.println("La suma es"+ suma);
		
			
	}
	
}
