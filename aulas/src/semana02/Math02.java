package semana02;

public class Math02 {
	public static void main(String[] args) {
		for(int i=1; i<= 10; i++) {
			System.out.println(Math.random() * 100);
		}
		
		String s = "";
		for(int i=1; i < 10; i++) {
			s += (int) (Math.random() *10);
		}
		System.out.println(s);
	}

}
