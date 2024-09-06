package exercicios01;

import javax.swing.JOptionPane;

public class ExerEntSaid01 {
    public static void main(String[] args) {

       
        String a = JOptionPane.showInputDialog("Entre com o primeiro número: ");
        String b = JOptionPane.showInputDialog("Entre com o segundo número: ");
        
       
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        
        
        int plus = num1 + num2;
        int minus = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        
       
        String message = "A soma dos números é: " + plus + "\n" +
                         "A subtração dos números é: " + minus + "\n" +
                         "A multiplicação dos números é: " + multiply + "\n" +
                         "A divisão dos números é: " + divide;
        
        
        JOptionPane.showMessageDialog(null, message);
    }
}
