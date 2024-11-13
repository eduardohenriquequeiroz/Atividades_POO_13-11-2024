package Polimorfismo;

public class PrincipalProfissionalSaude {

	public static void main(String[] args) {

		Medico medico = new Medico ("Eduardo", "Anestesiologia", 500, "23/11/2024", "CRM/SP 123456");
		Dentista dentista = new Dentista ("Mauro", "Odontologia", 70, "04/12/2024", "Dr. Fulano de Tal. CROGO-xxxx");
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta ("John", "Esportiva", 90, "07/12/2024", "1234");

		medico.exibirInfo();
		System.out.println();
		dentista.exibirInfo();
		System.out.println();
		fisioterapeuta.exibirInfo();
	}
}
