package semana09;

public class UsaFuncionario {
    public static void main(String[] args) {

        Cargo c = new Cargo();
        c.id = 1;
        c.nome = "Programador";
        
        Mesa m = new Mesa();
        m.id = 1;
        m.material = "madeira";
        m.descricao = "mesa retangular medindo 2 x 1 ";

        Funcionario f1 = new Funcionario(1, "Pedro", null); //associação
        Funcionario f2 = new Funcionario(2, "Paula", m); //associação
        Funcionario f3 = new Funcionario(3, "João", m, c); 

        f1.mostrar();
        f2.mostrar();
        f3.mostrar();
    }
}
