package exercicios;

import java.util.Scanner;

//Faça um programa que peça uma nota entre 0 e 10. Se o valor for inválido, mostre uma mensagem e peça novamente. 

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		while(true) {
			System.out.println("Digite uma nota entre 0 e 10");
			nota = sc.nextInt();
			
			if(nota >= 0 && nota <= 10) {
				break;
			} else {
				System.out.println("Nota inválida! Tente novamente. ");
			}
		}
		
		System.out.println("Nota válida: " + nota);
		sc.close();
	}

}
