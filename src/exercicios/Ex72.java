package exercicios;

import java.util.Scanner;

//Faça uma função que receba um nome e o exiba formatado (primeira letra maiúscula). 

public class Ex72 {

	public static String formatando(String palavra) {
		if (palavra == null || palavra.isEmpty()) {
            return "Nenhuma palavra foi digitada"; // Retorna a string original se for nula ou vazia
        }
		
		String palavrasemespaco = palavra.strip();
		String palavraformatada = palavrasemespaco.substring(0, 1).toUpperCase() + palavrasemespaco.substring(1);
		return palavraformatada;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String palavradig = sc.nextLine();
		
		String palavraformatadamain = formatando(palavradig);
		System.out.println(palavraformatadamain);
		sc.close();
	}

}
