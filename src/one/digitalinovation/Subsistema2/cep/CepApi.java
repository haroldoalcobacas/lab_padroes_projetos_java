package one.digitalinovation.Subsistema2.cep;

import one.digitalinovation.singleton.SingletonEager;

public class CepApi {

					
			public static CepApi instancia = new CepApi();
		 
		private CepApi() {
			super();
		}
		
		public static CepApi getInstancia() {
			return instancia;
		}
		
		public String recuperarCidade(String cep) {
			return "Sao Luis";
		}
		public String recuperarEstado(String cep) {
			return "Maranhao";
		}
}


