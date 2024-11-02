package exercicios;

import java.util.Scanner;

//Escreva um programa que leia um número e exiba os seus divisores. 

public class Ex49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero para mostrarmos seus divisores");
		int n = sc.nextInt();
		
		for(int c = n; c > 0; c--) {
			if(n % c == 0) {
				System.out.println(c);
			}
		}
		sc.close();
	}

}
