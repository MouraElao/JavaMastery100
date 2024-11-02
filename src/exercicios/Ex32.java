package exercicios;

import java.util.Scanner;

//Escreva um programa que peça a idade e verifique se o usuário pode votar. 

public class Ex32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		if (idade < 16) {
			System.out.println("Não pode votar");
		} else {
			System.out.println("Pode votar");
		}
		sc.close();
	}

}
