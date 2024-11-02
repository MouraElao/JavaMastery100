package exercicios;

//Crie uma função que calcule o valor de uma conta de restaurante com gorjeta de 10%. 

import java.util.Scanner;

public class Ex75 {

    public static double calcularConta(double valorConta) {
        // Calcula o valor total com a gorjeta de 10%
        double gorjeta = valorConta * 0.10;
        double total = valorConta + gorjeta;
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da conta: ");
        double valorConta = scanner.nextDouble();
        
        double valorTotal = calcularConta(valorConta);
        
        System.out.printf("O valor total da conta com gorjeta é: R$ %.2f%n", valorTotal);
        
        scanner.close();
    }
}
