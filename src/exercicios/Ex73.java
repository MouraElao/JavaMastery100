package exercicios;

import java.util.Scanner;

//Crie uma função que verifique se uma palavra é palíndromo. 

public class Ex73 {

	public static boolean verificapalindromo(String palavrar) {
		if(palavrar.isEmpty()) {
			System.out.println("Nada foi digitado");
			return false;
		}
		String palavrainvertida = new StringBuilder(palavrar).reverse().toString();
		if(palavrainvertida.equalsIgnoreCase(palavrar)) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String palavra = sc.nextLine();
		
		boolean palavraverificada = verificapalindromo(palavra);
		if(palavraverificada == true) {
			System.out.println("É um palindromo");
		}else {
			System.out.println("Não é um palindromo");
		}
		sc.close();
	}

}
