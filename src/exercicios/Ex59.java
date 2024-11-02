package exercicios;

import java.util.Scanner;

//Crie um programa que leia uma frase e conte quantas letras "a" ela tem. 

public class Ex59 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = sc.nextLine();
		char letraprocurada = 'a';
		int somador = 0;
		
		for(char c: frase.toCharArray()) {
			if(c == letraprocurada) {
				somador += 1;
			}
		}
		System.out.println("O total de letras a que a frase possui é igual a: " + somador);
		sc.close();
	}

}
