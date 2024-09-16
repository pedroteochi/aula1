package semana06;

public class Galinha {

    private String id;
    private String cor;
    private float peso;
    private float preco;
    private int qtdeDias;
    private static final int QUANTIDADE_DIAS_ANO = 365;
    private static final int PRIMEIROS_CINCO_ANOS_GALINHA = 2;
    private static final int DEPOIS_CINCO_ANOS_GALINHA = 1;
    private static final double DEPOIS_DEZ_ANOS_GALINHA = 0.5;
    private static final int MAX_DIAS = 12 * 365; 


    // Construtor padrão
    public Galinha() {
    }

    // Construtor com parâmetros
    public Galinha(String id, String cor, float peso, float preco, int qtdeDias) {
        setId(id);
        setCor(cor);
        setPeso(peso);
        setPreco(preco);
        setQtdeDias(qtdeDias);
    }

    // Getters e Setters com validação
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.isEmpty() || (!cor.equalsIgnoreCase("branca") && !cor.equalsIgnoreCase("amarela")
                && !cor.equalsIgnoreCase("preta"))) {
            throw new IllegalArgumentException("A cor deve ser 'branca', 'amarela' ou 'preta'.");
        }
        this.cor = cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }
        this.peso = peso;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero.");
        }
        this.preco = preco;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQtdeDias(int qtdeDias) {
        if (qtdeDias < 0 || qtdeDias > MAX_DIAS) {
            throw new IllegalArgumentException("Quantidade de dias deve ser entre 0 e 12 anos.");
        }
        this.qtdeDias = qtdeDias;
    }

    // Método que calcula a produção diária de ovos
    public double getOvosPorDia() {
        int anos = qtdeDias / QUANTIDADE_DIAS_ANO;
        if (anos <= 5) {
            return PRIMEIROS_CINCO_ANOS_GALINHA;
        } else if (anos <= 10) {
            return DEPOIS_CINCO_ANOS_GALINHA;
        } else{
            return DEPOIS_DEZ_ANOS_GALINHA;
        }
    }

    // Método que calcula a produção total de ovos
    public double getTotalOvosProduzidos() {
        double totalOvos = 0;

        // Produção nos primeiros 5 anos
        int diasNosPrimeirosCincoAnos = Math.min(qtdeDias, 5 * QUANTIDADE_DIAS_ANO);
        totalOvos += diasNosPrimeirosCincoAnos * PRIMEIROS_CINCO_ANOS_GALINHA;

        // Produção nos próximos 5 anos
        int diasNosProximosCincoAnos = Math.min(Math.max(qtdeDias - (5 * QUANTIDADE_DIAS_ANO), 0), 5 * QUANTIDADE_DIAS_ANO);
        totalOvos += diasNosProximosCincoAnos * DEPOIS_CINCO_ANOS_GALINHA;

        // Produção após os 10 anos
        int diasDepoisDeDezAnos = Math.max(qtdeDias - (10 * QUANTIDADE_DIAS_ANO), 0);
        totalOvos += diasDepoisDeDezAnos * DEPOIS_DEZ_ANOS_GALINHA;

        return totalOvos;
    }

    // Método que retorna a idade em anos
    protected int getIdadeEmAnos() {
        return qtdeDias / 365;
    }

    // Método para exibir os dados da galinha
    public void mostrar() {
        System.out.println("ID: " + id);
        System.out.println("Cor: " + cor);
        System.out.println("Peso: " + peso);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade de dias: " + qtdeDias);
    }

    // Método toString para representar a galinha como uma string
    @Override
    public String toString() {
        return "[" + id + ";" + cor + ";" + peso + ";" + preco + ";" + qtdeDias + "]";
    }
}
