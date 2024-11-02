package exercicios;

//Faça um programa que imprima os múltiplos de 5 entre 1 e 100. 

public class Ex55 {

	public static void main(String[] args) {
		
		for(int c = 1; c <= 100; c++) {
			if(c % 5 == 0) {
				System.out.println(c);
			}
		}

	}

}
