package Dio;

public class Teste {

	public static void main(String[] args) {
		Singleton_Preguica preguica = Singleton_Preguica.getInstancia();
		System.out.println(preguica);
		preguica = Singleton_Preguica.getInstancia();
		System.out.println(preguica + "\n");
		
		Singleton_Apressado apressado = Singleton_Apressado.getInstancia();
		System.out.println(apressado);
		apressado = Singleton_Apressado.getInstancia();
		System.out.println(apressado + "\n");
		
		Singleton_Suporte suporte =  Singleton_Suporte.getInstancia();
		System.out.println(suporte);
		suporte = Singleton_Suporte.getInstancia();
		System.out.println(suporte + "\n");
	}
}
