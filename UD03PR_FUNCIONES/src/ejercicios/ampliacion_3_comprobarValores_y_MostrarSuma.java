package ejercicios;
import java.util. Scanner;
public class ampliacion_3_comprobarValores_y_MostrarSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int i;
		int numero ;
		int suma=0;
		int limiteSuperior=10;
		int limiteInferior=1;
		for(i=1;i<=10;i++) {
			do {
				System.out.println("Introduzca número "+i+": debe estar comprendido entre "+ limiteInferior
				+" y "+limiteSuperior);
				numero=teclado.nextInt();
				//si hago aqui la suma me lo suma siempre
				
			}while (!(numero>=limiteInferior && numero<=limiteSuperior)); 
				//si hago la suma fuera de do while me lo suma si es correcto entre limites
				limiteInferior=limiteInferior+10;
				limiteSuperior=limiteSuperior+10;
				suma=suma+numero;
				System.out.println("La suma es  "+ suma);
			
			}
	
	}
			

}
