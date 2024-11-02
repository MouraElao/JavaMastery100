package exercicios;

//Crie uma função que retorne o quadrado de um número. 

import java.util.Scanner;

public class Ex79 {

    public static int calcularQuadrado(int numero) {
        // Calcula e retorna o quadrado do número
        return numero * numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o quadrado: ");
        int numero = scanner.nextInt();

        int quadrado = calcularQuadrado(numero);

        System.out.println("O quadrado de " + numero + " é: " + quadrado);

        scanner.close();
    }
}
