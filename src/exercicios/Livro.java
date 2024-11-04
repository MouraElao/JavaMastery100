package exercicios;

//Crie uma classe Livro com os atributos título, autor, e ano. Crie dois objetos e exiba seus dados. 

public class Livro {
	//Definição dos atributos de livro
	private String titulo;
	private String autor;
	private int ano;
	
	//Construtor para inicializar os atributos
	public Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}
	//Metodo para exibir os atributos
	public void exibirdadosdolivro() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano: " + ano);
	}
	public static void main(String[] args) {
		Livro livro1 = new Livro("O iluminado", "Stephen King", 1977);
		Livro livro2 = new Livro("Percy Jackson e o Ladrão de raios", "Rick Riordan", 2005);
		
		livro1.exibirdadosdolivro();
		System.out.println();
		livro2.exibirdadosdolivro();
	}
}
