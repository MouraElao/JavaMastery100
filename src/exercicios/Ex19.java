package exercicios;

import java.util.Scanner;

//Escreva um programa que leia um número e diga se ele está entre 1 e 10. 

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Digite um numero para verificar se está entre 1 e 10");
		n = sc.nextInt();
		if(n >= 1 && n <= 10) {
			System.out.println("O número está entre 1 e 10");
		} else {
			System.out.println("O número não está entre 1 e 10");
		}
		
		sc.close();
	}

}
