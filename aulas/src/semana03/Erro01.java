package semana03;

import javax.swing.JOptionPane;

public class Erro01 {
	
	public static void main(String[] args ) {
		while(true) {
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade? "));

			JOptionPane.showMessageDialog(null,"Idade digitada" + idade);
		
		}catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Digite um valor inteiro" + erro.getMessage());
		}
		finally {
			JOptionPane.showMessageDialog(null, "FIM");
		}
		}
	}}


