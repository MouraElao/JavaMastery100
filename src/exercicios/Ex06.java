package exercicios;

import java.util.Scanner;

// Faça um programa que receba um número e informe se é par ou ímpar. 
public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja saber se é ímpar ou par: ");
		double a = sc.nextDouble();
		if(a % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é ímpar");
		}
		sc.close();
	}
}
