package Herança;

public abstract class Veiculo {

	protected String marca;
	protected String modelo;
	protected int ano;
	protected String cor;

	public Veiculo (String marca, String modelo, int ano, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}

	public void exibirInfo() {
		System.out.println("Marca: " + marca +" | Modelo: " + modelo + " | Ano: " + ano + " | Cor: " + cor);
	}
}
