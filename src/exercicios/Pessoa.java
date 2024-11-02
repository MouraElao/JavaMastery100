package exercicios;

//Crie uma classe Pessoa com um atributo nome. Atribua um nome e exiba no console. 

public class Pessoa {
	//Atributo nome da pessoa
	private String nome;
	
	//Construtor para inicializar o nome
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	// Método para exibir nome no console
	public void exibirNome(){
		System.out.println("Nome: " + nome);
	}
	
	//Método principal para executar o código
	public static void main(String[] args) {
		// Criar uma instância da classe Pessoa
		Pessoa pessoa = new Pessoa("João");
				
		// Chamar o método para exibir o nome
		pessoa.exibirNome();
	}
}
