package exercicios;

//Faça um programa que imprima a soma dos números de 1 a 50. 

public class Ex58 {

	public static void main(String[] args) {
		
		int somador = 0;
		for(int c = 1; c <= 50; c++) {
			somador += c;
		}
		System.out.println("A soma dos numeros de 1 a 50 é: " + somador);
	}

}
