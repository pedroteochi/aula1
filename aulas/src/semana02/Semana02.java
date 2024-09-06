package semana02;

import javax.swing.JOptionPane;

public class Semana02 {

    public static void main(String[] args) {
        int largura = Integer.parseInt(
            JOptionPane.showInputDialog("Entre com a largura:")
        );
        
        int comprimento = Integer.parseInt(
            JOptionPane.showInputDialog("Entre com o comprimento:")
        );
        
        int area = largura * comprimento;
        
        JOptionPane.showMessageDialog(null, "A área é: " + area);
    }
}
