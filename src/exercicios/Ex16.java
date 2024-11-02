package exercicios;

import java.util.Scanner;

// Crie um programa que pergunte se o usuário quer continuar. Se sim, continue pedindo números até ele dizer "não". 

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String resposta;
		do {
			System.out.println("Quer continuar? [s/n]");
			resposta = sc.nextLine();
		} while(resposta.equalsIgnoreCase("s"));
		sc.close();
	}

}
