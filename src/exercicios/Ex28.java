package exercicios;

import java.util.Scanner;

//Crie um programa que peça o valor da venda e calcule o valor da comissão. 
//Comissão de 5% para vendas de até R$ 5.000,00.
//Comissão de 10% para vendas acima de R$ 5.000,00.

public class Ex28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valorvenda, comissao = 0;
		System.out.println("Digite o valor da venda: ");
		valorvenda = sc.nextDouble();
		if(valorvenda > 0 && valorvenda <= 5000) {
			comissao = (valorvenda * 5) / 100;
		} else if(valorvenda > 5000) {
			comissao = (valorvenda * 10) / 100;
		}
		
		System.out.println("O valor da comissão é: " + comissao);
		sc.close();
	}

}
