package Dio;

public class Singleton_Apressado {
	private static Singleton_Apressado instancia = new Singleton_Apressado();
	private Singleton_Apressado() {
		super();
	}
	public static Singleton_Apressado getInstancia() {
		return instancia;
	}
}
