package semana04;


public class MetodosComRetorno {
	
	/**
	 * Recebe dois valores e retorna sua soma
	 * @param a - o primeiro valor
	 * @param b - o segundo valor
	 * @return - resultado da soma
	 */

	public static int somar(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	public static String parImpar(int numero) {
		String r = "ímpar";
		if(numero % 2 == 0) {
			r = "par";
		}
		return r;
	}

}

