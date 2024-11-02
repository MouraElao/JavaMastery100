package exercicios;

import java.util.Scanner;

//Faça um programa que peça a idade do usuário e exiba "Maior de idade" ou "Menor de idade" baseado no valor. 

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if(idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		sc.close();
	}
}
