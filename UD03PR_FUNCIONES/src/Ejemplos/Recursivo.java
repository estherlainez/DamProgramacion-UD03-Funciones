package Ejemplos;

public class Recursivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado=division(12,3);
		System.out.println(resultado);
	}

	public static int division(int a, int b) {
		if(b>a) {
			return 0;
		}else {
			return division(a-b,b) +1;
		}
	}
}
