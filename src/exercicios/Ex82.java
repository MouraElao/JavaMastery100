package exercicios;

//Faça uma função que receba o ano de nascimento e calcule a idade. 

import java.util.Scanner;
import java.time.Year;

public class Ex82 {

    public static int calcularIdade(int anoNascimento) {
        int anoAtual = Year.now().getValue(); // Obtém o ano atual
        return anoAtual - anoNascimento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = calcularIdade(anoNascimento);

        System.out.println("A idade é: " + idade + " anos.");

        scanner.close();
    }
}
