package exercicios;

import java.util.Scanner;

// Faça um programa que peça um ano e informe se é bissexto. 

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano que deseja saber se é bissexto: ");
		int ano = sc.nextInt();
		int multiplodequatro = (ano % 100) % 4;
		if (multiplodequatro == 0) {
			System.out.println("O ano digitado é bissexto");
		} else {
			System.out.println("O ano digitado não é bissexto");
		}
		sc.close();
	}
}
