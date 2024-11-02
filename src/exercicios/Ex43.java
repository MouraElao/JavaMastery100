package exercicios;

import java.util.Scanner;

//Crie um programa que peça 5 notas e exiba a média delas. 

public class Ex43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double somadordenota = 0;
		
		for(int c = 0; c <=4; c++) {
			System.out.println("Digite a " + c + "º" + " nota: ");
			double nota = sc.nextDouble();
			somadordenota = somadordenota + nota;
		}
		double mediadasnotas = somadordenota / 5;
		System.out.println(mediadasnotas);
		sc.close();
	}

}
