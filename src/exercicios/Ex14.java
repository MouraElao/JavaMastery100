package exercicios;

import java.util.Scanner;

// Crie um programa que peça dois números e exiba qual é o maior. 

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		System.out.println("Digite dois números: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		if(n1 == n2) {
			System.out.println("Os números são iguais");
		} else if(n1 > n2) {
			System.out.println("O número " + n1 + " é o maior");
		} else {
			System.out.println("O número " + n2 + " é o maior");
		}
		sc.close();
	}

}
