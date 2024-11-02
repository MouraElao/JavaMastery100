package exercicios;

//Faça uma função que receba um número e retorne seu fatorial. 

public class Ex62 {

	public static int fatorial(int n) {
		return n;
	}
	
	public static void main(String[] args) {
		int b = 10;
		int k = 1;

		for(int c = b; c >=1; c--) {
			k = b * (b - 1);
		}
		System.out.println(k);

	}

}
