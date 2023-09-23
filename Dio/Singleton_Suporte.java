package Dio;

public class Singleton_Suporte {
	private  static class InstanciaSuporte {
		public static Singleton_Suporte instancia = new Singleton_Suporte();
	}
	private Singleton_Suporte() {
		super();
	}
	public static Singleton_Suporte getInstancia() {
		return InstanciaSuporte.instancia;
	}
}