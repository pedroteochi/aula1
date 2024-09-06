package semana01;

import javax.swing.JOptionPane;

public class EntradaDeDados {
	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("Digite seu lindo nome: ");
		String s2 = JOptionPane.showInputDialog("Digite seu lindo sobrenome: ");
		
		JOptionPane.showMessageDialog(null, s1 + "\n" + s2);
		

	}
}
