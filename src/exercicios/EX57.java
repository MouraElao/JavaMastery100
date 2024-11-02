package exercicios;

import java.util.Scanner;

//Escreva um programa que leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais velha. 

public class EX57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] nomes = new String[10]; //vetor para armazenar os nomes
		int [] idades = new int[10]; //vetor para armazenar as idade
		
		// Laço para inserir os dados
		for(int c = 0; c < 3; c++) {
			System.out.println("Digite um nome:");
			nomes [c] = sc.nextLine(); //Armazena o nome no vetor
			
			System.out.println("Digite a idade: ");
			idades [c]= sc.nextInt(); //Armazena a idade no vetor
			sc.nextLine(); // Limpa o a linha deixada no buffer pelo nextInt
		}
		
		//Variáveis para armazenar a pessoa mais velha
		int idademaisvelha = idades[0];
		String nomemaisvelho = nomes[0];
		
		//Laço para encontrar a pessoa mais velha
		for(int i = 1; i < 3; i++) {
			if(idades[i] > idademaisvelha) {
				idademaisvelha = idades[i];
				nomemaisvelho = nomes[i];
			}
		}
		System.out.println("A pessoa mais velha é: " + nomemaisvelho + " com " + idademaisvelha + " anos");
		
		sc.close();
	}

}
