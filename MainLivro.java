package Agregacao;

public class MainLivro {

	public static void main(String[] args) {


		Livro livro = new Livro ("Boca do Inferno", "Ana Miranda");
		Autor autor = new Autor ("Ana Miranda");

		System.out.println("Livro é: " + livro.getTitulo() + " e autor do livro é: " + livro.getAutor());
		System.out.println("Autor do livro Boca do Inferno é: " + autor.getNome());
	}
}