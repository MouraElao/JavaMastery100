package exercicios;

// Crie um programa que exiba a sequência de Fibonacci até o décimo termo. 

public class Ex53 {

	public static void main(String[] args) {
		
		int n1 = 0, n2 = 1, nextTerm;
		
		System.out.print("Sequência de Fibonacci até o 10º termo:");
		
		// Exibe os dois primeiros termos
		System.out.print(n1 + ", " + n2);
		
		//calcula e exibe os próximos 8 termos
		for(int i = 2; i < 10; i++) {
			nextTerm = n1 + n2;
			System.out.print(", " + nextTerm);
			
			// Atualiza os valores para a próxima iteração
			n1 = n2;
			n2 = nextTerm;
		}
	}

}
