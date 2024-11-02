package exercicios;

import java.util.Scanner;

//Escreva um programa que verifique se uma senha digitada está correta (senha predefinida). 

public class Ex25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String senha = "rocky";
		String senhauser;
		
		System.out.println("Com a dica, maior lutador os filmes, primeiro nome, digite a senha: ");
		senhauser = sc.nextLine();
		
		if(senhauser.equals(senha)) {
			System.out.println("A senha está correta!!");
		} else {
			System.out.println("A senha está incorreta!!");
		}
		sc.close();
	}

}
