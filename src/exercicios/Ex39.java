package exercicios;

import java.util.Scanner;

//Escreva um programa que receba 5 números e exiba o maior e o menor deles. 

public class Ex39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n = sc.nextInt(); //Recebido primeiro numero
		int maior = n;
		int menor = n; // menor e maior recebem a mesma primeira entrada
		for(int c = 0; c <= 3; c++) {
			System.out.println("Digite um numero: ");
			n = sc.nextInt(); // como não faz diferença o n ser alterado, ele recebe um novo valor aqui e as comparações são feitas
			if(n > maior) {
				maior = n;
			}
			if(n < menor) {
				menor = n;
			}
		}
		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);
		sc.close();
	}
}
