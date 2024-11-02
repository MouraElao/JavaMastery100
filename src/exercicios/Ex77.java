package exercicios;

//Crie uma função que retorne a raiz quadrada de um número. 

import java.util.Scanner;

public class Ex77 {

    public static double calcularRaizQuadrada(double numero) {
        // Calcula e retorna a raiz quadrada do número
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para calcular a raiz quadrada: ");
        double numero = scanner.nextDouble();
        
        double raiz = calcularRaizQuadrada(numero);
        
        System.out.printf("A raiz quadrada de %.2f é: %.2f%n", numero, raiz);
        
        scanner.close();
    }
}
