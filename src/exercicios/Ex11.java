package exercicios;

import java.util.Scanner;

// Escreva um programa que peça um número e verifique se ele é positivo, negativo ou zero. 

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		if(n < 0) {
			System.out.println("O número " + n + " é negativo");
		} else if(n > 0) {
			System.out.println("O número " + n + " é positivo");
		} else {
			System.out.println("O número " + n + " igual a zero");
		}
		sc.close();
	}
}
