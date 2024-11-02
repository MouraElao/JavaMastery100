package exercicios;

import java.util.Scanner;

//Escreva um programa que peça dois números e um operador matemático. Realize a operação e exiba o resultado. 

public class Ex21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, resultado = 0;
		String operador;
		
		System.out.println("Digite um numero:");
		n1 = sc.nextInt();
		System.out.println("Digite um numero");
		n2 = sc.nextInt();
		sc.nextLine(); // limpa o buffer do Scanner
		while(true){
			System.out.println("Digite um operado que deseja utilizar na operação: [+] [-] [*] [/] ");
			operador = sc.nextLine();
			
			if(operador.equalsIgnoreCase("+") || 
		       operador.equalsIgnoreCase("-") || 
		       operador.equalsIgnoreCase("*") || 
		       operador.equalsIgnoreCase("/")) {
				System.out.println("Operdor Válido " + operador);
				break;
			} else {
				System.out.println("Digite um operador válido!!!");
			}
		}
		
		if(operador.equalsIgnoreCase("+")) {
			resultado = n1 + n2;
		} else if(operador.equalsIgnoreCase("-")){
			resultado = n1 - n2;
		} else if(operador.equalsIgnoreCase("*")) {
			resultado = n1 * n2;
		} else if(operador.equalsIgnoreCase("/")) {
			if(n2 != 0) {
				resultado = n1 / n2;
			} else {
				System.out.println("Erro: Divisão por zero não é permitida");
				sc.close();
				return;
			}
		}
		
		System.out.println("O resultado da operação é igual a: " + resultado);
		sc.close();
	}

}
