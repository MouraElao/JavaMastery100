package exercicios;

// Faça um programa que some todos os números entre 1 e 100. 

public class Ex38 {

	public static void main(String[] args) {
		int somador = 0;
		for(int c = 1; c <= 100; c++) {
			System.out.println(c);
			somador = somador + c;
		}
		System.out.println(somador);

	}

}
