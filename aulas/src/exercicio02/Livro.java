package exercicio02;

import java.util.List;

public class Livro {
    private String titulo;
    private Autor autor;
    private List<Imagem> imagens;
    private List<Capitulo> capitulos;

    public Livro(String titulo, Autor autor, List<Imagem> imagens, List<Capitulo> capitulos) {
        this.titulo = titulo;
        this.autor = autor;
        this.imagens = imagens;
        this.capitulos = capitulos;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public List<Imagem> getImagens() {
        return imagens;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void exibirDetalhes() {
        System.out.println("Título do livro: " + titulo);
        autor.exibirDetalhes();
        System.out.println("Capítulos:");
        for (Capitulo cap : capitulos) {
            cap.exibirDetalhes();
        }
        System.out.println("Imagens:");
        for (Imagem img : imagens) {
            img.exibirImagem();
        }
    }
}

