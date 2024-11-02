package exercicios;

//Crie uma função que receba uma lista de números e retorne a quantidade de números pares. 

public class Ex83 {

    public static int contarPares(int[] numeros) {
        int quantidadePares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                quantidadePares++;
            }
        }
        return quantidadePares;
    }

    public static void main(String[] args) {
        int[] listaNumeros = {10, 15, 8, 3, 22, 7, 4};
        
        int quantidadeDePares = contarPares(listaNumeros);
        
        System.out.println("A quantidade de números pares é: " + quantidadeDePares);
    }
}
