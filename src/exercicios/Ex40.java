package exercicios;

import java.util.Scanner;

//Crie um programa que imprima a tabuada de um número informado. 

public class Ex40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero para ver sua tabuada de 1 a 10: ");
		int n = sc.nextInt();
		
		for(int c = 1; c <= 10; c++) {
			int resultado = c * n;
			System.out.println(c + " x " + n + " = " + resultado);
		}
		sc.close();
	}

}
