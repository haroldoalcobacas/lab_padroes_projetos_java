package one.digitalinovation.facade;

import one.digitalinovation.Subsistema1.crm.CrmServices;
import one.digitalinovation.Subsistema2.cep.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		CrmServices.gravarCliente(nome,cep,cidade,estado);
		
	}
}
