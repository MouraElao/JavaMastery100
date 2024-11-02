package exercicios;

import java.util.Scanner;

//Faça um programa que verifique se um caractere digitado é uma vogal ou uma consoante. 

public class Ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char letra;
		
		while(true) {
			System.out.println("Digite uma letra para saber se é vogal ou consoante: ");
			letra = sc.next().toLowerCase().charAt(0); //toLowerCase converte tudo para minusculo
			
			if(Character.isLetter(letra)) { //Verifica se é uma letra do abecedario, se for retorne true
				break;
			} else {
				System.out.println("Digite um caractere valido!!");
			}
		}
			if(letra == ('a') ||
			   letra == ('e') ||
			   letra == ('i') ||
			   letra == ('o') ||
			   letra == ('u')) {
				System.out.println("é uma vogal");
			} else {
				System.out.println("é uma consoante");
			}
			
			sc.close();
	}

}
