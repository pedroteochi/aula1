package semana06;

public class Galinha {

    private int id;
    private String cor;
    private float peso, preco;
    private int qtdeDias;
    private final int PRODUCAO_DIARIA_OVOS_ATE_5_ANOS = 5;
    private final int PRODUCAO_DIARIA_OVOS_5_10_ANOS = 1;
    private final float PRODUCAO_DIARIA_OVOS_10_ANOS = 0.5f;

    public Galinha() {
    }

    public Galinha(int id, String cor, float peso, float preco, int qrdeDias) {
        this.id = id;
        this.cor = cor;
        this.peso = peso;
        this.preco = preco;
        this.qtdeDias = qrdeDias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQrdeDias(int qrdeDias) {
        this.qtdeDias = qrdeDias;
    }

    public void mostrar() {
        System.out.println("ID: " + id);
        System.out.println("Cor: " + cor);
        System.out.println("Peso: " + peso);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade de dias: " + qtdeDias);
    }

    public String toString() {
        return "[" + id + ";" + cor + ";" + peso + ";" + preco + ";" + qtdeDias + "]";

    }
}