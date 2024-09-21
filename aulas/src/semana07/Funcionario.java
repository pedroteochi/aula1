package semana07;

import javax.swing.JOptionPane;

public class Funcionario extends PessoaFisica {
    
    private int codigo;
    protected double salario;

    public void mostrar() {
        super.mostrar();
        System.out.println(salario);
    }



    public void digitar() {
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID"));
        nome = JOptionPane.showInputDialog("Digite o nome");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
    }

}
