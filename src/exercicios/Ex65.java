package exercicios;

import java.util.Scanner;

//Crie uma função que receba um número e retorne se ele é primo ou não. 

public class Ex65 {
	
	public static String verificaprimos (int n) {
		int somador = 0;
		for(int c = 1; c <= n; c++) {
			if(n % c == 0) {
				somador += 1;
			}
		}
		if(somador == 2) {
			return "primo";
		} else {
			return "Não primo";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		String primoounao = verificaprimos(numero);
		System.out.println(primoounao);
		sc.close();

	}

}
