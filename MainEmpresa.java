package Agregacao;

public class MainEmpresa {

	public static void main(String[] args) {

		Empresa empresa = new Empresa ("Nisshinbo", "RH");
		Departamento departamento = new Departamento ("RH");
		
		System.out.println("Empresa é: " + empresa.getNome() +  " e departamento é: " + empresa.getDepartamento());
		System.out.println("Departamento é: " + departamento.getNome());
	}
}
