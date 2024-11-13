package Polimorfismo;

public class Dentista extends ProfissionalSaude{
	
	private String cro;

	public Dentista(String nome, String especialidade, int valorConsulta, String agendarConsulta, String cro) {
		super(nome, especialidade, valorConsulta, agendarConsulta);
		this.cro = cro;
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("O cro é: " + cro);
	}
}
