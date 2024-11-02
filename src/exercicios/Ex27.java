package exercicios;

import java.util.Scanner;

//Faça um programa que verifique se um caractere é uma letra ou um número. 

public class Ex27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char nl;
		
		System.out.println("Digite o caractere para verificarmos se é uma letra ou numero: ");
		nl = sc.next().charAt(0);
		if(Character.isDigit(nl)) { //verifica se o caracter pode ser numero
			System.out.println("é número");
		} else {
			System.out.println("não é numero");
		}
		sc.close();
	}

}
