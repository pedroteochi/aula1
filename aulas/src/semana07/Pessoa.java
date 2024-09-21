package semana07;

import javax.swing.JOptionPane;

public abstract class Pessoa {

    public int id;
    public String nome;

    

    public Pessoa() {
      
    }

    public void mostrar() {
        System.out.println(id);
        System.out.println(nome);
    }

    public void digitar() {
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID"));
        nome = JOptionPane.showInputDialog("Digite o nome");
    }
}
