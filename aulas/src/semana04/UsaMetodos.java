package semana04;

import javax.swing.JOptionPane;

public class UsaMetodos {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de n1: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de n2: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de n3: "));
		
		
		JOptionPane.showMessageDialog(null, MetodosComRetorno.somar(n1,n2,n3));
	}

}
