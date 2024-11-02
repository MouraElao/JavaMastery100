package exercicios;

import java.util.Scanner;

// Programa que verifica se o segundo número é múltiplo do primeiro

public class Ex34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = sc.nextInt();

        if (segundoNumero % primeiroNumero == 0) {
            System.out.println(segundoNumero + " é múltiplo de " + primeiroNumero + ".");
        } else {
            System.out.println(segundoNumero + " não é múltiplo de " + primeiroNumero + ".");
        }

        sc.close();
    }
}
