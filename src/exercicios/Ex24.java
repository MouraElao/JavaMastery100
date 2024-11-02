package exercicios;

import java.util.Scanner;

//Faça um programa que calcule o valor da conta de um restaurante, incluindo gorjeta de 10%. 

public class Ex24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valorconta, total;
		System.out.println("Digite o valor da conta: ");
		valorconta = sc.nextDouble();
		total = (valorconta * 110) / 100;
		System.out.println("O valor total com a gorjeta é de: " + String.format(("%.2f"), total));
		sc.close();
	}

}
