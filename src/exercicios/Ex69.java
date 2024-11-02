package exercicios;

//Crie uma função que receba uma lista de números e retorne o menor. 

public class Ex69 {
	public static int retornamenor(int [] m) {
		int menor = m[0];
		for(int n : m) {
			if(n < menor) {
				menor = n;
			}
		}
		return menor;
	}
	public static void main(String[] args) {
		int [] numeros = {0, 90, 78, 1, 10};
		
		int menornumero = retornamenor(numeros);
		
		System.out.println("O menor numero da lista é: " + menornumero);
	}

}
