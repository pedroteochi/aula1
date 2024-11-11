package banco;

public class ProdutoInserirTeste {
    ProdutoDAO dao = new ProdutoDAO();
    dao.produto.setId(1);
    dao.produto.setNome("Notebook");
    dao.produto.setPreco(100.0);
    dao.produto.setEstoque(10);
    
    System.out.println(dao.inserir());
}
