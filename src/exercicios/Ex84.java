package exercicios;

//Faça uma função que receba dois números e retorne o maior. 

public class Ex84 {

    public static int retornarMaior(int a, int b) {
        if (a > b) {
            return a; // Retorna 'a' se 'a' for maior que 'b'
        } else {
            return b; // Retorna 'b' se 'b' for maior ou igual a 'a'
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        
        int maiorNumero = retornarMaior(num1, num2);
        
        System.out.println("O maior número é: " + maiorNumero);
    }
}
