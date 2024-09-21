package semana07;

import java.io.Serializable;

import javax.swing.JOptionPane;

public class PessoaJuridica extends Pessoa implements Serializable {
    public String cnpj, inscricao;

    public void mostrar() {
        super.mostrar();
        System.out.println(id);
        System.out.println(nome);
        System.out.println(cnpj);
        System.out.println(inscricao);
    }

    public void digitar() {
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID"));
        nome = JOptionPane.showInputDialog("Digite o nome");
        cnpj = JOptionPane.showInputDialog("Digite o CNPJ");
        inscricao = JOptionPane.showInputDialog("Digite a inscrição");
    }
}
