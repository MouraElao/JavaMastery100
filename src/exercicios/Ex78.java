package exercicios;

//Faça uma função que retorne o dobro de um número. 

import java.util.Scanner;

public class Ex78 {

    public static int calcularDobro(int numero) {
        // Calcula e retorna o dobro do número
        return numero * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o dobro: ");
        int numero = scanner.nextInt();

        int dobro = calcularDobro(numero);

        System.out.println("O dobro de " + numero + " é: " + dobro);

        scanner.close();
    }
}
