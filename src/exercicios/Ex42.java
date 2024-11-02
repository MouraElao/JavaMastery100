package exercicios;

//Faça um programa que imprima os 10 primeiros números ímpares. 

public class Ex42 {

	public static void main(String[] args) {
		for(int c = 1; c <= 10; c++) {
			if(c % 2 != 0) {
				System.out.println(c);
			}
		}

	}

}
