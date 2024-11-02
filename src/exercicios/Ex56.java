package exercicios;

import java.util.Scanner;

//Crie um programa que leia números até que seja digitado um negativo e exiba a soma dos números positivos. 

public class Ex56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número e parar parar digite um numero negativo:");
		int n = sc.nextInt();
		int somador = 0;
		
		while(n >= 0) {
			if(n > 0) {
				somador += n;
			}
			System.out.println("Digite um número e parar parar digite um numero negativo:");
			n = sc.nextInt();
			
		}
		System.out.println("A soma dos numeros positivos é igual a: " + somador);
		sc.close();
	}

}
