package ejercicios;
import java.util.Scanner;
public class ampliacion_6_elevarPotencia_alNumeroMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce dos numeros");
		int A;
		int B;
		A=teclado.nextInt();
		B=teclado.nextInt();
		int numeroMayor;
		int numeroMenor;
		numeroMayor=(A>B)? A :B;
		numeroMenor=(A>B)? B :A;
		System.out.println("El menor es "+numeroMenor);
		System.out.println("El mayor es "+ numeroMayor);
		potenciaNumeros(numeroMenor,numeroMayor);
	}
	
	public static void potenciaNumeros (int numeroMenor, int numeroMayor) {
		int resultado=(int) Math.pow(numeroMenor, numeroMayor);
		System.out.println("el resultado de la potencia es "+resultado);
	}

}
