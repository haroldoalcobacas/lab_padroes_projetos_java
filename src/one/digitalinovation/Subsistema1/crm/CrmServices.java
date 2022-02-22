package one.digitalinovation.Subsistema1.crm;

public class CrmServices {
	
	private CrmServices() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println(" Cliente Salvo no sistema CRM.");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}
}
