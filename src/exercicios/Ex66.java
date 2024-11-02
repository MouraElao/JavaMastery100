package exercicios;

import java.util.Scanner;

// Faça uma função que calcule a média de três números. 

public class Ex66 {

	public static double media(double a, double b, double c) {
		double media = (a + b + c) / 3;
		return media;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double n1 = sc.nextDouble();
		System.out.println("Digite um numero: ");
		double n2 = sc.nextDouble();
		System.out.println("Digite um numero: ");
		double n3 = sc.nextDouble();

		double resultado = media(n1, n2, n3);
		System.out.println("O resultado da media entre esses numero é: " + resultado);
		sc.close();
	}

}
