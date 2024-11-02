package exercicios;

import java.util.Scanner;

//Escreva um programa que leia 5 números e exiba quantos são negativos e quantos são positivos. 

public class Ex46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int somadorpos = 0;
		int somadorneg = 0;
		
		for(int c = 0; c <= 4; c++) {
			System.out.println("Digite um numero: ");
			int n = sc.nextInt();
			
			if(n > 0) {
				somadorpos += 1;
			} else if (n < 0){
				somadorneg += 1;
			}
		}
		System.out.println("A quantidade de numeros positivos é igual a: " + somadorpos + 
				" e a quantidade de numeros negativos é igual a: " + somadorneg);
		sc.close();
	}
}
