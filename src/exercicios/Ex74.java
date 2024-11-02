package exercicios;

//Faça uma função que receba uma lista de números e retorne a soma de todos os números pares. 

public class Ex74 {
    
    public static int somaPares(int[] numeros) {
        int soma = 0;
        
        // Percorre cada número na lista
        for (int numero : numeros) {
            // Verifica se o número é par
            if (numero % 2 == 0) {
                // Adiciona o número par à soma
                soma += numero;
            }
        }
        
        return soma; // Retorna a soma total dos números pares
    }

    public static void main(String[] args) {
        int[] numeros = {10, 5, 8, 3, 4, 6, 7, 12};
        
        int somaDePares = somaPares(numeros);
        
        System.out.println("A soma dos números pares é: " + somaDePares);
    }
}
