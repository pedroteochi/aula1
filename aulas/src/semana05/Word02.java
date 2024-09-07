package semana05;

public class Word02 extends Thread{
	
	String texto = "Apostila de phyton";

	public void run () {
		Impressora.imprimir(texto);
	}
}
