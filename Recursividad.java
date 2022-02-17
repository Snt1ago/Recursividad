package recursividad;

public class Recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		System.out.println("fun es: " + fun(5));
		System.out.println("suma de cuadrados: " + sumaCuadrados(4));
		System.out.println("la potencia de 5 a la 2 es: " + potencia(5,2));
		
		
	}
public static int fun (int x) {
	
	if (x<=1) {
		return 1;
	}else {
		return 2*fun(x-1);
	}
}


public static void decir (String hola, int n) {
	System.out.println(hola);
	if (n > 1) {
		decir(hola, n-1);
	}
	
	
	
}
public static int sumaCuadrados (int n) {
	if (n == 1) {
		return 1;
	}else {
		return n*n + sumaCuadrados(n-1);
	}
}
public static int potencia (int x, int n) {
	if (n == 0) {
		return 1;
	}else {
		return (x * potencia (x, n-1));
	}
	
}
}
