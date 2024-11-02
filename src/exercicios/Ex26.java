package exercicios;

import java.util.Scanner;

//Crie um programa que peça um número e informe se ele está entre dois valores fornecidos

public class Ex26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, valorfornecido1, valorfornecido2;
		System.out.println("Digite o primeiro valor do intervalo: ");
		valorfornecido1 = sc.nextInt();
		System.out.println("Digite o segundo valor do intervalo: ");
		valorfornecido2 = sc.nextInt();
		System.out.println("Digite um número para verificar se está entre os valores fornecidos: ");
		n = sc.nextInt();
		if(n >= valorfornecido1 && n <= valorfornecido2) {
			System.out.println("O valor está dentro do intervalo dos valores fornecidos");
		} else if(n >= valorfornecido2 && n <= valorfornecido1) {
			System.out.println("O valor está dentro do intervalo dos valores fornecidos");
		} else {
			System.out.println("O valor não está dentro do intervalo dos valores fornecidos");
		}
		sc.close();
	}

}
