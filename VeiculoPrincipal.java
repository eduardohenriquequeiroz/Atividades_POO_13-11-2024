package Herança;

public class VeiculoPrincipal {

	public static void main(String[] args) {

		Automovel automovel = new Automovel ("Ferrari", "Spider", 2024, "Vermelho", 4, "V8");
		Moto moto = new Moto ("BMW", "S 1000 RR", 2024, "Branco", 4);

		automovel.exibirInfo();
		System.out.println();
		moto.exibirInfo();
	}
}
