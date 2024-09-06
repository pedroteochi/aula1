package semana04;

public class Calculadora {

	public static void somar(int a, int b) {
		
		System.out.println("somar 1");
		System.out.println(a + b);
	}

	public static void somar(int a, int b, int c) {
		System.out.println("Somar 2");
		System.out.println(a + b + c);
	}
	public static void somar(int[] vetor) {
		System.out.println("Somar 3");
		
		int total = 0;
		
		for (int v : vetor) {
			total += v;
		}
		System.out.println(total);
	}
	

public static void somar(float... vetor) {
	System.out.println("Somar 3");
	
	int total = 0;
	
	for (float v : vetor) {
		total += v;
	}
	System.out.println(total);
}
	
}
