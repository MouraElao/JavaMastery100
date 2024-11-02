package exercicios;

//Escreva um programa que imprima todos os números primos entre 1 e 100. 

public class Ex60 {

	public static void main(String[] args) {
		
		// Loop para percorrer de 1 a 100
		for(int num = 2; num <= 100; num++) {
			boolean isPrimo = true; // Variável que determina se o número é primo
			
			// Verificar se 'num' é divisivel por qualquer numero entre 2 num-1 (raiz quadrada de num)
			for(int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
				if(num % divisor == 0) {
					isPrimo = false;
					break;
				}
			}
			
			// Se ainda for primo após a verificação, imprimimos o número
			if(isPrimo) {
				System.out.println(num);
			}
		}

	}

}
