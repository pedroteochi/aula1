package semana07;

public class PersistePJ {
    public static void main(String[] args) {
        // Criando uma instância de PessoaJuridicaPersistente
        PessoaJuridicaPersistente p = new PessoaJuridicaPersistente();
        p.cnpj = "12345678901";
        p.inscricao = "12345678";
        p.id = 1;
        p.nome = "Pedro";

        // Gravando o objeto no arquivo
        System.out.println(p.gravar());

        // Lendo o objeto do arquivo
        PessoaJuridica pj = PessoaJuridicaPersistente.ler("12345678901");

        System.out.println(pj.id);
        System.out.println(pj.nome);
        System.out.println(pj.cnpj);
        System.out.println(pj.inscricao);
        
         
            
        }
    
    }
