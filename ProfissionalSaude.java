package Polimorfismo;

public class ProfissionalSaude {

	protected String nome;
	protected String especialidade;
	protected int valorConsulta;
	protected String agendarConsulta;

	public ProfissionalSaude(String nome, String especialidade, int valorConsulta, String agendarConsulta) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.valorConsulta = valorConsulta;
		this.agendarConsulta = agendarConsulta;
	}
	
	public void exibirInfo() {
		System.out.println("Nome: " + nome + " | Especialidade: " + especialidade + " | Valor da consulta: " + valorConsulta + " | Agendar consulta: " + agendarConsulta);
	}
}