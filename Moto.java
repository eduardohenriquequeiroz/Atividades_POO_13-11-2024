package Herança;

public class Moto extends Veiculo {

	protected int cilindrada;

	public Moto (String marca, String modelo, int ano, String cor, int cilindrada) {
		super (marca, modelo, ano, cor);
		this.cilindrada = cilindrada;
	}

	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Cilindrada: " + cilindrada);
	}
}
