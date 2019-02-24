package ejercicios;
import java.util.Scanner;
public class UD3_01_mostrar_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int A,B;
		System.out.println("Inserte numero A");
		A=teclado.nextInt();
		System.out.println("Inserte numero B");
		B=teclado.nextInt();
		int mayor,menor;
		mayor=(A>B)?A:B;
		menor=(A>B)?B:A;
		System.out.println("El mayor es "+ mayor+"  y el menor es "+menor);
		numerosentreAyB(A,B);
	}
	
	public static void numerosentreAyB(int A,int B) {
		int num_mayor=0,num_menor=0;
		if(A>B) {
			num_mayor=A;
			num_menor=B;
		}else {
			num_mayor=B;
			num_menor=A;
		}
		
		for(int i=num_menor; i<=num_mayor; i++) {
			System.out.println(i+" ");
		}

	}

}
