package exercicios;

//Crie uma classe Carro com os atributos modelo, ano, e cor. Crie dois objetos da classe e exiba seus atributos. 

public class Carro {
	//Definição dos atributos de carro
	private String modelo;
	private String cor;
	private int ano;
	
	//Construtor para inicializar os atributos
	public Carro(String modelo, String cor, int ano) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}
	//Método para exibir os atributos
	public void exibiratributoscarro() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Cor: " + cor);
	}
	
	public static void main(String[] args) {
		Carro carro = new Carro("Gol", "Prata", 2009);
		Carro carro1 = new Carro("Palio", "Preto", 2009);
		
		carro.exibiratributoscarro();
		carro1.exibiratributoscarro();
	}
}
