package exercicios;

import java.util.Scanner;

// Programa que calcula o imposto de renda baseado no salário informado

public class Ex30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário bruto: ");
        double salario = sc.nextDouble();
        double imposto = 0;

        if (salario <= 2112) {
            System.out.println("Você está isento de imposto de renda.");
        } else if (salario <= 2826.65) {
            imposto = (salario * 0.075) - 158.40;
        } else if (salario <= 3751.05) {
            imposto = (salario * 0.15) - 370.40;
        } else if (salario <= 4664.68) {
            imposto = (salario * 0.225) - 651.73;
        } else {
            imposto = (salario * 0.275) - 884.96;
        }

        if (imposto > 0) {
            System.out.println("O valor do imposto de renda a ser pago é: R$ " + String.format("%.2f", imposto));
        }

        sc.close();
    }
}
