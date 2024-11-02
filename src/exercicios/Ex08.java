package exercicios;
import java.util.Scanner;

//Crie um programa que converta graus Celsius para Fahrenheit. 

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número em graus que deseja convertar para Fahrenheit: ");
		double g = sc.nextDouble();
		double f;
		f = (g * 1.8) + 32;
		System.out.println("Você digitou: " + g + " e em Fahrenheit é igual a: " + f);
		sc.close();
	}
}
