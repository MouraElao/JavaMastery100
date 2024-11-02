package exercicios;

import java.util.Scanner;

// Escreva um programa que peça a idade e a altura de três pessoas e mostre a média das idades e alturas. 

public class Ex23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade1, idade2, idade3, mediaidade;
		double altura1, altura2, altura3, mediaaltura;
		System.out.println("Digite sua idade: ");
		idade1 = sc.nextInt();
		System.out.println("Digite sua altura: ");
		altura1 = sc.nextDouble();
		System.out.println("Digite sua idade: ");
		idade2 = sc.nextInt();
		System.out.println("Digite sua altura: ");
		altura2 = sc.nextDouble();
		System.out.println("Digite sua idade: ");
		idade3 = sc.nextInt();
		System.out.println("Digite sua altura: ");
		altura3 = sc.nextDouble();
		
		mediaidade = (idade1 + idade2 + idade3) / 3;
		mediaaltura = (altura1 + altura2 + altura3) / 3;
		
		System.out.println("Media de idades: " + mediaidade);
		System.out.println("Media de altura: " + String.format("%.2f", mediaaltura));
		
		sc.close();
	}

}
