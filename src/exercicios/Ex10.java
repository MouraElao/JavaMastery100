package exercicios;

import java.util.Scanner;

//Escreva um programa que peça três números e informe o maior e o menor deles. 

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n1 = sc.nextInt();
		System.out.println("Digite um número: ");
		int n2 = sc.nextInt();
		System.out.println("Digite um número: ");
		int n3 = sc.nextInt();
		
		if(n1 == n2 && n1 == n3) {
			System.out.println("Os números são iguais");
		} else if(n1 > n2 && n1 > n3){
			System.out.println("O maior número é o: " + n1);
		} else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior número é o: " + n2);
		} else if(n3 > n1 && n3 > n2) {
			System.out.println("O maior número é o: " + n3);
		}
		if(n1 < n2 && n1 < n3){
			System.out.println("O menor número é o: " + n1);
		} else if(n2 < n1 && n2 < n3) {
			System.out.println("O menor número é o: " + n2);
		} else if(n3 < n1 && n3 < n2) {
			System.out.println("O maior número é o: " + n3);
		}
		sc.close();
	}
}
