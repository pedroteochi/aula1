package semana09;

public class Cargo {
    public int id;
    public String nome;

    public Funcionario[] funcionario;

    public Cargo(){
        
    }

    public Cargo(int id, String nome, Funcionario[] funcionario) {
        this.id = id;
        this.nome = nome;
        this.funcionario = funcionario;
    }

    public void mostrar() {
        System.out.println(id);
        System.out.println(nome);
        System.out.println("Relação de funcionarios");
        for(int i = 0; i < funcionario.length; i++) {
            System.out.println(funcionario[i].id);
            System.out.println(funcionario[i].nome);
        }
    }
}
