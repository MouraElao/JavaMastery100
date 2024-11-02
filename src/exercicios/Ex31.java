package exercicios;

import java.util.Scanner;

//Faça um programa que receba um número e exiba se ele é múltiplo de 3 ou de 7. 

public class Ex31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero para saber se é multiplo de 3 ou 7: ");
		int n = sc.nextInt();
		
		if(n % 3 == 0 && n % 7 == 0) {
			System.out.println("O numero é multiplo de 3 e de 7");
		} else if(n % 3 == 0) {
			System.out.println("O numero é multiplo de 3");
		} else if(n % 7 == 0) {
			System.out.println("O numero é multiplo de 7");
		} else {
			System.out.println("O numero não é multiplo nem de 3 e nem de 7");
		}
		sc.close();
	}

}
