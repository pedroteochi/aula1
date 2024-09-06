package semana02;

import javax.swing.JOptionPane;

public class Switch01 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Mês? ");
		
		switch(s) {
		case "1" : System.out.println("Janeiro");break;
		case "2" : System.out.println("Fevereiro");break;
		default: System.out.println("Desconhecido ");
		
 	}
}
}
