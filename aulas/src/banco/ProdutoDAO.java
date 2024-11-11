package banco;

import java.sql.SQLException;

public class ProdutoDAO implements DAO{

    public Produto produto;
    public BD bd;
    private String sql, men;

    public ProdutoDAO() {
        produto = new Produto();
        bd = new BD();
    }

    @Override
    public String inserir() {
        sql = "insert into produtos values (null, ?, ?, ?)";
        bd.getConnection();
        try{
            bd.st = bd.con.prepareStatement(sql);
            bd.st.setString(1, produto.getNome());
            bd.st.setDouble(2, produto.getPreco());
            bd.st.setInt(3, produto.getEstoque());
            bd.st.executeUpdate();
            men = "Produto inserido com sucesso!";
        }
        catch(SQLException e){
            men = "Erro ao inserir o produto!"+ e;
        }
        finally{
            bd.close();
        }

        return null;
    }

    @Override
    public String alterar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }

    @Override
    public String excluir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

}
