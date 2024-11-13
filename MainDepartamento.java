package Associacao;

public class MainDepartamento {

	public static void main (String[] args) {

		Departamento departamento = new Departamento ("RH");
		Professor professor = new Professor ("Fábio", departamento);

		System.out.println("O departamento é: " + departamento.getNome());
		System.out.println("O professor é: " + professor.getNome() + " e o departamento é: " + professor.getDepartamento());

	}
}