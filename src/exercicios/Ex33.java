package exercicios;

import java.util.Scanner;

// Programa que verifica se três números podem formar um triângulo retângulo

public class Ex33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        double a = sc.nextDouble();
        System.out.println("Digite o segundo lado: ");
        double b = sc.nextDouble();
        System.out.println("Digite o terceiro lado: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (isRightTriangle(a, b, c)) {
                System.out.println("Os números podem formar um triângulo retângulo.");
            } else {
                System.out.println("Os números podem formar um triângulo, mas não é retângulo.");
            }
        } else {
            System.out.println("Os números não podem formar um triângulo.");
        }

        sc.close();
    }

    // Método para verificar se é um triângulo retângulo
    private static boolean isRightTriangle(double a, double b, double c) {
        // Acha o maior lado
        double max = Math.max(a, Math.max(b, c));
        double sumOfSquares = a * a + b * b + c * c - max * max;
        return (max * max == sumOfSquares);
    }
}

