package exercicios;

import java.util.Scanner;

// Faça uma função que receba uma string e retorne quantas vogais ela tem. 

public class Ex70 {
	
	public static int contavogais(String recebepalavra) {
		char caracteres[] = recebepalavra.toCharArray();
		int somador = 0;
		for(char letra : caracteres) {
			//metodo indexOf verifica se a letra está dentro da String, no caso a letra dentro do vetor caracteres
			//verifico se é diferente de -1, pois se o valor for diferente do que está na string ele retorna -1
			if("aeiou".indexOf(letra) != -1) {
				somador += 1;
			}
		}
		return somador;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String palavra = sc.nextLine();
		
		int contador = contavogais(palavra);
		
		System.out.println("Essa palavra tem: " + contador + " vogais");
		sc.close();
	}

}
