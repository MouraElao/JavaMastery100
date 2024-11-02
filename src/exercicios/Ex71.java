package exercicios;

import java.util.Scanner;

//Crie uma função que converta metros para quilômetros. 

public class Ex71 {
	
	public static double convertemparakm(double metros) {
		double km = metros / 1000;
		return km;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero em metro para converter para km: ");
		double metro = sc.nextDouble();
		System.out.println("O valor digitado em metros fica: " + convertemparakm(metro) + " quilômetros");
		sc.close();
	}

}
