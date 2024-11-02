package exercicios;

import java.util.Scanner;

//Escreva um programa que peça números até que o usuário digite zero. Mostre a soma de todos os números digitados. 

public class Ex44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero e para parar digite 0: ");
		int c = sc.nextInt();
		
		int somador = c;
		while(c != 0) {
			System.out.println("Digite um numero e para parar digite 0: ");
			c = sc.nextInt();
			somador = somador + c;
		}
		System.out.println("A soma de todos os números digitados foi igual a: " + somador);
		sc.close();
	}

}
