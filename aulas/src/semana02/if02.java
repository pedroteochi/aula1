package semana02;

public class if02 {
	public static void main(String[] args) {
		int n1 = 20;
		int n2 = 20;
		
		if(n1 > n2) {
			System.out.println(n1);
		}
		if(n2 > n1) {
			System.out.println(n2);
		}
		if(n1 == n2) {
			System.out.println("Números iguais!");
		}
			
		//operador ternario
		
		int maior = (n1 > n2) ? n1 : n2;
		System.out.println(maior);
		
		String s = (n1 > n2) ? "n1="+n1 : (n2>n1) ? "n2" + n2 : "iguais";	
			
		System.out.println(s);
	}
}
