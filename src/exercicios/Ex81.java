package exercicios;

//Crie uma função que receba uma lista de números e retorne a média deles. 

import java.util.Scanner;

public class Ex81 {

    public static double calcularMedia(int[] numeros) {
        int soma = 0;

        // Soma todos os números da lista
        for (int numero : numeros) {
            soma += numero;
        }

        // Calcula a média dividindo a soma pelo número de elementos
        return (double) soma / numeros.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você deseja inserir? ");
        int quantidade = scanner.nextInt();
        int[] numeros = new int[quantidade];

        // Recebe os números do usuário
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        double media = calcularMedia(numeros);

        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
