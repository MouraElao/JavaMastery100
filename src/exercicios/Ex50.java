package exercicios;

import java.util.Scanner;

//Crie um programa que leia 10 números e exiba a média dos números pares. 

public class Ex50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double somador = 0;
		int contador = 0;
		
		for(int c = 0; c <= 9; c++) {
			System.out.println("Digite um numero: ");
			double n = sc.nextDouble();
			if(n % 2 == 0) {
				somador += n;
				contador += 1;
			}
		}
		double media = somador / contador;
		System.out.println("A média dos numeros pares é igual a: " + media);
		sc.close();
		
	}

}
