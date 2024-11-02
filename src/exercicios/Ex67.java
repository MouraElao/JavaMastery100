package exercicios;

import java.util.Scanner;

//Crie uma função que receba um número e retorne a tabuada desse número. 

public class Ex67 {
	
	public static String gerarTabuada(int numero) {
		// StringBuilder para manipular a string de forma mais eficiente, evitando a criação de novos objetos para cada linha.
		StringBuilder tabuada = new StringBuilder();
		
		for (int i = 1; i <= 10; i++) {
			tabuada.append(numero).append(" X ").append(i).append(" = ").append(numero * i).append("\n");
			// O StringBuilder converte o valor inteiro para String antes de adiciona-lo
		}
		return tabuada.toString();
		// converto para String, pois o StringBuilder não é uma String verdadeira
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		String resultado = gerarTabuada(n);
		System.out.println(resultado);
		sc.close();
	}

}
