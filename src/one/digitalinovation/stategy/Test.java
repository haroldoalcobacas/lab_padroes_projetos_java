package one.digitalinovation.stategy;

import one.digitalinovation.facade.Facade;
import one.digitalinovation.singleton.SingletonLazy;

public class Test {

	public static void main(String[]args) {
		
	// Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
	
	
	// Strategy 
	
	Comportamento defensivo = new ComportamentoDefensivo();
	Comportamento normal = new ComportamentoNormal();
	Comportamento agressivo = new ComportamentoAgressivo();
	
	Robo robo = new Robo();
	robo.setComportamento(normal);
	robo.mover();
	robo.mover();
	robo.setComportamento(defensivo);
	robo.mover();
	robo.setComportamento(agressivo);
	robo.mover();
	robo.mover();
	robo.mover();

	// Facade
	
	Facade facade = new Facade();
	facade.migrarCliente("Haroldo", "65919330");
	
	}	
}
