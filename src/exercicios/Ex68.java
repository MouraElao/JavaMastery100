package exercicios;

// Faça uma função que receba uma lista de números e retorne o maior. 

public class Ex68 {

	public static int retornamaior(int [] n) {
		int maior = 0;
		for(int i:n) {
			if(i > maior) {
				maior = i;
			}
		}
		return maior;
	}
	public static void main(String[] args) {
		int[] numeros = {10, 20, 776, 999, 11};
		
		int resultado = retornamaior(numeros);
		
		System.out.println(resultado);
	}

}
