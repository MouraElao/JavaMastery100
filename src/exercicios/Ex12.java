package exercicios;

import java.util.Scanner;

// Faça um programa que peça um número e informe se ele é divisível por 5. 

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double n = sc.nextDouble();
		
		if(n % 5 == 0) {
			System.out.println("O número " + n + " é divisível por 5");
		} else {
			System.out.println("O número " + n + " não é divisível por 5");
		}
		sc.close();
	}
}
