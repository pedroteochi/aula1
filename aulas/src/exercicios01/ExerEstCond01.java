package exercicios01;

import javax.swing.JOptionPane;

public class ExerEstCond01 {
    public static void main(String[] args) {
        
        String[] numeroPorExtenso = { 
            "zero", "um", "dois", "três", "quatro", "cinco", 
            "seis", "sete", "oito", "nove", "dez", "onze", 
            "doze", "treze", "quatorze", "quinze", "dezesseis", 
            "dezessete", "dezoito", "dezenove", "vinte" 
        };

       int numero =-1;
       do {
            String input = JOptionPane.showInputDialog("Insira um número entre 0 e 20:");
            
            try {
                numero = Integer.parseInt(input);
                
                if(numero >= 0 && numero <= 20) {
                    String numeroExtenso = numeroPorExtenso[numero];
                    JOptionPane.showMessageDialog(null, "O número " + numero + " por extenso é: " + numeroExtenso);
                } else {
                    JOptionPane.showMessageDialog(null, "Digite um número válido entre 0 e 20.");
                }
                
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada de número inválida, digite um número válido.");
            }

        } while(numero < 0 || numero > 20);
    }
}
