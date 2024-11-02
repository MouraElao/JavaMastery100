package exercicios;

import java.util.Scanner;

// Escreva um programa que peça um número e verifique se é um número primo. 

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int somador = 0;
		
		System.out.println("Digite um número para saber se é primo: ");
		int n = sc.nextInt();

		for(int i = n; i > 0; i--) {
			int div = n % i;
			if(div == 0){
				somador = somador + 1;
			}
		}
		if(somador == 2) {
			System.out.println("O número é primo.");
		} else {
			System.out.println("O número não é primo.");
		}
		sc.close();
	}
}	
