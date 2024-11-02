package exercicios;

import java.util.Scanner;

//Crie um programa que peça o salário de um funcionário e calcule o valor do aumento baseado em critérios. 
//Salário atual:
//
//Funcionários com salário até R$ 3.000,00 recebem um aumento de 10%.
//Funcionários com salário acima de R$ 3.000,00 recebem um aumento de 5%.
//Tempo de serviço:
//
//Funcionários com até 3 anos de empresa recebem um aumento adicional de 5%.
//Funcionários com mais de 3 anos de empresa recebem um aumento adicional de 10%.

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario;
		double novosalario;
		int tempodeempresa;
		System.out.println("Digite seu sálario: ");
		salario = sc.nextDouble();
		System.out.println("Digite seu tempo de empresa");
		tempodeempresa = sc.nextInt();
		
		if(salario <= 3000 && tempodeempresa <= 3) {
			novosalario = (salario * 115) / 100;
			System.out.println("Seu novo sálario é igual a: R$" + novosalario);
		} else if(salario <= 3000 && tempodeempresa > 3) {
			novosalario = (salario * 120) / 100;
			System.out.println("Seu novo sálario é igual a: R$" + novosalario);
		} else if(salario > 3000 && tempodeempresa <= 3) {
			novosalario = (salario * 110) / 100;
			System.out.println("Seu novo sálario é igual a: R$" + novosalario);
		} else if(salario > 3000 && tempodeempresa > 3) {
			novosalario = (salario * 115) / 100;
			System.out.println("Seu novo sálario é igual a: R$" + novosalario);
		}
		sc.close();
	}

}
