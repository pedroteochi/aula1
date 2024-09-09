package semana05;

public class Impressora {
	
	public synchronized static void imprimir (String texto) {
		for(int i = 1; i <=10; i++) {
			System.out.println(texto + " " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){}
			
		}
	}

}
