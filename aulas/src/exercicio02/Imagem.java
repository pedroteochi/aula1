package exercicio02;

public class Imagem {
    private String url;
    private String descricao;

    public Imagem(String url, String descricao) {
        this.url = url;
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public String getDescricao() {
        return descricao;
    }

    public void exibirImagem() {
        System.out.println("Imagem URL: " + url);
        System.out.println("Descrição: " + descricao);
    }
}
