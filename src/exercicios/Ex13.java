package exercicios;

import java.util.Scanner;

// Crie um programa que leia três números e informe se eles podem formar um triângulo. 

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Digite 3 números: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1) {
			System.out.println("Os três número formam um triângulo.");
		} else {
			System.out.println("Os três números não podem formar um triângulo.");
		}
		sc.close();
	}
}
