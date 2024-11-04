package exercicios;

//Faça uma função que receba um número e retorne os seus divisores. 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex80 {

    public static List<Integer> obterDivisores(int numero) {
        // Lista para armazenar os divisores do número
        List<Integer> divisores = new ArrayList<>();
        
        // Loop para encontrar todos os divisores
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) { // Se o número é divisível por i, ele é um divisor
                divisores.add(i);
            }
        }
        
        return divisores; // Retorna a lista de divisores
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para encontrar seus divisores: ");
        int numero = scanner.nextInt();

        List<Integer> divisores = obterDivisores(numero);

        System.out.println("Os divisores de " + numero + " são: " + divisores);

        scanner.close();
    }
}

