package one.digitalinovation.singleton;

/**
 * Singleton "apressado".
 * @author HAROLDO
 *
 */
public class SingletonEager {

	// função apenas de incapsular a instancia 
	
		public static SingletonEager instancia = new SingletonEager();
	 
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		
		return instancia;
	}
	}





