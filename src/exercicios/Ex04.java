package exercicios;

import java.util.Scanner;

// Crie um programa que peça ao usuário para inserir dois números e exiba a soma. 
public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int a = scanner.nextInt();
		System.out.println("Você digitou: " + a);
		System.out.println("Digite um número: ");
		int b = scanner.nextInt();
		System.out.println("Você digitou: " + b);
		int c;
		c = a + b;
		System.out.println("A soma dos dois número digitados é igual à: " + c);
		scanner.close();
	}
}
