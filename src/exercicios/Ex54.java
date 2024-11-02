package exercicios;

import java.util.Scanner;

//Escreva um programa que peça 5 números e exiba o maior deles. 

public class Ex54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maiornumero = 0;
		
		for(int c = 0; c <= 4; c++) {
			System.out.println("Digite um numero: ");
			int n = sc.nextInt();
			if(n > maiornumero) {
				maiornumero = n;
			}
		}
		
		System.out.println("O maior numero entre os digitados foi: " + maiornumero);
		sc.close();
	}

}
