package exercicios;

//Faça um programa que calcule a soma dos números ímpares entre 1 e 50. 

public class Ex48 {

	public static void main(String[] args) {
		int somaimpar = 0;
		
		for(int c = 1; c <= 50; c++) {
			if(c % 2 != 0) {
				somaimpar += 1;
			}
		}
		System.out.println("A soma dos numeros impares digitados é igual a: " + somaimpar);
	}

}
