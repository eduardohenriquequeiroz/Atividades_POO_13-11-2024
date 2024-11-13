package Polimorfismo;

public class Fisioterapeuta extends ProfissionalSaude{
	
	protected String crefito;

	public Fisioterapeuta(String nome, String especialidade, int valorConsulta, String agendarConsulta, String crefito) {
		super(nome, especialidade, valorConsulta, agendarConsulta);
		this.crefito = crefito;
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("O crefito é: " + crefito);
	}
}


