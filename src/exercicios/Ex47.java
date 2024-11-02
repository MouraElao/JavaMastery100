package exercicios;

import java.util.Scanner;

//Crie um programa que leia 10 números e exiba quantos são primos. 

public class Ex47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int somaprimos = 0;
		int somador = 0;
		
		for(int c = 0; c <= 9; c++) {
			System.out.println("Digite um numero");
			int n = sc.nextInt();
			somador = 0;
			for(int c1 = n; c1 > 0; c1--) {
				if(n % c1 == 0) {
					somador += 1;
				}
			}
			if(somador == 2) {
				somaprimos += 1;
			}
		}
		System.out.println("São primos a quantidade de " + somaprimos + " numeros");
		sc.close();
	}

}
