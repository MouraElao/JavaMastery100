package exercicios;

//Faça uma função que receba o salário de um funcionário e calcule o valor do aumento. 

import java.util.Scanner;

public class Ex76 {

    public static double calcularAumento(double salario, double percentualAumento) {
        // Calcula o valor do aumento
        double aumento = salario * (percentualAumento / 100);
        // Retorna o novo salário com o aumento
        return salario + aumento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário atual do funcionário: ");
        double salario = scanner.nextDouble();
        
        System.out.print("Digite o percentual de aumento (%): ");
        double percentualAumento = scanner.nextDouble();
        
        double novoSalario = calcularAumento(salario, percentualAumento);
        
        System.out.printf("O novo salário do funcionário com aumento é: R$ %.2f%n", novoSalario);
        
        scanner.close();
    }
}
