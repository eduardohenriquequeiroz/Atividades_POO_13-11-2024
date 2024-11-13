package Associacao;

public class Livro {
	
	private String nome;
	private Biblioteca biblioteca;

	public Livro(String nome, Biblioteca biblioteca) {
		this.setNome(nome);
		this.setBiblioteca(biblioteca);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

}
