package semana05;

public class Word01 extends Thread{
	
	String texto = "Apostila de Java";

	public void run () {
		Impressora.imprimir(texto);
	}
}
