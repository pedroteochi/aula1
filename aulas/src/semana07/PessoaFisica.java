package semana07;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa {

    public String rg, cpf;

    public void digitar(){
        super.digitar();
        rg = JOptionPane.showInputDialog("Digite o rg");
        cpf = JOptionPane.showInputDialog("Digite o cpf");
    }
}
