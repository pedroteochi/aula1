package semana07;

public class UsaPessoa {
    public static void main(String[] args) {
       // Pessoa p1 = new Pessoa(); 
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();

        pj.digitar();
        pj.mostrar();

        pf.id = 1;
        pf.nome = "Pedro";
        pf.cpf = "12345678901";
        pf.rg = "12345678";
    }
}
