package exercicios;

//Crie uma função que receba um número e retorne o número invertido. 

public class Ex85 {

    public static int inverterNumero(int numero) {
        int invertido = 0; // Inicializa o número invertido como 0
        
        while (numero != 0) {
            int digito = numero % 10; // Extrai o último dígito
            invertido = invertido * 10 + digito; // Adiciona o dígito ao número invertido
            numero /= 10; // Remove o último dígito do número original
        }
        
        return invertido; // Retorna o número invertido
    }

    public static void main(String[] args) {
        int numero = 12345; // Exemplo de número a ser invertido
        
        int numeroInvertido = inverterNumero(numero);
        
        System.out.println("Número invertido: " + numeroInvertido);
    }
}
