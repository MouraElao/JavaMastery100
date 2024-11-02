package exercicios;

import java.util.Scanner;

//Faça um programa que leia 10 números e exiba a soma dos números pares e a soma dos números ímpares. 

public class Ex45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int somadorimpar = 0;
		int somadorpar = 0;
		
		for(int c = 0; c <= 9; c++) {
			System.out.println("Digite um numero: ");
			int n = sc.nextInt();
			
			if(n % 2 == 0) {
				somadorpar = somadorpar + n;
			} else {
				somadorimpar = somadorimpar + n;
			}
		}
		System.out.println("A soma dos números ímpares é igual a: " + somadorimpar + 
				" e a soma dos numeros pares é igual a: " + somadorpar);
		sc.close();
	}

}
