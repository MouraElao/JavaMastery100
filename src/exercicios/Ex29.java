package exercicios;

import java.util.Scanner;

// Escreva um programa que calcule a média de três notas e exiba a situação (aprovado, recuperação, reprovado). 

public class Ex29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, media;
		System.out.println("Digite suas notas: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		media = (n1 + n2 + n3) / 3;
		if(media < 5) {
			System.out.println("REPROVADO");
		} else if(media >= 5 && media <7) {
			System.out.println("RECUPERAÇÃO");
		} else if(media >=7) {
			System.out.println("Aprovado");
		}
		sc.close();
	}

}
