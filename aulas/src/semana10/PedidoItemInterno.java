package semana10;

import java.util.ArrayList;
import java.util.List;

public class PedidoItemInterno {
    public int numero;
    public List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(String nome, int quantidade, double preco) {
        ItemPedido item = new ItemPedido();
        item.nomeProduto = nome;
        item.quantidade = quantidade;
        item.preco = preco;
        itens.add(item);
    }

    public void listarItens() {
        for (ItemPedido item : itens) {
            item.mostrar();
        }
    }

    public class ItemPedido {
        public String nomeProduto;
        public int quantidade;
        public double preco;

        public void mostrar() {
            System.out.println("Produto: " + nomeProduto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preço: " + preco);
        }
    }

    public static void main(String[] args) {
        PedidoItemInterno pedido = new PedidoItemInterno();
        pedido.adicionarItem("Notebook", 1, 100.0);
        pedido.adicionarItem("Mouse", 2, 50.0);
        pedido.listarItens();
    }
}
