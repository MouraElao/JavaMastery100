package exercicios;

import java.util.Scanner;

//Crie uma função que verifique se um número é par ou ímpar. 

public class Ex63 {
	
	public static void verificaparimpar(int n) {
		if(n != 0 && n % 2 == 0) {
			System.out.println("O número digitado é par");
		} else if(n == 0){
			System.out.println("0 não é um número impar e nem par");
		} else {
			System.out.println("O número é ímpar");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero = sc.nextInt();
		
		verificaparimpar(numero);
		sc.close();

	}

}
