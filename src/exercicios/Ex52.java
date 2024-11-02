package exercicios;

import java.util.Scanner;

//Faça um programa que leia uma palavra e conte quantas vogais ela tem. 

public class Ex52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine();
		
		char[] caracteres = palavra.toCharArray();
		int somadorvogal = 0;
		
		for (char c : caracteres) {
			//indexOf(c) é um metodo da classe String. Estou vendo se o resultado é diferente de -1, 
			//pois na busca pelo metodo, resultados não encontrados são iguais a -1 (0,a, 1,e, 2,i...)
            if("aeiou".indexOf(c) != -1) {
            	somadorvogal += 1;
            } 
        }
		
		System.out.println("A palavra digitada contém: " + somadorvogal + " vogais");
		sc.close();
	}

}
