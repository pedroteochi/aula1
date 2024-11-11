package semana10;

import java.util.ArrayList;
import java.util.List;

public class PedidoItemAgregacao {

    public int numero;
    public List<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void listarItens() {
        for (Item i : itens) {
            i.mostrar();
        }
    }

    public static void main(String[] args) {
        PedidoItemAgregacao pedido = new PedidoItemAgregacao();

        Item i1 = new Item();
        i1.nomeProduto = "Notebook";
        i1.quantidade = 1;
        i1.preco = 100.0;

        Item i2 = new Item();
        i2.nomeProduto = "Mouse";
        i2.quantidade = 2;
        i2.preco = 50.0;

        pedido.adicionarItem(i1);
        pedido.adicionarItem(i2);

        pedido.listarItens();
    }
}

class Item {
    public String nomeProduto;
    public int quantidade;
    public double preco;

    public void mostrar() {
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + preco);
    }
}
