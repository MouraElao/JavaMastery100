package exercicios;

import java.util.Scanner;

//Faça uma função que receba uma string e retorne o número de caracteres. 

public class Ex64 {

	public static String contachar(String p) {
		int somador = 0;
		char [] caracteres = p.toCharArray();
		for (char c : caracteres) {
			System.out.println(c);
			somador += 1;
		}
		String somadoremstring = Integer.toString(somador);
		return somadoremstring;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine();
		
		String contagemletras = contachar(palavra);
		System.out.println(contagemletras);
		sc.close();
	}

}
