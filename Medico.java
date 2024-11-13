package Polimorfismo;

public class Medico extends ProfissionalSaude {

	private String crm;

	public Medico(String nome, String especialidade, int valorConsulta, String agendarConsulta, String crm) {
		super(nome, especialidade, valorConsulta, agendarConsulta);
		this.crm = crm;
	}

	@Override
	public void exibirInfo() {
		System.out.println("O crm é: " + crm);
	}
}

