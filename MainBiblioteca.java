package Associacao;

public class MainBiblioteca {

	public static void main (String[] args) {

		Biblioteca biblioteca = new Biblioteca ("CE-124");
		Livro livro = new Livro ("Os Lusíadas", biblioteca);

		System.out.println("A biblioteca é: " + biblioteca.getNome());
		System.out.println("O livro é: " + livro.getNome() + " da biblioteca " + livro.getBiblioteca());
	}
}