package one.digitalinovation.singleton;
/**
 * Singleton "Lazy Holder".
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author HAROLDO
 *
 */
public class SingletonLazyHolder {

	private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	 
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		
		return instancia;
	}
}




