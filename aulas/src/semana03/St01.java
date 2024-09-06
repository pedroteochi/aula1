package semana03;

public class St01 {
	public static void main (String[] args) throws InterruptedException{
		
		String s = "0123456789abcdefghijklmnopaqrstuvwxyz!@#$%¨&*()";
		
		String senha = "";
		
		for(int i = 0; i < 6; i++) {
			int indice = (int)(Math.random()*s.length());
			char c  = s.charAt(indice);
			senha += c;
			System.out.println(senha);
		}
		
		
		
		
		
	}

}
