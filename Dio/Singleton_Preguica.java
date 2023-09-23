package Dio;

public class Singleton_Preguica {

	private static Singleton_Preguica instancia;
	private Singleton_Preguica() {
		super();
	}
	public static Singleton_Preguica getInstancia() {
		if(instancia == null) {
			instancia = new Singleton_Preguica();
		
	}
		return instancia;	
  }
}