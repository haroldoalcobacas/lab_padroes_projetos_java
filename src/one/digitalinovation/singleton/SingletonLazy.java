package one.digitalinovation.singleton;
/**
 * Singleton "preguiçoso".
 * @author HAROLDO
 *
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	// criar um construtor privado para que não possa ser instanciado 
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
