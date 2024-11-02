package exercicios;

import java.util.Scanner;

// Programa que calcula a média das notas de 5 alunos

public class Ex35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int numeroDeAlunos = 5;

        for (int i = 1; i <= numeroDeAlunos; i++) {
            System.out.println("Digite a nota do aluno " + i + ": ");
            double nota = sc.nextDouble();
            soma += nota; // Adiciona a nota à soma total
        }

        double media = soma / numeroDeAlunos; // Calcula a média
        System.out.println("A média da turma é: " + String.format("%.2f", media)); // Exibe a média com 2 casas decimais

        sc.close();
    }
}
