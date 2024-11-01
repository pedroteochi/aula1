package exercicio02;

public class Capitulo {
    private String titulo;
    private int numeroDePaginas;

    public Capitulo(String titulo, int numeroDePaginas) {
        this.titulo = titulo;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void exibirDetalhes() {
        System.out.println("Título do capítulo: " + titulo);
        System.out.println("Número de páginas: " + numeroDePaginas);
    }
}
