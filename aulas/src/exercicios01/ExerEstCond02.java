package exercicios01;

import javax.swing.JOptionPane;

public class ExerEstCond02 {

    public static void main(String[] args) {
        
        
        String input = JOptionPane.showInputDialog("Insira um número:");
        
        try {
            
            int numero = Integer.parseInt(input);
            int resultado;
            
            
            if (numero > 0) {
                
                resultado = numero * 2;
                JOptionPane.showMessageDialog(null, "O número é positivo. O dobro de " + numero + " é " + resultado);
            } else {
                
                resultado = numero * 3;
                JOptionPane.showMessageDialog(null, "O número é negativo. O triplo de " + numero + " é " + resultado);
            }
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número inteiro.");
        }
    }
}
