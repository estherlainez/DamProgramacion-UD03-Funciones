package ejercicios;
import java.util.Scanner;
public class UD3_02_booleanoyvocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		boolean correcto;
		System.out.println("Introduzca caracter");
		char caracter;
		caracter=teclado.next().charAt(0);
		correcto=identificacionCaracter(caracter);
		if (correcto==true) {
			System.out.println("Es una vocal");
		}
		if (correcto==false) {
			System.out.println("Es una consonante");
		}
	}

	
	public static boolean identificacionCaracter(char caracter) {
		Scanner teclado=new Scanner(System.in);
		boolean correcto;
		if (caracter=='a'||caracter=='A'||caracter=='e'||caracter=='E'||caracter=='i'||caracter=='I'
				||caracter=='o'||caracter=='O'||caracter=='u'||caracter=='U') {
			correcto=true;
		}else {
			correcto=false;
		}
		return correcto;
	}
}
