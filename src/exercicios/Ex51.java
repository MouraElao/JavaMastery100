package exercicios;

//Escreva um programa que exiba os primeiros 20 números múltiplos de 3. 

public class Ex51 {

	public static void main(String[] args) {
		
		for(int c = 1; c <= 20; c++) {
			if(c % 3 == 0) {
				System.out.println(c);
			}
		}

	}

}
